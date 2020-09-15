/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_pakody;

import java.util.InputMismatchException;
import java.util.Scanner;
import static uts_pakody.Search.Search;
/**
 *
 * @author HP
 */
public class Beranda {
    
    public static Scanner Input() {
        return new Scanner(System.in);
    }
    
    public static void Menu() {
        
        System.out.println("Koperasi Desa");
        System.out.println("Selamat Datang ke Aplikasi Koperasi Desa");
        
        System.out.println("\n Apa yang akan anda lakukan :"
                + "\n 1. Mengantri "
                + "\n 2. Menghapus Antrian "
                + "\n 3. Mencari Antrian ");
        Pilih();
    }
    public static void Pilih(){
        
        BerandaAdd BA = new BerandaAdd();
        BerandaRemove BR = new BerandaRemove();
        
        boolean stats = true;
        int Nilai = 0;
        while (stats) {            
            try {
                stats = false;
                System.out.print("pilih menu {1-3} : ");
                Nilai = Input().nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Masukkan Harus Berupa Angka");
                stats = true;
                Nilai = Input().nextInt();
            }
        } 
        switch (Nilai) {
            case 1: BA.Add();break;
            case 2: BR.Remove1();break;
            case 3: Search();break;
        }
        Menu();
      }
}
