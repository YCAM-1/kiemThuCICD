package com.example.training1;

public class tinhTong {
    public int tinhTong(int a, int b){ // khai bao bien thuc hien test (tinhTong), khai bao cac bien du lieu thuc hien test (a,b)
        //Tu 1 den 1000
        if(a < 1 || a > 1000 || b < 1 || b > 1000){ //if - else la dieu kien
            throw new IllegalArgumentException("Nhap dung so di em");
        }
        return a+b;
    }
}
