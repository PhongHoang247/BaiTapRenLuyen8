package com.phong.model;

import java.io.Serializable;

public class SanPham implements Serializable {
    protected String ten;
    protected int gia;
    protected int hinh;
    protected int soLuong;

    public SanPham() {
    }

    public SanPham(String ten, int gia, int hinh, int soLuong) {
        this.ten = ten;
        this.gia = gia;
        this.hinh = hinh;
        this.soLuong = soLuong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
