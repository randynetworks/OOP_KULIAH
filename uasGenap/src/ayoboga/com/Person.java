package ayoboga.com;

public class Person {
    protected String name, address;
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {return name;}
    public String getAddress() { return address;}
}
