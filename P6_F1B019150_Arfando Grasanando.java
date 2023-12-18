
package com.mycompany.p6;

class Seniman {
    String nama;
    String teknik;

    public Seniman(String nama, String teknik) {
        this.nama = nama;
        this.teknik = teknik;
    }

    public void berkreasi() {
        System.out.println(nama + " sedang menggunakan teknik " + teknik + " untuk berkarya.");
    }

    public void tampilkanProfil() {
        System.out.println("Ini adalah " + nama + ", seorang seniman.");
    }
}

class Murid extends Seniman {
    private String gaya;
    private String alat;

    public Murid(String nama, String teknik, String gaya, String alat) {
        super(nama, teknik);
        this.gaya = gaya;
        this.alat = alat;
    }

    @Override
    public void berkreasi() {
        System.out.println(nama + " memiliki gaya " + gaya + " dan menggunakan " + alat + " dengan teknik " + teknik + ".");
    }

    public void belajar() {
        System.out.println(nama + " sedang belajar dari sang maestro.");
    }
}

public class P6 {
    public static void main(String[] args) {
       
        Murid murid1 = new Murid("Vincent van Gogh", "Impressionisme", "modern", "kuas");
        murid1.berkreasi();
        murid1.tampilkanProfil(); 
        murid1.belajar();

        System.out.println();

     
        Murid murid2 = new Murid("Leonardo da Vinci", "Renaissance", "tradisional", "pensil");
        murid2.berkreasi(); 
        murid2.tampilkanProfil(); 
        murid2.belajar();
    }
}
