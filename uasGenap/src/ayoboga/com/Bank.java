package ayoboga.com;

public class Bank {
    protected String kode_bank;
    protected String lokasi;
    protected Nasabah Nsb;

    public Bank(String kode_bank, String lokasi){
        this.kode_bank = kode_bank;
        this.lokasi = lokasi;
    }

    public String getKode_bank() {return kode_bank;}
    public String getLokasi() {return lokasi;}

    public void cetak() {
        System.out.println(
                "========= BANK =========\n" +
                        "Kode Bank      : " + this.getKode_bank() +"\n" +
                        "Lokasi         : " + this.getLokasi()
        );
    }

}
