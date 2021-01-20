package ayoboga.com;

public class Main {

    public static void main(String[] args) {
        // MataKuliah
        MataKuliah Java = new MataKuliah("001", "Java Programming", 2);

        // Mahasiswa
        Mahasiswa Randy = new Mahasiswa("Randy Ramadhan", "Bandung", "18402137", 5);
        Randy.addMatakuliah(Java);

        // Kelas
        Kelas MSI_R42_18 = new Kelas("MSIR4218", "MSI_R42_18");
        MSI_R42_18.addMahasiswa(Randy);

        // Dosen
        Dosen Paul = new Dosen("Paul McCarney", "Liverpool", "0001");
        Paul.addMahasiswa(Randy);
        Paul.addMatakuliah(Java);

        // BAGIAN CETAK
        Paul.cetak();
        Randy.cetak();
        MSI_R42_18.cetak();
        Java.cetak();


    }

}
