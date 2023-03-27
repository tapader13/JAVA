class create {
    private int roll;
    private String name;

    // click right side then source action then select it.
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public int getRoll() {
    // return roll;
    // }

    // public void setRoll(int r) {
    // roll = r;
    // }
}

public class Encapsulation {
    public static void main(String[] args) {
        create cr = new create();
        cr.setRoll(13);
        System.out.println(cr.getRoll());
    }
}
