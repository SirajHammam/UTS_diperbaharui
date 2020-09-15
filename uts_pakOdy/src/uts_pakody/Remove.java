/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_pakody;

import java.util.LinkedList;
import java.util.Scanner;
import static uts_pakody.Add.Menabung;

/**
 *
 * @author HP
 */
public class Remove {
    public static void Antrian_Nabung(){
        System.out.println("\nUrutan Antrian : " +Menabung);
        System.out.println("Total Antrian : " +Menabung.size());
    }
    public static Scanner Input() {
        return new Scanner(System.in);
    }
    public static void removeall() {
            System.out.print("Mengapa anda menghapus antrian : ");
            String tempData = Input().nextLine();
            Menabung.remove(tempData);
            Antrian_Nabung();
        } 
    public static void removeDataAtFirst(){
        Menabung.removeFirst();
        Antrian_Nabung();
    }
    public static void removeDataAtLast(){
        Menabung.removeLast();
        Antrian_Nabung();
    }
}
