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
        int table = tabla.nextInt();
        System.out.print("Sunt " + table + "table");

        BigInteger boabe = BigInteger.valueOf(2);
        int i;
        for(i = 0; i < table - 1; i++){
            boabe = boabe * 2;
        }
    }
}