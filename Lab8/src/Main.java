import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int ok;
//        do{
//            float hash;
//            try{
//                System.out.println("Introduceti pin");
//                int pin = input.nextInt();
//                hash = 1 / pin;
//                ok = 1;
//            }catch (InputMismatchException e){
//                System.out.println("Ati introdus caractere invalide");
//                ok = 0;
//                input.next();
//            }catch (ArithmeticException e){
//                System.out.println("Introdu alt pin");
//                ok = 0;
//            }
//        }while(ok == 0);

        BankAccount b = new BankAccount(200);
        try{
            b.retrageNumerar(210);
        }catch (FondInsuficientException e){
            System.out.println(e.getMessage());
            System.out.println("nai bani");
        }


    }
}