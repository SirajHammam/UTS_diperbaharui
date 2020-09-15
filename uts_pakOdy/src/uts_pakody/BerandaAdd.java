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
public class BerandaAdd {
    
    public static Scanner Input() {
        return new Scanner(System.in);
    }
    public static void Add(){
        System.out.println(" \n Apa anda ingin :"
                + "\n 1. Mengantri "
                + "\n 1. mengantri didepan"
                + "\n 2. Mengantri diakhir");
        addNode();
    }
    public static void addNode(){
        
        Add A = new Add();
        Search S = new Search();
        
        boolean status = true;
        int Nilai = 0;
        while (status) {            
            try {
                status = false;
                System.out.print("Pilih menu {1&2} : ");
                Nilai = Input().nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Masukkan Harus berupa angka :");
                status = true;
                Nilai = Input().nextInt();
            }
        }
        switch (Nilai){
            case 1: A.tambah();break;
            case 2: A.AddDataToFirst(); break;
            case 3: A.AddDataToLast(); break;
        }
    }
}
