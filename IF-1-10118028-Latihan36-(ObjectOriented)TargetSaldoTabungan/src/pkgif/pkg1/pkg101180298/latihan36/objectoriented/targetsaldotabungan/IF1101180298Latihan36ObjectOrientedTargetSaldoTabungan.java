/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg101180298.latihan36.objectoriented.targetsaldotabungan;

/**
 *
 * @author User
 *  NAMA      : Surya Fakhriy Hasbi
    KELAS     : IF-01 2018
    NIM       : 10118028
    DESKRIPSI : (Object Oriented) Target Saldo Tabungan

 */
public class IF1101180298Latihan36ObjectOrientedTargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabungan tab = new Tabungan();

        tab.saldo = 3500000;
        tab.bunga = 8;
        int saldoTarget = 6000000;

        tab.HitungLamaSaldoTarget(tab.saldo,saldoTarget); 
    }
    
}
