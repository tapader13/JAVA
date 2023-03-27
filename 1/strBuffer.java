public class strBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Muhammad");

        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.isEmpty());
        System.out.println(sb.charAt(4));
        System.out.println(sb.substring(2));
        System.out.println(sb.delete(0, 1));
        System.out.println(sb.reverse());
        System.out.println(sb.insert(3, "min"));
        System.out.println(sb.replace(0, sb.length(), "minhaj"));

    }
}
