public class string {
    public static void main(String[] args) {
        // String str = new String("tapader");
        // str = "minhaj";
        // System.out.println(str);
        String st = "men";
        String sr = "men";
        String str = new String("tapader");
        System.out.println(str.length());
        // System.out.println(str.charAt(2));
        // System.out.println(str.concat(" " + "minhaj"));
        // System.out.println(str.replace(str.charAt(0), st.charAt(0)));
        // System.out.println(st.hashCode());

        // A negative integer: if the first string (i.e., st) is lexicographically less
        // than the second string (i.e., sr).
        // Zero: if both strings are equal.
        // A positive integer: if the first string (i.e., st) is lexicographically
        // greater than the second string (i.e., sr).
        System.out.println(st.compareTo(sr));

    }
}