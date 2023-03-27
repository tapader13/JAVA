@FunctionalInterface
interface name {
    int myName(int i, int j);
}

public class returnType {
public static void main(String[] args) {
        name nm = (i, j) -> i * j;

      int res=  nm.myName(13, 14);
System.out.println(res);
    }
}