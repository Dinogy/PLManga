package com.example.duan_pro1211_dungntph08210_lan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.duan_pro1211_dungntph08210_lan1.dao.TruyenDAO;
import com.example.duan_pro1211_dungntph08210_lan1.model.truyen;

public class AddTruyenActivity extends AppCompatActivity {

    TruyenDAO truyenDAO;
    EditText edtentruyen, edtacgia, edchap, eddichgia;
    Button btnthemtruyen, btnhuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_truyen);

        edtentruyen = findViewById(R.id.edtentruyen);
        edtacgia = findViewById(R.id.edtacgia);
        edchap = findViewById(R.id.edchap);
        eddichgia = findViewById(R.id.eddichgia);
        btnthemtruyen = findViewById(R.id.btnthemsach);
        btnhuy = findViewById(R.id.btnhuy);
        btnthemtruyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addtruyen(v);
            }
        });
    }

    public void addtruyen(View view) {

        truyenDAO = new TruyenDAO(AddTruyenActivity.this);
        String tentruyen = edtentruyen.getText().toString();
        String tacgia = edtacgia.getText().toString();
        String chap = edchap.getText().toString();
        String dichgia = eddichgia.getText().toString();

        truyen truyen = new truyen(tentruyen, tacgia, chap, dichgia);
        boolean isInsertTrue = truyenDAO.inserttruyen(truyen);
        if (isInsertTrue) {
            Toast.makeText(getApplicationContext(), "Thêm thành Công", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Thêm Thất Bại", Toast.LENGTH_SHORT).show();
        }
    }
}
