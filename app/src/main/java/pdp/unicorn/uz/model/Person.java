package pdp.unicorn.uz.model;

public class Person
{
    private String name;
    private String telNumber;

    public Person(String name, String telNumber) {
        this.name = name;
        this.telNumber = telNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelNr() {
        return telNumber;
    }

    public void setTelNr(String telNr) {
        this.telNumber = telNr;
    }
}
