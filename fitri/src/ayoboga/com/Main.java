package ayoboga.com;

public class Main {

    public static void main(String[] args) {
            Person a = new Person("Febry Almeera", "Jakarta");
            a.infoperson();

            DosenLB c = new DosenLB("Dyianti Febianitri", "Palembang", "8000000", 885);
            c.infoDosenLB();

            Student d = new Student ("Fitri","Bandung","18300006","MSI");
            d.infoStudent();
            System.out.println("-----------------------------------");
    }
}
