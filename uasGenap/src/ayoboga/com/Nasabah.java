package ayoboga.com;

public class Nasabah extends Person{
    protected Integer kode_nasabah;
    protected Rekening Rek;

    public Nasabah(String name, String address, Integer Kode_nasabah) {
        super(name, address);
        this.kode_nasabah = Kode_nasabah;
    }

    public Integer getKode_nasabah() {return kode_nasabah;}
    public Rekening addRekening(Rekening rek){return this.Rek = rek;}
    public void cetak() {
        System.out.println(
                "======= NASABAH =======\n" +
                "No rek         : " + this.Rek.no_rek +"\n" +
                "Kode Nasabah   : " + this.getKode_nasabah() +"\n" +
                "Nama Nasabah   : " + this.getName() +"\n" +
                "Alamat         : " + this.getAddress()
        );
    }
}
