package com.example.mauthu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.strictmode.IntentReceiverLeakedViolation;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.mauthu.fragment.Fragment2;

public class ThemTaiSanActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] nhomTaiSan = {"Mặt bằng", "Xe cộ", "Máy móc", "Khác"};
    String[] trangThaiTaiSan = {"Sẵn sàng sử dụng", "Đang sử dụng", "Hỏng hóc", "Mất", "Thanh lý"};
    String[] loaiTaiSan = {"Tài sản cố dịnh", "Tài sản cố dịnh vô hình", "Tài sản dài hạn"};
    EditText edtTen, edtNguoi, edtGia, edtKhauHao;
    Spinner spinnerNhomTaiSan, spinnerTrangThai, spinnerLoai;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_tai_san);
        context = getApplicationContext();
        spinnerNhomTaiSan = findViewById(R.id.spinner_nhom_tai_san);
        spinnerNhomTaiSan.setOnItemSelectedListener(this);
        ArrayAdapter adapter = new ArrayAdapter(context, android.R.layout.simple_spinner_item, nhomTaiSan);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerNhomTaiSan.setAdapter(adapter);

        spinnerTrangThai = findViewById(R.id.spinner_trang_thai);
        spinnerTrangThai.setOnItemSelectedListener(this);
        ArrayAdapter adapter2 = new ArrayAdapter(context, android.R.layout.simple_spinner_item, trangThaiTaiSan);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTrangThai.setAdapter(adapter2);

        spinnerLoai = findViewById(R.id.spinner_loai_tai_san);
        spinnerLoai.setOnItemSelectedListener(this);
        ArrayAdapter adapter3 = new ArrayAdapter(context, android.R.layout.simple_spinner_item, loaiTaiSan);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLoai.setAdapter(adapter3);
        edtGia = findViewById(R.id.edt_gia);
        edtNguoi = findViewById(R.id.edt_nguoi);
        edtTen = findViewById(R.id.edt_ten);
        edtKhauHao = findViewById(R.id.edt_khau_hao);

        findViewById(R.id.button_xac_nhan_them_tai_san).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Kiểm tra input
                String gia, nguoi, ten, khauHao;
                gia = edtGia.getText().toString().trim();
                nguoi = edtNguoi.getText().toString().trim();
                ten = edtTen.getText().toString().trim();
                khauHao = edtKhauHao.getText().toString().trim();
                if (gia.equals("") || nguoi.equals("") || ten.equals("") || khauHao.equals(""))
                    Toast.makeText(context, "Bạn nhập thiếu thông tin!!!", Toast.LENGTH_SHORT).show();
                else {
                    String nhom = spinnerNhomTaiSan.getSelectedItem().toString();
                    String trangThai = spinnerTrangThai.getSelectedItem().toString();
                    String loai = spinnerLoai.getSelectedItem().toString();
                    Singleton singleton = Singleton.getInstance();
                    singleton.taiSanList.add(0, new TaiSan(singleton.autoGenerateSTT(), ten, nhom, loai, nguoi, trangThai, Integer.parseInt(gia), Integer.parseInt(khauHao)));
                    setResult(22);
                    finish();
                }
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}