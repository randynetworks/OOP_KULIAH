package ayoboga.com;

public class Student extends Person {
    private String NPM;
    private String Jurusan;

    public Student(String Nama, String Alamat, String NPM, String Jurusan) {
        super(Nama, Alamat);
        this.NPM = NPM;
        this.Jurusan = Jurusan;
    }

    public String getNPM() {
        return NPM;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setNPM(String NPM) {
        this.NPM = NPM;
    }

    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }

    public void infoStudent() {
        System.out.println("\n Student");
        System.out.println("NPM\t\t: " + getNPM());
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("Jurusan\t\t: " + getJurusan());
        System.out.println("Alamat\t\t: " + getAlamat());
    }
}
