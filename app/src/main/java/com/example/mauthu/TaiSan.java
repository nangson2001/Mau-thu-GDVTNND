package com.example.mauthu;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

public class TaiSan implements Serializable {

    private int STT;
    private String ten;
    private String nhom;
    private String loai;
    private String nguoiSoHuu;
    private String trangThai;
    private int giaTien;
    private int khauHaoHangThang;

    public TaiSan(int STT, String ten, String nhom, String loai, String nguoiSoHuu, String trangThai, int giaTien, int khauHaoHangThang) {
        this.STT = STT;
        this.ten = ten;
        this.nhom = nhom;
        this.loai = loai;
        this.nguoiSoHuu = nguoiSoHuu;
        this.trangThai = trangThai;
        this.giaTien = giaTien;
        this.khauHaoHangThang = khauHaoHangThang;
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getNguoiSoHuu() {
        return nguoiSoHuu;
    }

    public void setNguoiSoHuu(String nguoiSoHuu) {
        this.nguoiSoHuu = nguoiSoHuu;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public int getKhauHaoHangThang() {
        return khauHaoHangThang;
    }

    public void setKhauHaoHangThang(int khauHaoHangThang) {
        this.khauHaoHangThang = khauHaoHangThang;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
