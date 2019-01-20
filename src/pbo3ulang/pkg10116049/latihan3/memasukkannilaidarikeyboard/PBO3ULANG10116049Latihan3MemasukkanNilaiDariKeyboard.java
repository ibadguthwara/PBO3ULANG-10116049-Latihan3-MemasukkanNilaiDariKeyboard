/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan3.memasukkannilaidarikeyboard;
import java.util.Scanner;
/**
 *
 * @author ibadguthwara
 * NAMA 	     : M. Ibad Guthwara
 * KELAS	     : PBO 3 ULANG
 * NIM		     : 10116049
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menampilkan nilai dari inputan keyboard 
 */
public class PBO3ULANG10116049Latihan3MemasukkanNilaiDariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah " + nama);
    }
    
}
