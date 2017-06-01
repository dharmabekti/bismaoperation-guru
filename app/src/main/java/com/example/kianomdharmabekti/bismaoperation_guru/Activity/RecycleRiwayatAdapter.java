package com.example.kianomdharmabekti.bismaoperation_guru.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kianomdharmabekti.bismaoperation_guru.Model.APIOrder;
import com.example.kianomdharmabekti.bismaoperation_guru.Model.APIRiwayat;
import com.example.kianomdharmabekti.bismaoperation_guru.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ki Anom Dharma Bekti on 6/1/2017.
 */
public class RecycleRiwayatAdapter extends RecyclerView.Adapter<RiwayatHolder>{
    List<APIRiwayat.ResponBean> listGuru;
    private Context context;
    private String notlp1,email,tgllahir,tempatlahir,jeniskelamin,namabelakang;

    public RecycleRiwayatAdapter(Context context, List<APIRiwayat.ResponBean> listGuru) {
        this.context = context;
        this.listGuru = listGuru;

    }



    @Override
    public int getItemCount() {
        return (null != listGuru ? listGuru.size() : 0);

    }



    @Override
    public RiwayatHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // This method will inflate the custom layout and return as viewholder
        LayoutInflater mInflater = LayoutInflater.from(viewGroup.getContext());

        ViewGroup mainGroup = (ViewGroup) mInflater.inflate(
                R.layout.view_rv_riwayat , viewGroup, false);
        RiwayatHolder listHolder = new RiwayatHolder(mainGroup);
        return listHolder;
    }

    @Override
    public void onBindViewHolder(RiwayatHolder holder, int position) {
        final APIRiwayat.ResponBean guru = listGuru.get(position);
        final RiwayatHolder mainHolder = holder;

        mainHolder.tvid.setText(String.valueOf(guru.getId_pengajar().get(0).getId()));
        mainHolder.tvtit.setText(guru.getId_pengajar().get(0).getNama_depan());
        mainHolder.tvsub.setText(guru.getId_pengajar().get(0).getAlamat());
        mainHolder.tvStatus.setText(guru.getId_pengajar().get(0).getStatus());
        mainHolder.tv_telpon.setText(guru.getId_pengajar().get(0).getTelepon());
        mainHolder.tv_email.setText(guru.getId_pengajar().get(0).getEmail());
        mainHolder.tv_tanggallahir.setText(guru.getId_pengajar().get(0).getTanggal_lahir());
        mainHolder.tv_tempatlahir.setText(guru.getId_pengajar().get(0).getTempat_lahir());
        mainHolder.tv_jeniskelamin.setText(guru.getId_pengajar().get(0).getKelamin());
        mainHolder.tv_namabelakang.setText(guru.getId_pengajar().get(0).getNama_belakang());
//        mainHolder.tv_harga.setText(guru.getId_pengajar().get(0).getHarga());
        mainHolder.foto2.setText(guru.getId_pengajar().get(0).getProfil());
        //mainHolder.matapelajaran.setText(guru.getId_pengajar().get(0).getMata_pelajaran());
        Picasso.with(context).load(guru.getId_pengajar().get(0).getProfil()).into(mainHolder.foto);
//        mainHolder.tv_title.setText(guru.getId_pengajar().get(0).getNama_depan());
        mainHolder.tvid.setText(String.valueOf(guru.getId()));
        mainHolder.tv_pembayaran.setText(guru.getTotal_biaya());
        mainHolder.tv_jam.setText(guru.getJam());
        mainHolder.tv_tanggalorder.setText(guru.getTanggal());
//        mainHolder.tv_statusOrder.setText(guru.getStatus());

        namabelakang=guru.getId_pengajar().get(0).getNama_belakang();

        mainHolder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle extras = new Bundle();
                extras.putInt("id",Integer.parseInt(mainHolder.tvid.getText().toString()));
                extras.putString("nama",mainHolder.tvtit.getText().toString());
                extras.putString("alamat", mainHolder.tvsub.getText().toString());
                extras.putString("status", mainHolder.tvStatus.getText().toString());
                extras.putString("nomortlp", mainHolder.tv_telpon.getText().toString());
                extras.putString("email",mainHolder.tv_email.getText().toString());
                extras.putString("tanggallahir",mainHolder.tv_tanggallahir.getText().toString());
                extras.putString("tempatlahir",mainHolder.tv_tempatlahir.getText().toString());
                extras.putString("jeniskelamin",mainHolder.tv_jeniskelamin.getText().toString());
                extras.putString("namabelakang",mainHolder.tv_namabelakang.getText().toString());
                extras.putString("profil",mainHolder.foto2.getText().toString());
                extras.putString("jambelajar",mainHolder.tv_jam.getText().toString());
                extras.putString("tanggalorder",mainHolder.tv_tanggalorder.getText().toString());
                extras.putString("pembayaran",mainHolder.tv_pembayaran.getText().toString());

                Log.d("LoginActivity", "response >>>= " + mainHolder.foto2.toString());
                Intent intent = new Intent(context, DetilRiwayatActivity.class);
                intent.putExtras(extras);
                context.startActivity(intent);
            }
        });

    }

}