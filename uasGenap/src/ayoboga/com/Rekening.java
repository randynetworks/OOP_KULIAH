package ayoboga.com;

public class Rekening {

    protected Integer no_rek, saldo;

    public Rekening(Integer no_rek, Integer saldo){
        this.no_rek = no_rek;
        this.saldo = saldo;
    }

    public Integer getNo_rek() {return no_rek;}
    public Integer getSaldo() {return saldo;}

    public Integer setMenabung(Integer uang){
        return this.saldo += uang;
    }

    public Integer setAmbil(Integer uang){
        return this.saldo -= uang;
    }

    public void cetak(){
        System.out.println(
                "======= REKENING ======\n" +
                "No_REK         : " + getNo_rek() + "\n" +
                "Saldo          : " + getSaldo()
        );
    }



}
