/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pmahasiswa;

/**
 *
 * @author Ridho
 */
public class Mahasiswa {

    private String nama;
    private int nilai;

    // constructor
    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
    
    public String getNama() {
        return nama;
    }

    // getter (optional tapi bagus)
    public int getNilai() {
        return nilai;
    }

    // method utama
    public boolean isLulus() {
        return nilai >= 60;
    }
}
