enum Transport {
    CYCLE(10), BYKE(20), BUS, TRACK(40), CAR(50);

    private int speed;

    private Transport() {
        speed = 30;
    }

    private Transport(int s) {
        speed = s;
    }

    public int getSpeed() {
        return speed;
    }

    public Transport setSpeed(int speed) {
        this.speed = speed;
        return null;
    }

}

public class Dflt {
    public static void main(String[] args) {
        Transport t = Transport.BUS.setSpeed(90);
        Transport trn[] = Transport.values();

        for (Transport tr : trn) {
            System.out.println(tr + " " + tr.getSpeed() + "km");
        }
    }
}