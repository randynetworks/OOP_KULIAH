package ayoboga.com;

public class Dosen extends Person{
    protected String NIDN;
    protected Mahasiswa mhs ;
    protected MataKuliah mtk ;
    public Dosen(String name,String address,String NIDN) {

        super(name, address);
        this.NIDN = NIDN;
    }

    public String getNIDN() { return NIDN; }
    public Mahasiswa addMahasiswa(Mahasiswa mhs) { return this.mhs = mhs; }
    public Mahasiswa displayMahasiswa() { return  mhs; }
    public MataKuliah addMatakuliah(MataKuliah mtk) { return this.mtk = mtk; }
    public MataKuliah displayMatakuliah() { return mtk; }

    public void cetak(){
        System.out.println(
                "=========== DOSEN ============" + "\n" +
                "Nama        : " + this.getName()  + "\n" +
                "Alamat      : " + this.getAddress() + "\n" +
                "NIDN        : " + this.getNIDN() + "\n" +
                "Mahasiswa   : " + this.displayMahasiswa().getName() + "\n" +
                "Mata Kuliah : " + this.displayMatakuliah().getName() + "\n" +
                "==============================" + "\n"
        );
    }
}
