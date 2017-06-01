package com.example.kianomdharmabekti.bismaoperation_guru.Activity;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.kianomdharmabekti.bismaoperation_guru.Model.APICancelOrder;
import com.example.kianomdharmabekti.bismaoperation_guru.Model.APIVerifikasi;
import com.example.kianomdharmabekti.bismaoperation_guru.Preference.SessionManager;
import com.example.kianomdharmabekti.bismaoperation_guru.R;
import com.example.kianomdharmabekti.bismaoperation_guru.REST.RestClient;
import com.squareup.picasso.Picasso;

import retrofit.Call;

public class DetilRiwayatActivity extends AppCompatActivity implements View.OnClickListener {

    boolean flag;
    private RestClient.GitApiInterface service;
    private String namaDepan, harga, jk, namaBelakang, email, tempatlahir, tanggallahir, alamat, status, matapelajaran;
    private String nomorTlp, foto,totalharga,jambelajar,tanggalorder,statusorder;
    private Integer idorder;

    private String idmurid;
    private int idguru;
    LinearLayout view1;

    //ImageView img;
    private ImageView gbr;
    ImageView profil;
    SessionManager sessions;
    EditText txtTanggalOrder,txtTotalHarga,txttotaljam,txtnama, txtharga, txttlp, txttgllahir, txtstatus, txtjk, txtnamaDepan, txtEmail, tempatLahir, txtAlamat, txtId, txtMatapelajaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detil_riwayat);

        txtnama = (EditText) findViewById(R.id.tv_name);
        txttlp = (EditText) findViewById(R.id.tv_phone);
        txtjk = (EditText) findViewById(R.id.tv_gender);

        txtEmail = (EditText) findViewById(R.id.tv_mail);
        txttgllahir = (EditText) findViewById(R.id.tv_dateborn);
        tempatLahir = (EditText) findViewById(R.id.tv_placeborn);
        txtAlamat = (EditText) findViewById(R.id.tv_address);
        txtTotalHarga=(EditText) findViewById(R.id.tv_pembayaran);
        txttotaljam=(EditText) findViewById(R.id.tv_jamor);
        txtTanggalOrder=(EditText) findViewById(R.id.tv_tanggalorderor);

        profil = (ImageView) findViewById(R.id.tv_photo);
        sessions = new SessionManager(this);

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
        foto = b.getString("profil");
        jambelajar=b.getString("jambelajar");
        totalharga=b.getString("pembayaran");
        statusorder=b.getString("statusorder");


        txtnama.setText(namaDepan + " " + namaBelakang);
        txttlp.setText(nomorTlp);
        txtjk.setText(jk);
        txttgllahir.setText(tanggallahir);
        txtEmail.setText(email);
        txtAlamat.setText(alamat);
        tempatLahir.setText(tempatlahir);
        txtTotalHarga.setText(totalharga);
        txttotaljam.setText(jambelajar);
        txtTanggalOrder.setText(tanggalorder);
        Picasso.with(this).load(foto).into(profil);

    }

    @Override
    public void onClick(View v) {

    }
}
