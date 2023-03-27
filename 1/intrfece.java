interface father {
    // interface var final and static hoy always.
    String cele = "minai";
    String meye = "minu";

    // every method interface ke ander public abstract e hota.
    void dekaSuna();

}

interface fufu extends father {
    void sahajjo();
}

interface caca {
    void bajar();
}

class mother implements caca, fufu {
    public void dekaSuna() {
        System.out.println("DekaSuna kora && poranu baccader.");
    }

    public void sahajjo() {
        System.out.println("Ammar onupostitite ranna kora.");
    }

    public void bajar() {
        System.out.println("Maje maje bazar kore deoa.");
    }
}

public class intrfece {
    public static void main(String[] args) {
        mother mthr = new mother();
        mthr.dekaSuna();
        mthr.bajar();
        mthr.sahajjo();
        System.out.println(father.cele);
        System.out.println(father.meye);
    }
}
