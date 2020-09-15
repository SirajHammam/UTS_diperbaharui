/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_pakody;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BerandaRemove {
    public static Scanner Input() {
        return new Scanner(System.in);
    }
    public static void Remove1(){
        System.out.println(" \n Apa anda ingin :"
                + "\n 1. menghapus semua history antrian"
                + "\n 1. Menghapus antrian didepan"
                + "\n 2. Menghapus antrian diakhir");
        removeNode();
    }
    public static void removeNode(){
        
        Remove R = new Remove();
        
        boolean status = true;
        int Nilai2 = 0;
        while (status) {            
            try {
                status = false;
                System.out.print("Pilih menu {1&2}");
                Nilai2 = Input().nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Masukkan Harus berupa angka :");
                status = true;
                Nilai2 = Input().nextInt();
            }
        }
       switch (Nilai2){
            case 1: R.removeall();break;
            case 2: R.removeDataAtFirst(); break;
            case 3: R.removeDataAtLast(); break;
        }
    }
}
