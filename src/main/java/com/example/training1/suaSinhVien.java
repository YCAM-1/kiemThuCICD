package com.example.training1;

public class suaSinhVien {
    public boolean suaSinhVien(SinhVien sv, String ten, int tuoi, float diem, int kyHoc, String chuyenNganh) {

        if (sv == null) {
            throw new IllegalArgumentException("Sinh vien khong ton tai");
        }

        if (ten == null || ten.trim().isEmpty()) {
            throw new IllegalArgumentException("Ten khong duoc de trong");
        }
        if (chuyenNganh == null || chuyenNganh.trim().isEmpty()) {
            throw new IllegalArgumentException("Chuyen nganh khong duoc de trong");
        }

        if (diem < 0 || diem > 10) {
            throw new IllegalArgumentException("Diem phai tu 0-10");
        }

        sv.setTen(ten);
        sv.setTuoi(tuoi);
        sv.setDiemTrungBinh(diem);
        sv.setKyHoc(kyHoc);
        sv.setChuyenNganh(chuyenNganh);

        return true;
    }
}
