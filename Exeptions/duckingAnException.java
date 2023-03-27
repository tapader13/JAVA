class Exp {
    public void result() throws ClassNotFoundException {
        // Class.forName("cah");
        Class.forName("duckingAnException");
    }
}

public class duckingAnException {
    public static void main(String[] args) {
        Exp exp = new Exp();
        try {

            exp.result();
            System.out.println("Everything is Fine.");
        } catch (Exception e) {
            System.out.println("Class not found.");
        }
    }
}
