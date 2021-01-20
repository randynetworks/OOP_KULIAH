package ayoboga.com;

public class Main {

    public static void main(String[] args) {

        System.out.println("+++++++++++++++++++++++++++++");
        Manager Bernard = new Manager("Bernard",1000000);
        Bernard.cetak();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Programmer George = new Programmer("George Harry", 2000000, "Programmer");
        George.cetak();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Programmer Adin = new Programmer("Adin Chandra",2000000, "Programmer");
        Adin.cetak();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Programmer Albertina = new Programmer("Albertina", 20000000, "Programmer");
        Albertina.cetak();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Sales Baikhaqi = new Sales("Baikhaqi", 1500000);
        Baikhaqi.cetak();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

