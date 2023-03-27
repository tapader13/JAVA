enum Transport {
    CYCLE(10), BYKE(20), BUS(30), TRACK(40), CAR(50);

    int speed;

    Transport(int s) {
        speed = s;
    }
}

public class Trnpsrt {
    public static void main(String[] args) {

        Transport trn[] = Transport.values();
        for (Transport tr : trn) {
            System.out.println(tr + " " + tr.speed + "km");
        }

        // Transport trn = Transport.BYKE;
        // if (trn.ordinal() == 1) {
        // System.out.println("Byke");
        // } else {
        // System.out.println("Anything");
        // }

        // Transport trn[] = Transport.values();
        // for (Transport tr : trn) {
        // System.out.print(tr + " ");
        // }
    }
}