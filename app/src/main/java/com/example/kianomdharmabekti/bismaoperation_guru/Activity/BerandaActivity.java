package com.example.kianomdharmabekti.bismaoperation_guru.Activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.kianomdharmabekti.bismaoperation_guru.Model.APIGuruLogin;
import com.example.kianomdharmabekti.bismaoperation_guru.Preference.SessionManager;
import com.example.kianomdharmabekti.bismaoperation_guru.R;

import java.util.ArrayList;
import java.util.List;

import retrofit.Call;

/**
 * Created by mery on 5/25/2017.
 */
public class BerandaActivity extends ActionBarActivity implements AbsListView.OnScrollListener  {


        SessionManager sessions;
        private ListView listView;
        private Toolbar toolbar;
        private TextView floatTitle;
        private ImageView headerBg;
        //测量值
        private float headerHeight;//顶部高度
        private float minHeaderHeight;//顶部最低高度，即Bar的高度
        private float floatTitleLeftMargin;//header标题文字左偏移量
        private float floatTitleSize;//header标题文字大小
        private float floatTitleSizeLarge;//header标题文字大小（大号）

        Button btnorder;
        boolean flag;
        private com.example.kianomdharmabekti.bismaoperation_guru.REST.RestClient.GitApiInterface service;
        private String namaDepan,harga, jk, namaBelakang, email, tempatlahir, tanggallahir, alamat,status,mapel,rw;
        private String nomorTlp;
        private Call<APIGuruLogin> callGuru;

        private int idmurid, idguru;
        LinearLayout view1;
        // ListGuruActivity lgactivity;
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

        TextView txtnama,txtharga, txttlp,txtriwayat, txttgllahir, txtstatus, txtjk, txtnamaDepan, txtEmail, txttempatLahir, txtAlamat, txtId,txtMatapelajaran;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_beranda);

            BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

       /* txtnama=(TextView)findViewById(R.id.txtnama);
        txttlp=(TextView)findViewById(R.id.txtTelefon);
        txtriwayat=(TextView)findViewById(R.id.txtRiwayat);
        txtEmail=(TextView)findViewById(R.id.txtEmail);
        txtjk=(TextView) findViewById(R.id.txtJenisKelamin);
        txtAlamat=(TextView) findViewById(R.id.txtAlamat);
        txttgllahir=(TextView) findViewById(R.id.txtTanggalLahir);
        txttempatLahir=(TextView) findViewById(R.id.txtTempatLahir);
        txtMatapelajaran=(TextView) findViewById(R.id.txtMataPelajaran);
*/
      /*  Bundle b=getIntent().getExtras();
        namaDepan=b.getString("nama");
        tempatlahir=b.getString("tempat_Lahir");
        tanggallahir =b.getString("tanggal_lahir");
        jk= b.getString("kelamin");
        alamat=b.getString("alamat");
        nomorTlp=b.getString("telepon");
        rw= b.getString("riwayat");
        mapel=b.getString("mapel");
        email=  b.getString("email");

*/

      /*  txtnama.setText(namaDepan);
        txttlp.setText(nomorTlp);
        txtriwayat.setText(rw);
        txtjk.setText(jk);
        txtEmail.setText(email);
        txttgllahir.setText(tanggallahir);
        txtAlamat.setText(alamat);
        txtMatapelajaran.setText(mapel);
        txttempatLahir.setText(tempatlahir);
*/
            sessions=new SessionManager(this);

            initMeasure();
            initView();
            initListViewHeader();
            initListView();
            initEvent();
            bottomNavigationView.setOnNavigationItemSelectedListener(
                    new BottomNavigationView.OnNavigationItemSelectedListener() {
                        @Override
                        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                            switch (item.getItemId()) {
                                case R.id.action_favorites:

                                    break;

                                case R.id.action_schedules:

                                    Intent inten = new Intent(BerandaActivity.this, OrderActivity.class);
                                    startActivity(inten);
                                    break;

                                case R.id.action_music:
                                    Intent intent = new Intent(BerandaActivity.this, LoginActivity.class);
                                    startActivity(intent);

                                    break;

                            }
                            return true;
                        }
                    });
        }
    private void initMeasure() {
        headerHeight = getResources().getDimension(R.dimen.header_height);
        minHeaderHeight = getResources().getDimension(R.dimen.abc_action_bar_default_height_material);
        floatTitleLeftMargin = getResources().getDimension(R.dimen.float_title_left_margin);
        floatTitleSize = getResources().getDimension(R.dimen.float_title_size);
        floatTitleSizeLarge = getResources().getDimension(R.dimen.float_title_size_large);
    }

    private void initView() {
        listView = (ListView) findViewById(R.id.lv_main);
        floatTitle = (TextView) findViewById(R.id.tv_main_title);
        toolbar = (Toolbar) findViewById(R.id.tb_main);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initListView() {
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            data.add("Nama                       :"+sessions.getUserDetails().get(SessionManager.KEY_NAMA_DEPAN));
            data.add("Tempatlahir             :"+tempatlahir);
            data.add("Tanggal Lahir           :"+tanggallahir);
            data.add("Jenis Kelamin          :"+jk);
            data.add("Alamat                      :"+alamat);
            data.add("Nomor Telepon        :"+nomorTlp);
            data.add("Riwayat Pendidikan : " +rw);
            data.add("Mata Pelajaran        :"+mapel);
            data.add("Email                        :"+email);
            data.add("");
            data.add("");
            data.add("");




        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.activity_list_item, android.R.id.text1, data);
        listView.setAdapter(adapter);
    }

    private void initListViewHeader() {
        View headerContainer = LayoutInflater.from(this).inflate(R.layout.header, listView, false);
        headerBg = (ImageView) headerContainer.findViewById(R.id.img_header_bg);

        listView.addHeaderView(headerContainer);
    }

    private void initEvent() {
        listView.setOnScrollListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {

    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        //Y轴偏移量
        float scrollY = getScrollY(view);

        //变化率
        float headerBarOffsetY = headerHeight - minHeaderHeight;//Toolbar与header高度的差值
        float offset = 1 - Math.max((headerBarOffsetY - scrollY) / headerBarOffsetY, 0f);

        //Toolbar背景色透明度
        toolbar.setBackgroundColor(Color.argb((int) (offset * 140), 0, 0, 0));
        //header背景图Y轴偏移
        headerBg.setTranslationY(scrollY / 2);

        /*** 标题文字处理 ***/
        //标题文字缩放圆心（X轴）
        floatTitle.setPivotX(floatTitle.getLeft() + floatTitle.getPaddingLeft());
        //标题文字缩放比例
        float titleScale = floatTitleSize / floatTitleSizeLarge;
        //标题文字X轴偏移
        floatTitle.setTranslationX(floatTitleLeftMargin * offset);
        //标题文字Y轴偏移：（-缩放高度差 + 大文字与小文字高度差）/ 2 * 变化率 + Y轴滑动偏移
        floatTitle.setTranslationY(
                (-(floatTitle.getHeight() - minHeaderHeight) +//-缩放高度差
                        floatTitle.getHeight() * (1 - titleScale))//大文字与小文字高度差
                        / 2 * offset +
                        (headerHeight - floatTitle.getHeight()) * (1 - offset));//Y轴滑动偏移
        //标题文字X轴缩放
        floatTitle.setScaleX(1 - offset * (1 - titleScale));
        //标题文字Y轴缩放
        floatTitle.setScaleY(1 - offset * (1 - titleScale));

        //判断标题文字的显示
        if (scrollY > headerBarOffsetY) {
            toolbar.setTitle(getResources().getString(R.string.toolbar_title));
            floatTitle.setVisibility(View.GONE);
        } else {
            toolbar.setTitle("");
            floatTitle.setVisibility(View.VISIBLE);
        }
    }

    /**
     * 得到ListView在Y轴上的偏移
     */
    public float getScrollY(AbsListView view) {
        View c = view.getChildAt(0);

        if (c == null)
            return 0;

        int firstVisiblePosition = view.getFirstVisiblePosition();
        int top = c.getTop();

        float headerHeight = 0;
        if (firstVisiblePosition >= 1)
            headerHeight = this.headerHeight;

        return -top + firstVisiblePosition * c.getHeight() + headerHeight;
    }

}
