abstract class computer {
    public abstract void extraSoftWare();

    public void softWare() {
        System.out.println("SoftWare.");
    }
}

class part extends computer {
    public void extraSoftWare() {
        System.out.println("Extra SoftWare.");
    }
}

// abstract method only exist in abstract class.abstract class ko object nehi
// bana sakta.abstract method ko always define karna pore ga.Agar abstract class
// ka andar abstract method nehi hea t koi masla nehi.aram se code cal jay ga.
public class abstruct {
    public static void main(String[] args) {
        part pt = new part();
        pt.extraSoftWare();
    }
}
