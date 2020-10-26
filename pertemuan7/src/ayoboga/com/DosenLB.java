package ayoboga.com;

public class DosenLB extends Dosen {

    public Double honor = null;
    public Integer jml_pertemuan = null;

    public DosenLB(String name, String address) {
        super(name, address);
    }
    public void setHonor(Double honor) {
        this.honor = honor;
    }
    public void setJml_pertemuan(Integer jml_pertemuan) {
        this.jml_pertemuan = jml_pertemuan;
    }
    public Double hitungHonor(){
       return this.honor * this.jml_pertemuan;
    }
    public void showDosenLB() {
        this.getDosen();
        System.out.println(
                "Honor   : " + this.honor +
                        "\nJumlah Pertemuan   : " + this.jml_pertemuan +
                        "\nHonor yang didapat : " + hitungHonor()
        );
    }
}


