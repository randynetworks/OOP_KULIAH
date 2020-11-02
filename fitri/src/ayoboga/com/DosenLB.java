package ayoboga.com;

public class DosenLB extends Dosen{

    double Honor = 100000.0;
    int Jml_pertemuan;

    public DosenLB(String Nama, String Alamat, String NIDN, Integer jml_pertemuan) {
        super(Nama, Alamat, NIDN);
        this.setJml_pertemuan(jml_pertemuan);
        this.setHonor(this.Honor);
        this.sethitungHonor(jml_pertemuan, this.getHonor());
    }

    public Double getHonor(){
        return this.Honor;}
    public int getJml_pertemuan(){
        return Jml_pertemuan;}
    public void setHonor(Double Honor){
        this.Honor = Honor;}
    public Double sethitungHonor(Integer jml_pertemuan, Double honor){
        return jml_pertemuan * honor; }
    public void setJml_pertemuan(int Jml_pertemuan){
        this.Jml_pertemuan = Jml_pertemuan;
    }

    public void infoDosenLB(){
        System.out.println("\n DosenLB");
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("Alamat\t\t: " + getAlamat());
        System.out.println("Honor\t\t: " + getHonor());
        System.out.println("Pertemuan\t\t: " + getJml_pertemuan());
        System.out.println("Total Honor\t\t: " + sethitungHonor(this.Jml_pertemuan, this.getHonor()));
    }
}
