package atm;
   
import java.util.Scanner;

public class ATM {
    public static void main(String[]args){
        int pilihan;
        int saldo = 10000;
        Scanner input = new Scanner (System.in);
        
        while (true) {
            System.out.println("============ MENU ATM ============");
            System.out.println("1. CEK SALDO   = ............");
            System.out.println("2. KELUAR      = ............");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = Integer.parseInt(input.next());
   
        switch(pilihan){
        case 1 :
        System.out.println("Saldo anda adalah : Rp. "+saldo);
        break;
   
        case 2 :
        System.exit(0);
        break;
   
        default:
        System.out.println("Anda Harus memilih menu (1,2)");
        break;
        
            }
        }
    }
}


