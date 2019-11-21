package com.example.duan_pro1211_dungntph08210_lan1;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
GridView gridView;
String[] chap={
        "Chap 45","Chap 71","CHap 40","Chap 59","Chap 71","Chap50","Chap 1","Chap 86","Chap 2"

};
String[] tentruyen={
"Hệ Thống Chế Tạo Nữ Thần","Ta Không Phải Là Trần Viên Viên","Truyện Của Yokai","Ta Là Vua Pháp Sư","Hình Như Những Đứa trẻ"
        ,"Thiên Thần Rớt Xuống Nhà Tôi","Sweet pea-Honeymoon baby","Boruto - Cậu Bé Hồ Li","Tiểu Quỷ Q-TARO"
    };
int[] hinhtruyen={
R.drawable.hethongchetaonuthan,R.drawable.takhongphailatranvienvien,
        R.drawable.truyencuayokai,R.drawable.talaphapsu,
        R.drawable.hinhnhuduatheracroidoden,R.drawable.thienthanrotxuongnhatoi,
        R.drawable.sweet,R.drawable.boruto,R.drawable.tieuquy



};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //khởi tạo,truyền và hiển thị
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        gridView=findViewById(R.id.gridview);
        GridviewAdapter gridviewAdapter=new GridviewAdapter(this,chap,tentruyen,hinhtruyen);
        gridView.setAdapter(gridviewAdapter);


        //xổ drawer Layout ra
        drawerLayout=findViewById(R.id.drawerlayout);
        actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.updatetruyen:
                Intent intent=new Intent(MainActivity.this,AddTruyenActivity.class);
                startActivity(intent);
                break;
        }
        if (actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


                }
