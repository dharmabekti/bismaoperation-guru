package com.example.kianomdharmabekti.bismaoperation_guru.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kianomdharmabekti.bismaoperation_guru.Model.APIRiwayat;
import com.example.kianomdharmabekti.bismaoperation_guru.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Ki Anom Dharma Bekti on 5/31/2017.
 */
public class RecycleViewRiwayat extends RecyclerView.Adapter<RiwayatHolder> {

    List<APIRiwayat.ResponBean.IdPengajarBean> listGuru;
    private Context context;
    private String notlp1,email,tgllahir,tempatlahir,jeniskelamin,namabelakang;


    public RecycleViewRiwayat(Context context, List<APIRiwayat.ResponBean.IdPengajarBean> listGuru) {
        this.context = context;
        this.listGuru = listGuru;

    }

    @Override
    public int getItemCount() {
        return (null != listGuru ? listGuru.size() : 0);

    }

    @Override
    public void onBindViewHolder(RiwayatHolder holder, int position) {
        final APIRiwayat.ResponBean.IdPengajarBean guru = listGuru.get(position);
        final RiwayatHolder mainHolder = holder;

        mainHolder.tvid.setText(String.valueOf(guru.getId()));
        mainHolder.tvtit.setText(guru.getNama_depan());
        mainHolder.tvsub.setText(guru.getAlamat());
        mainHolder.tv_telpon.setText(guru.getTelepon());
        mainHolder.tv_email.setText(guru.getEmail());
        mainHolder.tv_tanggallahir.setText(guru.getTanggal_lahir());
        mainHolder.tv_tempatlahir.setText(guru.getTempat_lahir());
        mainHolder.tv_jeniskelamin.setText(guru.getKelamin());
        mainHolder.tv_namabelakang.setText(guru.getNama_belakang());
        mainHolder.foto2.setText(guru.getProfil());
        Picasso.with(context).load(guru.getProfil()).into(mainHolder.foto);

        namabelakang=guru.getNama_belakang();

        mainHolder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle extras = new Bundle();
                extras.putInt("id",Integer.parseInt(mainHolder.tvid.getText().toString()));
                extras.putString("nama",mainHolder.tvtit.getText().toString());
                extras.putString("alamat", mainHolder.tvsub.getText().toString());
                extras.putString("status", mainHolder.tvStatus.getText().toString());
                extras.putString("nomortlp", mainHolder.tv_telpon.getText().toString());
                // extras.putString("nomortlp",notlp1);
                extras.putString("email",mainHolder.tv_email.getText().toString());
                extras.putString("tanggallahir",mainHolder.tv_tanggallahir.getText().toString());
                extras.putString("tempatlahir",mainHolder.tv_tempatlahir.getText().toString());
                extras.putString("jeniskelamin",mainHolder.tv_jeniskelamin.getText().toString());
                extras.putString("namabelakang",mainHolder.tv_namabelakang.getText().toString());
                extras.putString("profil",mainHolder.foto2.getText().toString());
//                extras.putString("profil",mainHolder.foto.toString());

                Log.d("LoginActivity", "response >>>= " + mainHolder.foto2.toString());
                Intent intent = new Intent(context, DetilRiwayatActivity.class);
                intent.putExtras(extras);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public RiwayatHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // This method will inflate the custom layout and return as viewholder
        LayoutInflater mInflater = LayoutInflater.from(viewGroup.getContext());

        ViewGroup mainGroup = (ViewGroup) mInflater.inflate(
                R.layout.view_rv_riwayat, viewGroup, false);
        RiwayatHolder listHolder = new RiwayatHolder(mainGroup);
        return listHolder;
    }
}