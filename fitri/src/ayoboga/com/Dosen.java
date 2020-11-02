package ayoboga.com;

public class Dosen  extends Person{
    String NIDN;

    public Dosen(String Nama, String Alamat, String NIDN){
        super(Nama, Alamat);
        this.NIDN = NIDN;
    }

    public String getNIDN(){
        return NIDN;
    }
    public void infoDosen(){
        System.out.println("\n Dosen");
        System.out.println("NIDN\t\t: " + getNIDN());
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("Alamat\t\t: " + getAlamat());
    }
}
