import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//            Scanner input = new Scanner(System.in);
//            int inputValue = input.nextInt();
//            System.out.println("Valoare citita de la tastatura este " + inputValue);
//
//            int maxInt = Integer.MAX_VALUE;
//
//            try{
//                System.out.println(maxInt / inputValue);
//            }
//            catch(ArithmeticException exception){
//                System.out.println("Hei ai introdus o valoare gresita\nIntrodu o alta valoare");
//                inputValue = input.nextInt();
//            }
//                System.out.println(maxInt / inputValue);

        Scanner tabla = new Scanner(System.in);
        int casute = tabla.nextInt();
        System.out.print("Sunt " + casute + " casute\n");

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