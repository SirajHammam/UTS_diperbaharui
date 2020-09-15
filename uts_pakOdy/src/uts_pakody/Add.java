/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_pakody;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;


/**
 *
 * @author HP
 */
public class Add {
    
    public static LinkedList<String> Menabung = new LinkedList<String>();
    public static void Antrian_Nabung(){
        System.out.println("\n Urutan Antrian : " +Menabung);
        System.out.println("Total Antrian : " +Menabung.size());
    }
    public static Scanner Input() {
        return new Scanner(System.in);
    }
    public static void tambah() {
            System.out.print("Masukkan Nama: ");
            String tempData = Input().nextLine();
            Menabung.add(tempData);
            Antrian_Nabung();
        }
    public static void AddDataToFirst(){
            System.out.print("masukkan Nama :");
            String tempData = Input().nextLine();
            Menabung.addFirst(tempData);
            Antrian_Nabung();
        }
    public static void AddDataToLast(){
            System.out.print("masukkan Nama :");
            String tempData = Input().nextLine();
            Menabung.addLast(tempData);
            Antrian_Nabung();
        }
}
