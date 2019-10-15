/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3Asis;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class TEST {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Kendaraan\t\t\t: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Tipe Kendaraan\t\t\t: ");
        String tipe = input.next();
        
        System.out.print("Masukkan Kapasitas Kendaraan\t\t: ");
        int kapastitas = input.nextInt();
        
        System.out.print("Masukkan Bahan Bakar Kendaraan\t\t: ");
        float bahanbakar = input.nextFloat();
        double a  =13.42134;
        System.out.print("Masukkan ID Kendaraan\t\t\t: ");
        int id = input.nextInt();
        
        System.out.print("Masukkan Jarak Tempuh Awal Kendaraan\t: ");
        float awal = input.nextFloat();
        
        System.out.print("Masukkan Jarak Tempuh Kendaraan\t\t: ");
        float akhir = input.nextFloat();
        
        System.out.println("==================================");
        
        Kendaraan testmain;
        if(nama == "mobil" || nama == "Mobil" || nama == "MOBIL"){
            testmain = new Mobil();
            
        }else{
            testmain = new SepedaMotor();
        }
        testmain.setNamaKendaraan(nama);
        testmain.setTipeKendaraan(tipe);
        testmain.setKapasitasMesin(kapastitas);
        testmain.setBahanBakar(bahanbakar);
        testmain.setIdKendaraan(id);
        testmain.setJarakTempuhAwal(awal);
        testmain.setJarakTempuh(akhir);
        testmain.infoKendaraan();
    }
}


