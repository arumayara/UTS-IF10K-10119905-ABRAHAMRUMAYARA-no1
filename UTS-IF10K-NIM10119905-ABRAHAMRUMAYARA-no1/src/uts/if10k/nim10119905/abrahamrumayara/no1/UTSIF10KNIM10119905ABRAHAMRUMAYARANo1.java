/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.nim10119905.abrahamrumayara.no1;

import java.util.Scanner;

/**
 *
 * @author aruma
 * Nama: Abraham Rumayara
 * Kelas : IF10K
 * NIM : 10119905
 * UTS no 1. Tandanya Kamu2
 * 
 */
public class UTSIF10KNIM10119905ABRAHAMRUMAYARANo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Age objAge = new Age(2020);
        System.out.println("Masukan tahun lahir anda : ");
        objAge.setYearBirth(input.nextInt());
        System.out.print("Hari ini Tahun : ");
        objAge.getYearNow();
        System.out.println("Umur kamu sampai hari ini adalah "+ objAge.hitungUmur()+ " tahun");
        System.out.print("Tandanya kamu " );
        objAge.tandanyaKamu(objAge.hitungUmur());
    }
    
}
