package ayoboga.com;

public class Manager  extends Pegawai{
    private double tunjangan=9000000;

    public Manager(String nama, double gaji) {
        super(nama, gaji, "Manajer");
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    @Override

    public double getTotalGaji() {
        return super.getTotalGaji()+this.tunjangan;
    }

    void cetak() {
        super.cetak();
        System.out.println("Tunjangan       : Rp. " + getTunjangan());
        System.out.println("Total Gaji      : Rp. " + getTotalGaji());
    }
}
