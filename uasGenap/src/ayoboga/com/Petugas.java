package ayoboga.com;

public class Petugas extends Person{
    protected String NIP;
    protected String Jabatan;

    public Petugas(String name, String address, String NIP, String Jabatan) {
        super(name, address);
        this.NIP = NIP;
        this.Jabatan = Jabatan;
    }

    public String getNIP() {return NIP;}
    public String getJabatan() {return Jabatan;}

    public void cetak() {
        System.out.println(
                "======= PETUGAS =======\n" +
                        "Nama Petugas   : " + this.getName() +"\n" +
                        "Alamat         : " + this.getAddress() +"\n" +
                        "NIP            : " + this.getNIP() +"\n" +
                        "Jabatan        : " + this.getJabatan()
        );
    }
}
