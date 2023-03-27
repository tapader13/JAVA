public class strone {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "minhaj";
        std1.roll = 13;
        Student std2 = new Student();
        std2.name = "tapader";
        std2.roll = 14;
        Student std3 = new Student();
        std3.name = "muhammod";
        std3.roll = 15;
        Student std4 = new Student();
        std4.name = "uddin";
        std4.roll = 16;
        Student std[] = new Student[4];
        std[0] = std1;
        std[1] = std2;
        std[2] = std3;
        std[3] = std4;
        for (Student n : std) {
            System.out.println(" " + n.name + " " + n.roll);
        }
        // for (int i = 0; i < std.length; i++) {
        // System.out.println(" " + std[i].name + " " + std[i].roll);
        // }

    }
}
