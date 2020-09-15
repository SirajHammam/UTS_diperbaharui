/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_pakody;

import java.util.LinkedList;
import static uts_pakody.Add.Input;
import static uts_pakody.Add.Menabung;

/**
 *
 * @author HP
 */
public class Search {
    public static boolean searchData(String data) {
        return Menabung.contains(data);
    }
//SEARCH1
    public static void Search(){
        Add.Antrian_Nabung();
        System.out.println("Masukkan Nama yang ingin dicari: ");
        String data = Input().nextLine();
        if(searchData(data)) {
            System.out.println(data);
        }
        else {
            System.out.println("Anda memasukkan nama yang tidak tersimpan di dalam list");
        }
        Add.Antrian_Nabung();
        
        
    }
}
