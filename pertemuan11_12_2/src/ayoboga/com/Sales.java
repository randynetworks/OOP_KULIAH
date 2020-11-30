package ayoboga.com;

public class Sales extends Pegawai {
    private double bonus=5000000;

    public double getBonus() { return bonus;}

    public void setBonus(double bonus) { this.bonus = bonus; }

    @Override

    public double getTotalGaji() {
        return super.getTotalGaji()+this.bonus;
    }

    public Sales(String nama, double gaji) {
        super(nama, gaji, "Sales");
    }

    @Override

    void cetak() {
        super.cetak();
        System.out.println("Bonus           : Rp. " + getBonus());
        System.out.println("Total Gaji      : Rp. " + getTotalGaji());
    }
}

