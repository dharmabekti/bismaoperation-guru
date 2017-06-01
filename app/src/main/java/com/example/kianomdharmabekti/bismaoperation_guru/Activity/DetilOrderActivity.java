package com.example.kianomdharmabekti.bismaoperation_guru.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.kianomdharmabekti.bismaoperation_guru.Model.APICancelOrder;
import com.example.kianomdharmabekti.bismaoperation_guru.Model.APIVerifikasi;
import com.example.kianomdharmabekti.bismaoperation_guru.Preference.SessionManager;
import com.example.kianomdharmabekti.bismaoperation_guru.R;
import com.example.kianomdharmabekti.bismaoperation_guru.REST.RestClient;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;

public class DetilOrderActivity extends AppCompatActivity  implements View.OnClickListener {

    Button btnbayar,btnTelp,btnBtl;
    boolean flag;
    private RestClient.GitApiInterface service;
    private String namaDepan, harga, jk, namaBelakang, email, tempatlahir, tanggallahir, alamat, status, matapelajaran;
    private String nomorTlp, foto,totalharga,jambelajar,tanggalorder,statusorder;
    private Integer idorder;


    private Call<APIVerifikasi> callVerif;
    private Call<APICancelOrder> callCancel;
    private String idmurid;
    private int idguru;
    LinearLayout view1;

    //ImageView img;
    private ImageView gbr;

    Bitmap bi = null;

    private int SIZE = 256;
    // Red, Green, Blue
    private int NUMBER_OF_COLOURS = 3;

    public final int RED = 0;
    public final int GREEN = 1;
    public final int BLUE = 2;

    private int[][] colourBins;
    private volatile boolean loaded = false;
    private int maxY;
    ImageView profil;
    SessionManager sessions;
    EditText txtTanggalOrder,txtTotalHarga,txttotaljam,txtnama, txtharga, txttlp, txttgllahir, txtstatus, txtjk, txtnamaDepan, txtEmail, tempatLahir, txtAlamat, txtId, txtMatapelajaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detil_order);

        btnTelp=(Button) findViewById(R.id.btnTlp);
        btnBtl=(Button) findViewById(R.id.btnBatal);
        btnbayar = (Button) findViewById(R.id.btnPay);
        btnbayar = (Button) findViewById(R.id.btnPay);
        txtnama = (EditText) findViewById(R.id.tv_name);
        txttlp = (EditText) findViewById(R.id.tv_phone);
        txtjk = (EditText) findViewById(R.id.tv_gender);

        txtEmail = (EditText) findViewById(R.id.tv_mail);
        txttgllahir = (EditText) findViewById(R.id.tv_dateborn);
        tempatLahir = (EditText) findViewById(R.id.tv_placeborn);
        txtAlamat = (EditText) findViewById(R.id.tv_address);
     //   txtMatapelajaran = (EditText) findViewById(R.id.tv_mapel);
     //   txtharga = (EditText) findViewById(R.id.tv_price);
      //  txtTotalHarga=(EditText) findViewById(R.id.tv_totalor);
        txttotaljam=(EditText) findViewById(R.id.tv_jamor);
        txtTanggalOrder=(EditText) findViewById(R.id.tv_tanggalorderor);

        profil = (ImageView) findViewById(R.id.tv_photo);
        sessions = new SessionManager(this);

        btnbayar.setOnClickListener(this);
        btnBtl.setOnClickListener(this);
        btnTelp.setOnClickListener(this);
        Bundle b = getIntent().getExtras();
        idmurid = sessions.getUserDetails().get(SessionManager.KEY_USERID);
        idorder = b.getInt("id");
        namaDepan = b.getString("nama");
        namaBelakang = b.getString("namabelakang");
        nomorTlp = b.getString("nomortlp");
        jk = b.getString("jeniskelamin");
        alamat = b.getString("alamat");
        tanggalorder=b.getString("tanggalorder");
        tanggallahir = b.getString("tanggallahir");
        tempatlahir = b.getString("tempatlahir");
        email = b.getString("email");
        status = b.getString("status");
      //  harga = b.getString("harga");
        foto = b.getString("profil");
      //  matapelajaran = b.getString("matapelajaran");
     //   jambelajar=b.getString("jambelajar");
    //    totalharga=b.getString("totalharga");
        statusorder=b.getString("statusorder");



       if(statusorder.equalsIgnoreCase("Verifikasi")){
           // btnbayar.setEnabled(true);
            btnbayar.setBackground(this.getResources().getDrawable(R.drawable.verified));
            btnbayar.setText("Verified");
            txttotaljam.setVisibility(View.INVISIBLE);
        }else {
           btnbayar.setBackground(this.getResources().getDrawable(R.drawable.verified));
           btnbayar.setText("Verifikasi");
         //  txttotaljam.setEnabled(false);

//            btnbayar.setText("Bayar");
//            btnbayar.setBackground(this.getResources().getDrawable(R.drawable.bayar));
//           // btnBtl.setEnabled(false);
        }

        txtnama.setText(namaDepan + " " + namaBelakang);
        txttlp.setText(nomorTlp);
        txtjk.setText(jk);
        txttgllahir.setText(tanggallahir);
        txtEmail.setText(email);
        txtAlamat.setText(alamat);
        tempatLahir.setText(tempatlahir);
//        txtMatapelajaran.setText(matapelajaran);
     //   txtharga.setText(harga);
      //  txtTotalHarga.setText(totalharga);
      //  txttotaljam.setText(jambelajar);
        txtTanggalOrder.setText(tanggalorder);
        Picasso.with(this).load(foto).into(profil);

    }

    @Override

    public void onClick(View v) {
        if (v == btnbayar) {

            if(btnbayar.getText().toString().equalsIgnoreCase("verified")){
                Toast.makeText(getBaseContext(), "Murid sudah di Verifikasi", Toast.LENGTH_LONG).show();
            }
            else if(txttotaljam.getText().toString().equalsIgnoreCase(""))
            {
                Toast.makeText(getBaseContext(), "Masukkan terlebih dahulu jumlah jam Les Privat", Toast.LENGTH_LONG).show();

            }
            else {


                final ProgressDialog progressDialog = new ProgressDialog(DetilOrderActivity.this, R.style.ProgressDialog);
                progressDialog.setIndeterminate(true);
                progressDialog.setMessage("Membayar Guru..");
                progressDialog.show();

                // TODO: Implement your own signup logic here.

                String jam;
                jam = txttotaljam.getText().toString();
                service = RestClient.getClient();

                callVerif = service.verif(String.valueOf(idorder), jam);

                callVerif.enqueue(new Callback<APIVerifikasi>() {
                    @Override
                    public void onResponse(Response<APIVerifikasi> response) {
                        Log.d("Register2", "Status Code = " + response.code());
                        if (response.isSuccess()) {
                            // request successful (status code 200, 201)
                            APIVerifikasi result = response.body();
                            Log.d("Register2", "response = " + new Gson().toJson(result));
                            if (result != null) {
                                Toast.makeText(getBaseContext(), "Berhasil Verifikasi Order Murid", Toast.LENGTH_LONG).show();
                                progressDialog.dismiss();
                                finishAffinity();
                                Intent intent = new Intent(DetilOrderActivity.this, DaftarOrderActivity.class);
                                startActivity(intent);
                            }

                        } else {
                            // response received but request not successful (like 400,401,403 etc)
                            //Handle errors
                            Toast.makeText(getBaseContext(), "Gagal Verifikasi Order Murid", Toast.LENGTH_LONG).show();
                            progressDialog.dismiss();
                        }
                    }

                    @Override
                    public void onFailure(Throwable t) {
                        Toast.makeText(getBaseContext(), "Berhasil Verifikasi Order Murid", Toast.LENGTH_LONG).show();
                        progressDialog.dismiss();
                    }
                });

            }

        }
        else if(v==btnTelp) {
            Intent intent = new Intent(this, PopUpOrderActivity.class);
            Bundle extras = new Bundle();
            extras.putString("nomortlp", nomorTlp);
            extras.putString("idmurid", idmurid);
            extras.putInt("id", idguru);
            intent.putExtras(extras);
            startActivity(intent);
        }
        else if(v==btnBtl){

            final ProgressDialog progressDialog = new ProgressDialog(DetilOrderActivity.this, R.style.ProgressDialog);
            progressDialog.setIndeterminate(true);
            progressDialog.setMessage("Membatalkan Pesanan Guru..");
            progressDialog.show();

            // TODO: Implement your own signup logic here.

            service = RestClient.getClient();

            callCancel = service.batal(String.valueOf(idorder));

            callCancel.enqueue(new Callback<APICancelOrder>() {
                @Override
                public void onResponse(Response<APICancelOrder> response) {
                    Log.d("Register2", "Status Code = " + response.code());
                    if (response.isSuccess()) {
                        // request successful (status code 200, 201)
                        APICancelOrder result = response.body();
                        Log.d("Register2", "response = " + new Gson().toJson(result));
                        if (result != null) {
                            Toast.makeText(getBaseContext(), "Berhasil Membatalkan Order", Toast.LENGTH_LONG).show();
                            progressDialog.dismiss();
                            finish();
                            startActivity(getIntent());
                            Intent intent = new Intent(DetilOrderActivity.this, DaftarOrderActivity.class);
                            startActivity(intent);
                        }

                    } else {
                        // response received but request not successful (like 400,401,403 etc)
                        //Handle errors
                        Toast.makeText(getBaseContext(), "Gagal Membatalkan Order", Toast.LENGTH_LONG).show();
                        progressDialog.dismiss();
                    }
                }

                @Override
                public void onFailure(Throwable t) {
                    Toast.makeText(getBaseContext(), "Berhasil Membatalkan Order", Toast.LENGTH_LONG).show();
                    progressDialog.dismiss();
                }
            });

        }

    }
}
