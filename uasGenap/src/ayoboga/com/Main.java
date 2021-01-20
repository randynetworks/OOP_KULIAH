package ayoboga.com;

public class Main {

    public static void main(String[] args) {
        // Rekening
        Rekening R18402137 = new Rekening(18402137, 50000);
        R18402137.setMenabung(30000);
        R18402137.setAmbil(50000);

        // Bank
        Bank AYOBOGA = new Bank("001", "Bandung");

        // Nasabah
        Nasabah Paul = new Nasabah("Paul McCartney", "Bandung", 0001);
        Paul.addRekening(R18402137);

        // Petugas
        Petugas John = new Petugas("John Lennon", "Liperpool", "1010101", "CEO");


        // Cetak
        R18402137.cetak();
        Paul.cetak();
        AYOBOGA.cetak();
        John.cetak();

    }
}
