/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pertemuan.pkg2.pbo.pkg1;

/**
 *
 * @author akriz
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        
        Matematika mtk = new Matematika();
        System.out.println("Pertambahan     : 20 + 10 = "+mtk.pertambahan(20, 10));
        System.out.println("Pengurangan     : 10 - 5 = "+mtk.pengurangan(10, 5));
        System.out.println("Perkalian       : 10 * 3 = "+mtk.perkalian(10, 3));
        System.out.println("Pembacgian      : 21 / 2= "+mtk.pembagian(21, 2));
        
    }
}
