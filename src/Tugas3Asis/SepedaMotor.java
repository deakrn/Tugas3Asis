/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3Asis;

/**
 *
 * @author user
 */
public class SepedaMotor extends Kendaraan {
    private String namaKendaraan;
    private String tipeKendaraan;
    private int kapasitasMesin;
    private float bahanBakar;

    public String getNama() {
        return namaKendaraan;
    }

    @Override
    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getTipe() {
        return tipeKendaraan;
    }

    @Override
    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    @Override
    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    @Override
    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }
    
    @Override
    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
    @Override
    public float getBahanBakar(){
        return bahanBakar;
    }
    @Override
    public float efektifitas(){
        float efektifitas, x, y;
        x = getJarakTempuh();
        y = (float) Math.floor(getBahanBakar());
        efektifitas = (float) Math.exp(x/y) * (float) Math.log10(2);
        return efektifitas;
    }
    public String cekEfektifitas(){
        String efektif;
        if(efektifitas() > 0 && efektifitas() <= 0.5){
            efektif  = "Efektif";
        }else{
            efektif  = "Tidak Efektif";
        }
        return efektif;
    }
    @Override
    public void infoKendaraan(){
        System.out.println("Nama Kendaraan\t\t: " + getNama());
        System.out.println("Tipe Kendaraan\t\t: " + getTipe());
        System.out.println("Kapasitas Mesin\t\t: " + getKapasitasMesin());
        System.out.println("Bahan Bakar\t\t: " + getBahanBakar());
        super.infoKendaraan();
        System.out.println("Keefektifitasan Mesin\t: " + cekEfektifitas());
    }
}

    

