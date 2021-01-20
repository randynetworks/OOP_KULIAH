package ayoboga.com;

public class Mahasiswa extends Person{

    protected String NPM;
    protected Integer Semester;
    protected MataKuliah Mtk;
    public Mahasiswa(String name, String address, String npm, Integer Semester) {
        super(name, address);
        this.NPM = npm;
        this.Semester = Semester;
    }

    public String getNPM() { return NPM; }
    public Integer getSemester() { return Semester; }
    public MataKuliah addMatakuliah(MataKuliah mtk) { return this.Mtk = mtk; }
    public MataKuliah displayMatakuliah() { return Mtk; }

    public void cetak(){
        System.out.println(
                "========= MAHASISWA ==========" + "\n" +
                        "Nama        : " + this.getName()  + "\n" +
                        "Alamat      : " + this.getAddress() + "\n" +
                        "NPM         : " + this.getNPM() + "\n" +
                        "Semester    : " + this.getSemester() + "\n" +
                        "Mata Kuliah : " + this.displayMatakuliah().getName() + "\n" +
                "==============================" + "\n"
        );
    }
}
