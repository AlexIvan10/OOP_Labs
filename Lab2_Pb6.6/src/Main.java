import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int casute = 64;
        System.out.print("Pe o tabla de sah sunt " + casute + " casute\n");

        BigInteger boabe = BigInteger.valueOf(0);
        BigInteger boabePeCasuta = BigInteger.valueOf(1);
        int i;
        for(i = 1; i <= casute; i++){
            boabe = boabe.add(boabePeCasuta);
            boabePeCasuta = boabePeCasuta.multiply(BigInteger.valueOf(2));
        }
        System.out.println("Pe tabla de sah se afla " + boabe + " boabe");
    }
}