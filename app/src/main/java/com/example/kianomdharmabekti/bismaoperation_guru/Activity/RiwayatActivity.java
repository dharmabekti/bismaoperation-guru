package com.example.kianomdharmabekti.bismaoperation_guru.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.kianomdharmabekti.bismaoperation_guru.Model.APIRiwayat;
import com.example.kianomdharmabekti.bismaoperation_guru.Preference.SessionManager;
import com.example.kianomdharmabekti.bismaoperation_guru.R;
import com.example.kianomdharmabekti.bismaoperation_guru.REST.RestClient;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;

public class RiwayatActivity extends AppCompatActivity {
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private Call<APIRiwayat> callGuru;
    private RestClient.GitApiInterface service;

    private ArrayList<APIRiwayat.ResponBean> GuruItems = new ArrayList<APIRiwayat.ResponBean>();
    private Integer id;
    private String namadepan;
    private String namabelakang;
    private String tempatlahir;
    private String tanggallahir;
    private String jeniskelamin;
    private String nomortlp;
    private String emailmurid;
    private String alamatmurid;
    private Intent intent;
    Bundle extras;
    SessionManager sessions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat);
        rvView = (RecyclerView) findViewById(R.id.rv_main);
        rvView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);
        rvView.setLayoutManager(layoutManager);
        adapter = new RecycleRiwayatAdapter(RiwayatActivity.this, GuruItems);
        rvView.setAdapter(adapter);
        sessions = new SessionManager(this);
        fetchData();

        Bundle b=getIntent().getExtras();

        Log.d("LoginActivity", "Status Code = " + sessions.getUserDetails().get(SessionManager.KEY_EMAIL));

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_favorites:
                                Intent inten = new Intent(RiwayatActivity.this, BerandaActivity.class);
                                startActivity(inten);
                                break;

                            case R.id.action_schedules:
                                Intent intent = new Intent(RiwayatActivity.this, DaftarOrderActivity.class);
                                startActivity(intent);
                                break;

                            case R.id.action_music:
                                break;

                        }
                        return true;
                    }
                });
    }

    public void fetchData()
    {
        final ProgressDialog progressDialog = new ProgressDialog(RiwayatActivity.this,
                R.style.ProgressDialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Mengambil Data Guru...");
        progressDialog.show();



        service = RestClient.getClient();
        callGuru = service.riwayat(Integer.parseInt(sessions.getUserDetails().get(SessionManager.KEY_USERID)));
        callGuru.enqueue(new Callback<APIRiwayat>() {
            @Override
            public void onResponse(Response<APIRiwayat> response) {
                Log.d("ListGuruFetching", "Status Code = " + response.code());
                if (response.isSuccess()) {
                    // request successful (status code 200, 201)
                    APIRiwayat result = response.body();
                    Log.d("ListGuruFetching", "response = " + new Gson().toJson(result));
                    if (result != null) {

                        GuruItems.clear();

                        List<APIRiwayat.ResponBean> ResponseItems = response.body().getRespon();

                        if(ResponseItems!=null)
                        {
                            for (APIRiwayat.ResponBean Responitem : ResponseItems) {
                                GuruItems.add(Responitem);
                                adapter.notifyDataSetChanged();
                            }
                        }
                        progressDialog.dismiss();
                    }

                } else {
                    // response received but request not successful (like 400,401,403 etc)
                    //Handle errors
                    Toast.makeText(getApplicationContext(), "Gagal Ambil Data", Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();
                }
            }
            @Override
            public void onFailure(Throwable t) {
                Toast.makeText(getApplicationContext(), "Koneksi Ke Internet Gagal", Toast.LENGTH_SHORT).show();
                Log.d("ListGuruFetching", t.getMessage()+t.toString());
                progressDialog.dismiss();

            }
        });

    }
}
