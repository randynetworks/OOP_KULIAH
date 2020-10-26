package ayoboga.com;

import static java.lang.System.out;

public class Barang extends Penjual {
    protected String barang;
    protected Integer jumlahBarang = 0, jumlahTerjual = 0;
    protected Double hargaBeli = 0.0, hargaJual = 0.0;

    protected Double getKeuntungan(Integer jumlahTerjual, Double  hargaJual,  Double hargaBeli, Integer jumlahBarang) {
        return (jumlahTerjual * hargaJual) - (jumlahBarang * hargaBeli);
    }


    protected void cetakBarang(){
        for (int i = 0; i < data.length; i++){
            this.nama = (String) data[i][0];
            this.alamat = (String) data[i][1];
            this.barang = (String) data[i][2];
            this.hargaBeli = (Double) data[i][3];
            this.hargaJual = (Double) data[i][4];
            this.jumlahBarang = (Integer) data[i][5];
            this.jumlahTerjual = (Integer) data[i][6];
            Double keuntungan = this.getKeuntungan(this.jumlahTerjual, this.hargaJual, this.hargaBeli, this.jumlahBarang);
            out.println( "Nama : " + this.nama + "\nAlamat	: " + this.alamat + "\nBarang : " + this.barang + "\nHarga Beli : " +
                    this.hargaBeli + "\nHarga Jual : " + this.hargaJual + "\nJumlah Barang : " + this.jumlahBarang + "\nJumlah Terjual : " +
                    this.jumlahTerjual + "\nKeuntungan : " + keuntungan + "\n");
        }
    }
}


