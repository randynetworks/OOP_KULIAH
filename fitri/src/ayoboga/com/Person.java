package ayoboga.com;

public class Person {
    private String Nama;
    private String Alamat;
    public Person(String Nama, String Alamat){
        this.Nama = Nama;
        this.Alamat = Alamat;
    }
    public String getNama(){
        return Nama;
    }
    public String getAlamat(){
        return Alamat;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setAlamat(String Alamat){
        this.Nama = Alamat;
    }
    public void infoperson(){
        System.out.println("\n Person");
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("Alamat\t\t: " + getAlamat());

    }
}
