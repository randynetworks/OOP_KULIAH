package ayoboga.com;

public class Employee extends Manager{

    public Employee(String department, String nama, String nip, Integer gol) {
        super(department);
        System.out.println(
                "Department    : " + getDepartment() +
                        "\nNama Karyawan : " + this.getNama(nama) +
                        "\nNIP Karyawan  : " + this.getNip(nip) +
                        "\nGolongan      : " + this.getGol(gol)

        );
    }

    public String getNama(String nama) {
        return nama;
    }

    public String getNip(String nip) {
        return nip;
    }

    public Integer getGol(Integer gol) {
        return gol;
    }
}


