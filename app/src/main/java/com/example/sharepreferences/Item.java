package com.example.sharepreferences;

public class Item {
    private String tencasi;
    private String nghedanh;
    private String quocgia;
    private int hinh;

    public Item(String tencasi, String nghedanh, String quocgia, int hinh) {
        this.tencasi = tencasi;
        this.nghedanh = nghedanh;
        this.quocgia = quocgia;
        this.hinh = hinh;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getTencasi() {
        return tencasi;
    }

    public void setTencasi(String tencasi) {
        this.tencasi = tencasi;
    }

    public String getNghedanh() {
        return nghedanh;
    }

    public void setNghedanh(String nghedanh) {
        this.nghedanh = nghedanh;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
