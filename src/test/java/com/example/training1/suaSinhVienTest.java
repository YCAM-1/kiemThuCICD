package com.example.training1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class suaSinhVienTest {
    private suaSinhVien suaSV;
    private SinhVien sv;

    @BeforeEach
    void setUp() {
        suaSV = new suaSinhVien();
        sv = new SinhVien("SV01", "A", 18, 5, 3, "CNTT");
    }

    @Test
    void testSua_DiemBien_0_HopLe() {
        assertTrue(suaSV.suaSinhVien(sv, "Nam", 18, 0, 3, "CNTT"));
    }

    @Test
    void testSua_DiemBien_10_HopLe() {
        assertTrue(suaSV.suaSinhVien(sv, "Nam", 18, 10, 3, "CNTT"));
    }

    @Test
    void testSua_Diem_NhoHon0() {
        assertThrows(IllegalArgumentException.class,
                () -> suaSV.suaSinhVien(sv, "Nam", 18, -0.1f, 3, "CNTT"));
    }

    @Test
    void testSua_Diem_LonHon10() {
        assertThrows(IllegalArgumentException.class,
                () -> suaSV.suaSinhVien(sv, "Nam", 18, 10.1f, 3, "CNTT"));
    }

    @Test
    void testSua_DiemTrongKhoangHopLe() {
        assertTrue(suaSV.suaSinhVien(sv, "Nam", 18, 7.5f, 3, "CNTT"));
    }

    @Test
    void testSua_TenTrong() {
        assertThrows(IllegalArgumentException.class,
                () -> suaSV.suaSinhVien(sv, "", 18, 8, 3, "CNTT"));
    }

    @Test
    void testSua_ChuyenNganhNull() {
        assertThrows(IllegalArgumentException.class,
                () -> suaSV.suaSinhVien(sv, "Nam", 18, 8, 3, null));
    }

    @Test
    void testSua_SinhVienNull() {
        assertThrows(IllegalArgumentException.class,
                () -> suaSV.suaSinhVien(null, "Nam", 18, 8, 3, "CNTT"));
    }
}