package ayoboga.com;

public class Student extends Person{
    public String npm, jurusan;
    public Student(String name, String address) {
        super(name, address);
    }

    public void setStudent(String jurusan, String npm){
        this.jurusan = jurusan;
        this.npm = npm;
    }

    public void showStudent(){
        System.out.println(
                "Nama    : " + this.name +
                "\nAlamat  : " + this.address +
                "\nNPM     : " + this.npm +
                "\nJurusan : " + this.jurusan);
    }
}

