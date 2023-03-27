class minhaj {
    public void result() {
        System.out.println("Minhaj result....");
    }
}

class tapader extends minhaj {
    @Override
    public void result() {

        System.out.println("Tapader result....");
    }
    // kuno method override korar smy kuno bul jodi method name e take tahole ta
    // show kore Annotations @Override.
    // public void resut() {

    // System.out.println("Tapader result....");
    // }
}

public class Annotations {
    public static void main(String[] args) {
        tapader tpdr = new tapader();
        tpdr.result();
    }
}
