interface Computer {
    void code();
}

class Mobile implements Computer {
    public void code() {
        System.out.println("Code,Compile,Run : Slower");
    }
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Code,Compile,Run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Code,Compile,Run : Faster");
    }
}

class Developer {
    void code(Computer cmp) {
        cmp.code();
    }
}

public class interfece {
    public static void main(String[] args) {
        Computer mbl = new Mobile();
        Computer lap = new Laptop();
        Computer dsk = new Desktop();
        Developer dv = new Developer();
        dv.code(mbl);
    }
}