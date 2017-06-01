package com.example.kianomdharmabekti.bismaoperation_guru.Activity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

import com.example.kianomdharmabekti.bismaoperation_guru.R;


public class PopUpOrderActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView txtnumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_order);

        DisplayMetrics dm= new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width= dm.widthPixels;
        int height =dm.heightPixels;
        getWindow().setLayout((int)(width*.8),(int)(height*.1));
        txtnumber =(TextView) findViewById(R.id.txtNumber) ;
        txtnumber.setOnClickListener(this);
        Intent in=getIntent();
        Bundle b=in.getExtras();
        txtnumber.setText(b.getString("nomortlp"));




    }
    public void onClick(View v) {
        if(v== txtnumber ) {

            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:"+txtnumber.getText().toString()));

            if (ActivityCompat.checkSelfPermission(PopUpOrderActivity.this,
                    Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                return;
            }
            startActivity(callIntent);
        }
    }
}
