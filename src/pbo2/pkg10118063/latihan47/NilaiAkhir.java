/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118063.latihan47;

/**
 *
 * @author 
 * NAMA     : Naufal Asha
 * KELAS    : IF-2
 * NIM      : 10118063
 */
public class NilaiAkhir {
    private double quiz, uts, uas, nilaiAkhir;
    
    public NilaiAkhir(double quiz, double uts, double uas){
        this.quiz = quiz;
        this.uas = uas;
        this.uts = uts;
    }
    
    private double hitungNilaiAkhir(){
        return (quiz*0.2) + (uts*0.3) + (uas*0.5);
    }
    
    private String index(double nilaiAkhir){
        if(nilaiAkhir >= 80 && nilaiAkhir <= 100)return "A";
        else if(nilaiAkhir >= 68 && nilaiAkhir <= 80)return "B";
        else if(nilaiAkhir >= 56 && nilaiAkhir <= 68)return "C";
        else if(nilaiAkhir >= 45 && nilaiAkhir <= 56)return "D";
        else return "E";
    }
    
    private String keterangan(String index){
        String keterangan;
        switch(index){
            case "A" : keterangan = "Sangat Baik"; break;
            case "B" : keterangan = "Baik"; break;
            case "C" : keterangan = "Cukup"; break;
            case "D" : keterangan = "Kurang"; break;
            default : keterangan = "Sangat Kurang"; break;
        }
        return keterangan;
    }
    
    public void tampilData(){
        nilaiAkhir = hitungNilaiAkhir();
        
        System.out.println("Quiz\t\t : " + quiz);
        System.out.println("UTS\t\t : " + uts);
        System.out.println("UAS\t\t : " + uas);
        
        System.out.println("\nNilai Akhir\t : " + nilaiAkhir);
        
        System.out.println("\nIndex = " + index(nilaiAkhir));
        System.out.println("Keterangan = " + keterangan(index(nilaiAkhir)));
        System.out.println("");
    }
}
