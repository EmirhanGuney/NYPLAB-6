/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nyplab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Emirhan Güney
 */
public class NYPLAB6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int islem = 0;
        while( islem != 4){
        System.out.println("1-karakter sayisini say");
        System.out.println("2-iki kelime arasindaki ortak karakterleri bul");
        System.out.println("3-cümleyi arrayList'e donustur");
        System.out.println("4-cıkıs");
        
         System.out.println("yapmak istediginiz islemi seciniz:");
        islem=scan.nextInt();
        
        switch(islem){
       
            case 1:
                 String kelime;
                 Scanner gir = new Scanner(System.in);
                 System.out.println("kelimeyi giriniz:");
                 kelime = gir.nextLine();
                 System.out.println("karater sayisi:"+kelime.length());
            break;
            
            
            case 2:
                 Scanner scan3= new Scanner(System.in);
                 System.out.println("birinci kelimeyi giriniz:");
                 String kelime1= scan3.next();
                
                  Scanner scan4= new Scanner(System.in);
                  System.out.println("ikinci kelimeyi giriniz:");
                 String kelime2=scan4.next();
                        
                int sayi=0;
                for(int i=0;i<kelime1.length();i++)
                {
                for(int j=0;j<kelime2.length();j++)
                {  
               if(kelime2.charAt(j)==kelime1.charAt(i)) {
                  sayi++;
                
                } 
                }}
                  System.out.println("harf tekrari:"+sayi);
              
            break;
        
            
             case 3:
                    Scanner oku = new Scanner(System.in);
                    System.out.print("Cumleyi giriniz: ");
                    String cumle = oku.nextLine();
                    String[] arr = cumle.split(" ");
                    List<String> arr_L = new ArrayList<>();
                    arr_L.addAll(Arrays.asList(arr));
                    System.out.println(arr_L);
                    
            break;

             
            
            case 4:
                System.out.println("basarili bir sekilde cikis yapildi."); 
            break;
           
           }
        }
    }
    
}
