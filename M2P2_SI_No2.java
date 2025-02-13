package m2p2_si;

import java.util.Scanner;

public class M2P2_SI_No2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String nama;
        int pilihan;
        
        System.out.println("\t CAFE CERIA ");
        System.out.println("\tANEKA MINUMAN ");
        System.out.println("-----------------------------");
        System.out.println("\tSPECIAL MENU : ");
        System.out.println("      1. Soft drinks");
        System.out.println("      2. Mix juice");
        System.out.println("      3. Nescafe");
        System.out.println("      4. Soda Milk");
        System.out.println("      5. Tea");
        System.out.println("-----------------------------");
        //memasukkan nama pembeli
        System.out.print("Masukkan nama pembeli : ");
        nama = scanner.nextLine();
        //memasukkan pilihan menu
        System.out.print("\nSilahkan masukkan pilihan anda : ");
        pilihan = scanner.nextInt();
        
        switch(pilihan){
            case 1:
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                break; 
            case 5:
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;  
            default:
                System.out.println("Pilihan Tidak Valid!!");
                return;
        }
        System.out.println("Pesanan akan segera kami antar\nTerima kasih " + nama + " telah berkunjung di Cafe Ceria");   
        
    }
    
}
