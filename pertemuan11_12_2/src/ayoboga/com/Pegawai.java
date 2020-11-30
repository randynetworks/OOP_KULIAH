package ayoboga.com;

public class Pegawai {
    private double gaji;
    private String nama;
    private String jabatan;
    public Pegawai(String nama, double gaji, String jabatan) {
        this.nama = nama;
        this.gaji = gaji;
        this.jabatan = jabatan;
    }
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public String getJabatan() {
        return jabatan;
    }
    public String getNama() {
        return nama;
    }
    public double getTotalGaji(){
        return gaji;
    }
    void cetak(){
        System.out.println("Nama            : " + getNama());
        System.out.println("Jabatan         : " + getJabatan());
        System.out.println("Gaji Pokok      : Rp. " + getGaji());
    }
}

