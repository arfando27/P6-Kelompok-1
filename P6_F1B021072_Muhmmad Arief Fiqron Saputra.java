package percobaan6;

// Kelas orang tua (superclass)
class OrangTua {
    
    public void ortu() {
        System.out.println("kelas orang tua");
    }
}

// Kelas anak (subclass) yang mewarisi dari OrangTua
class Anaksulung extends OrangTua {
   
    @Override
    public void ortu() {
        System.out.println("anak sulung");
    }

    public void bungsu() {
        System.out.println("anak bungsu");
        
    }
}

class Anakbungsu extends OrangTua{
    
    @Override
    public void ortu(){
        System.out.println("anak sulung nakal");   
    }
    
    public void pintar(){
        System.out.println("anak bungsu pintar ");
        
        
    }
}


public class ACCP6 {
    public static void main(String[] args) {
        
        Anaksulung anak = new Anaksulung();
        anak.ortu();
        anak.bungsu();
        System.out.println("");
        
        Anakbungsu sifatAnak = new Anakbungsu();
        sifatAnak.Anak();
        sifatAnak.pintar();
        
    }
}

