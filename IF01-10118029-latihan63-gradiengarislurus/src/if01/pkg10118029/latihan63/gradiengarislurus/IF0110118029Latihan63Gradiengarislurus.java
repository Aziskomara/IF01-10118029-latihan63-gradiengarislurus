/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan63.gradiengarislurus;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan Gradien garis lurus
 */
public class IF0110118029Latihan63Gradiengarislurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        koordinat koordinat1 = new koordinat();
        koordinat1.setX1(2);
        koordinat1.setY1(10);
        koordinat1.setX2(5);
        koordinat1.setY2(7);
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d,%d) memiliki gradien sebesar %d\n"
                   ,koordinat1.getX1(),koordinat1.getY1(),koordinat1.getX2(),koordinat1.getY2(),koordinat1.hitungGradien());
    
      
        koordinat koordinat2 = new koordinat();
        koordinat2.setX1(5);
        koordinat2.setY1(1);
        koordinat2.setX2(3);
        koordinat2.setY2(12);
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d,%d) memiliki gradien sebesar %d\n"
                   ,koordinat2.getX1(),koordinat2.getY1(),koordinat2.getX2(),koordinat2.getY2(),koordinat2.hitungGradien());
               
    }
    
}
