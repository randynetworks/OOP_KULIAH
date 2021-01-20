package ayoboga.com;

public class Kelas {
    protected String kode_kelas;
    protected String name_kelas;
    protected Mahasiswa mhs;

    public Kelas(String kode_kelas, String name_kelas){
        this.kode_kelas = kode_kelas;
        this.name_kelas = name_kelas;
    }

    public String getKode_kelas() {return kode_kelas;}

    public String getName_kelas() {return name_kelas;}

    public Mahasiswa addMahasiswa(Mahasiswa mhs) { return this.mhs = mhs; }
    public Mahasiswa displayMahasiswa() { return  mhs; }

    public void cetak(){
        System.out.println(
                "=========== KELAS ============" + "\n" +
                        "Kode Kelas  : " + this.getKode_kelas()  + "\n" +
                        "Nama Kelas  : " + this.getName_kelas() + "\n" +
                        "Mahasiswa   : " + this.displayMahasiswa().getName() + "\n" +
                        "==============================" + "\n"
        );
    }
}

