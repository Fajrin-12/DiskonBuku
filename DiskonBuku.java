/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diskonbuku;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class DiskonBuku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int pilihan;
        int total;
        int tran;
        int diskon1;
        int diskon2;
        int diskon3;
        System.out.println("1. Pembelian normal");
        System.out.println("2. Pembelian diatas 50.000");
        System.out.println("Masukkan pilihan diskon : ");
        pilihan=input.nextInt();
        
        
        ///seleksi diskon///
        switch(pilihan){
            case 1:
                System.out.print("Masukkan total harga buku : ");
                total=input.nextInt();
                System.out.println("Masukkan no Transaksi : ");
                tran=input.nextInt();
                ///keterangan diskon///
        diskon1=(total*10/100);
        diskon2=(total*5/100);
        diskon3=diskon1+diskon2;
        
                if(tran>0 && total>50000){
                    System.out.println("Angka yang anda masukkan terlalu besar!");
                }        
                else if(tran<=50){
                    
                   System.out.println("Total pembayaran : "+total);
                   System.out.println("Anda mendapatkan potongan 5% : "+diskon2);
                   System.out.println("Total yang harus anda bayar : "+(total-(diskon2)));
                }
                
                break;
            case 2: 
                System.out.print("Masukkan total harga buku : ");
                total=input.nextInt();
                System.out.println("Masukkan nomor transaksi : ");
                tran=input.nextInt();
                
                ///keterangan diskon///
        diskon1=(total*10/100);
        diskon2=(total*5/100);
        diskon3=diskon1+diskon2;
                if (tran<=50){
                    System.out.println("Anda mendapatkan potongan 5% : "+diskon2);
                    System.out.println("Total pembayaran anda : "+(total-(diskon2)));
                    if( total>50000){
                    System.out.println("=====================");    
                    System.out.println("Anda mendapat diskon 15% : "+diskon3);
                    System.out.println("Total yang harus dibayar :"+(total-(diskon3)));
                }
                }
                
                else{
                    System.out.println("Masukkan format yang benar!");
                }

                break;
            default:
                System.out.println("Masukkan pilihan yang benar");
        }
        

        
        
    }
    
}
