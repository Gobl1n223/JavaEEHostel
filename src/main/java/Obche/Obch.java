package Obche;

public class Obch {
    private int id;
    private int number1;
    private String address;

    public Obch(int id, int number1, String address) {
        this.id = id;
        this.number1 = number1;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Obch(int number1, String address) {
        this.number1 = number1;
        this.address = address;
    }

    public Obch(int id) {
        this.id = id;
    }

    public Obch() {
    }
}
