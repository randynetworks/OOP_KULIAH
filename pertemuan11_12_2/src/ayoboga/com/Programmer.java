package ayoboga.com;

public class Programmer extends Pegawai {
    public Programmer(String nama, double gaji, String jabatan) {
        super(nama, gaji, jabatan);
    }

    @Override

    void cetak() {
        super.cetak();
        System.out.println("Total Gaji      : Rp." +super.getTotalGaji());
    }
}
