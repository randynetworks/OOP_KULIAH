package ayoboga.com;

public class Main {

    public static void main(String[] args) {
        Student randy = new Student("Randy", "Jl. Sukasirna");
        randy.setStudent("System Information", "18402137");
        randy.showStudent();

        System.out.println("===========================");

        DosenLB paul = new DosenLB("Paul McCartney", "Jl. Ciparay");
        paul.setDosen("18402138");
        paul.setHonor(100000.0);
        paul.setJml_pertemuan(12);
        paul.getDosen();
        paul.showDosenLB();
    }
}

