public class TypeConversion {
    public static void main(String[] args) {
        byte b = 127;
        System.out.println(b);
        int n = 257;
        System.out.println(n);
        byte k = (byte) n;
        System.out.println(k);

        float f = 5.6f;
        int t = (int) f;
        System.out.println(t);
        // type promotion

        byte a1 = 30;
        byte b1 = 20;
        int ans = a1 * b1; // going over the limit of byte, so promoted to int
        System.out.println(ans);
    }
}
