public class Main {
    public static void main(String[] args) {

        int m = Integer.parseInt("10011", 2);
        int n = Integer.parseInt("100000110111", 2);
        //                          100001001111
        int i = 2, j = 6;
        int left = n >> (i + j) << (i + j);
        int right = n >> i << i ^ n;
        String bString2 = Integer.toBinaryString(left);
        System.out.println(bString2);
        n =(left >> i | m) << i | right;

        String bString = Integer.toBinaryString(n);
        System.out.println(bString);
    }
}