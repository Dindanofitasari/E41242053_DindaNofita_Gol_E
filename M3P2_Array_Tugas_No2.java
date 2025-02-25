package m3p2_array;

import java.util.Random;
import java.util.Scanner;

public class M3P2_Array_Tugas_No2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int baris;
        int kolom;
        
        // Meminta input jumlah baris dan kolom dari pengguna
        System.out.print("Masukkan jumlah baris : ");
        baris = scan.nextInt();
        
        System.out.print("Masukkan jumlah kolom : ");
        kolom = scan.nextInt();
        
        // Membuat array dua dimensi dengan ukuran sesuai inputan
        int[][] angka = new int[baris][kolom];
        
        // Mengisi array dengan angka acak
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                angka[i][j] = random.nextInt(50); // Angka acak antara 0 dan 50
            }
        }
        
        // Menampilkan array dua dimensi
        System.out.println("\nArray dua dimensi acak yang dihasilkan : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(angka[i][j] + "  ");
            }
            System.out.println(); // Pindah ke baris berikutnya setelah selesai mencetak satu baris
        }
    }
}