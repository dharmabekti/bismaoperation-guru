package com.example.kianomdharmabekti.bismaoperation_guru.Activity;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.kianomdharmabekti.bismaoperation_guru.R;

/**
 * Created by Ki Anom Dharma Bekti on 5/31/2017.
 */
public class RiwayatHolder extends RecyclerView.ViewHolder{

    TextView tvsub, tvid;
    TextView tvtit ;
    TextView tvStatus;
    TextView tv_telpon;
    TextView tv_email;
    TextView tv_tanggallahir;
    TextView tv_tempatlahir;
    TextView tv_jeniskelamin;
    TextView tv_namabelakang;
    TextView tv_tanggalorder;
    TextView tv_jam;
    TextView tv_pembayaran;
    RelativeLayout item;
    ImageView foto;
    TextView foto2;


    public RiwayatHolder(View view)
    {
        super(view);
        this.tvid = (TextView) view.findViewById(R.id.tv_id);
        this.tvsub = (TextView) view.findViewById(R.id.tv_subtitle);
        this.tvtit = (TextView) view.findViewById(R.id.tv_title);
        this.tvStatus=(TextView) view.findViewById(R.id.tv_status);
        this.tv_telpon=(TextView)view.findViewById(R.id.tv_tlp);
        this.tv_email=(TextView) view.findViewById(R.id.tv_email);
        this.tv_tanggallahir=(TextView) view.findViewById(R.id.tv_tanggallahir);
        this.tv_tempatlahir=(TextView) view.findViewById(R.id.tv_tempatlahir);
        this.tv_jeniskelamin=(TextView)view.findViewById(R.id.tv_jeniskelamin);
        this.tv_namabelakang=(TextView) view.findViewById(R.id.tv_namabelakang);
        this.tv_tanggalorder=(TextView) view.findViewById(R.id.tv_tanggalorderor);
        this.tv_jam=(TextView) view.findViewById(R.id.tv_jamor);
        this.tv_pembayaran=(TextView) view.findViewById(R.id.tv_pembayaran);
        this.item = (RelativeLayout) view.findViewById(R.id.itemGuru);
        this.foto = (ImageView) view.findViewById(R.id.icon);
        this.foto2 = (TextView) view.findViewById(R.id.tv_temp);
    }
}