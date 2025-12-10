package com.example.training1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tinhTongTest {
    private tinhTong tt;
    @BeforeEach
    public void setUp(){
        tt = new tinhTong();
    }
    // Ky thuat vung bien co 6 test case (BVA)
    // Phan vung co 3 test case (EP)
    @Test
    public void tinhTongHopLeVoiBienMin(){ // khai bao ham test
        int thucTe = tt.tinhTong(1, 1); // khai bao bien thuc te de nhan ket qua truyen vao
        int mongMuon = 2; // khai bao bien mong muon de lay ket qua tra ra
        assertEquals(thucTe, mongMuon); // truyen 2 bien khai bao o tren vao
    }
}