package ayoboga.com;

public class Dosen extends Person {

    public String nisn;
    public Dosen(String name, String address) {
        super(name, address);
    }

    public void setDosen(String nisn){
        this.nisn = nisn;
    }

    public void getDosen(){
        System.out.println(
                "Nama    : " + this.name +
                        "\nAlamat  : " + this.address +
                        "\nNIDN    : " + this.nisn);
    }
}


