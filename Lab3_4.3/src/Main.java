import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "Ana are mere";
        String voc = "aeiouAEIOU";
        int i, c=0, v=0;
        for(i=0; i<str.length(); i++){
            if(voc.contains(String.valueOf(str.charAt(i)))) {
                v++;
            } else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'z')
                c++;
        }
        System.out.println("Sunt " + v + " vocale");
        System.out.println("Sunt " + c + " consoane");

        System.out.print("Introduceti un text: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int index = 0;
        for(i=0; i<s.length() && index == 0; i++){
            if(voc.contains(String.valueOf(s.charAt(i))))
                index = i+1;
        }
        if(index == 0)
            System.out.println("Nu sunt vocale in sir");
        else
            System.out.println("Prima vocala se afla pe pozitia " + index);
    }
}