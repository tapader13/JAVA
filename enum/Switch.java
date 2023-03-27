enum Transport {
    SONI, ROBI, SOM, MONGOL, BUD, BRIHOSPOTI, SUKRO;

}

public class Switch {
    public static void main(String[] args) {
        Transport trns = Transport.SUKRO;
        switch (trns) {
            case SONI:
                System.out.println("Day number 1");
                break;

            case ROBI:
                System.out.println("Day number 2");
                break;
            case SOM:
                System.out.println("Day number 3");
                break;
            case MONGOL:
                System.out.println("Day number 4");
                break;
            case BUD:
                System.out.println("Day number 5");
                break;
            case BRIHOSPOTI:
                System.out.println("Day number 6");
                break;
            default:
                System.out.println("Holyday");
                break;
        }
    }
}
