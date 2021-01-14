/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg1.lanjut.no3;
import java.util.Scanner;
/**
 *
 * @author MOKLET-1
 */
public class no3 {
   public static void main(String[]args){
   Scanner masukan= new Scanner (System.in);
   int a,b,c;
   System.out.println("Program menjumlahkan 2 nilai");
   System.out.print("Masukan nilai a: ");
   a =masukan.nextInt();
   System.out.print("Masukan nilai b: ");
   b =masukan.nextInt();
   System.out.print("Masukan nilai c: ");
   c =masukan.nextInt();
   System.out.println();
   System.out.println("jumlah a + b : "+ (jumlah(a,b)));
   System.out.println("jumlah b + c : "+ (jumlah(b,c)));
   System.out.println("jumlah a + c : "+ (jumlah(a,c)));
    }
   private static int jumlah(int a,int b){
       int hasil= a+b;
       return hasil;
   }
}
