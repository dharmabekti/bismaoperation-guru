package com.example.kianomdharmabekti.bismaoperation_guru.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.kianomdharmabekti.bismaoperation_guru.Model.APIOrder;
import com.example.kianomdharmabekti.bismaoperation_guru.Preference.SessionManager;
import com.example.kianomdharmabekti.bismaoperation_guru.R;
import com.example.kianomdharmabekti.bismaoperation_guru.REST.RestClient;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;

public class DaftarOrderActivity extends AppCompatActivity {


    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private Toolbar toolbar;
    private Call<APIOrder> callGuru;
    private RestClient.GitApiInterface service;

    private ArrayList<APIOrder.ResponBean> GuruItems = new ArrayList<APIOrder.ResponBean>();
    private Intent intent;
    SessionManager sessions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_order);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);
        rvView = (RecyclerView) findViewById(R.id.rv_mainorder);
        rvView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);
        adapter = new RecycleOrderAdapater(DaftarOrderActivity.this, GuruItems);
        rvView.setAdapter(adapter);
        sessions = new SessionManager(this);
        fetchData();


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        sessions=new SessionManager(this);


        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_favorites:
                                //profil

                                break;

                            case R.id.action_schedules:
                                //daftar order


                            case R.id.action_music:
                                //riwayat
//                                Intent intent = new Intent(DaftarOrderActivity.this, LoginActivity.class);
//                                startActivity(intent);

                                break;

                        }
                        return true;
                    }
                });

    }

    public void fetchData()
    {
        final ProgressDialog progressDialog = new ProgressDialog(DaftarOrderActivity.this,
                R.style.ProgressDialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Mengambil Data Guru...");
        progressDialog.show();


        //       String ID=sessions.getUserDetails().get(SessionManager.KEY_USERID);
        service = RestClient.getClient();
        callGuru = service.orderdetil(Integer.parseInt(sessions.getUserDetails().get(SessionManager.KEY_USERID)));
        callGuru.enqueue(new Callback<APIOrder>() {
            @Override
            public void onResponse(Response<APIOrder> response) {
                Log.d("ListGuruFetching", "Status Code = " + response.code());
                if (response.isSuccess()) {
                    // request successful (status code 200, 201)
                    APIOrder result = response.body();
                    Log.d("ListGuruFetching", "response = " + new Gson().toJson(result));
                    if (result != null) {

                        GuruItems.clear();

                        List<APIOrder.ResponBean> ResponseItems = result.getRespon();

                        if(ResponseItems!=null)
                        {
                            for (APIOrder.ResponBean Responitem : ResponseItems) {
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
