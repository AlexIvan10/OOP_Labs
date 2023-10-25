import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            //4.1

        System.out.println("4.1\n");
        int n = 15, m = 50, i, j, k, x = 0, y = 0, nrPrimeGasite, ok;
        for (i = n; i <= m; i++) {
            if (i % 2 == 0) {
                nrPrimeGasite = 0;
                for (j = i - 1; j >= 1 && nrPrimeGasite < 2; j--) {
                    ok = 1;
                    for (k = 2; k <= j / 2; k++)
                        if (j % k == 0)
                            ok = 0;
                    if (ok == 1) {
                        if (nrPrimeGasite == 0) {
                            x = j;
                            nrPrimeGasite++;
                        } else if (nrPrimeGasite == 1 && (x + j) == i) {
                            y = j;
                            nrPrimeGasite++;
                        }
                    }
                }
                System.out.println(i + "=" + x + "+" + y);
            }
        }
        System.out.println("\n4.2\n");

            //4.2

        int varsta = 18, sex = 1, inaltime = 175;
        short wrap;
        wrap = (short)varsta;
        wrap = (short)((wrap << 1) | (short)sex);
        wrap = (short)((wrap << 8) | (short)inaltime);
        System.out.println("Numarul variabilei short " + wrap);
        System.out.println("Inaltimea " + (wrap & 0xff));
        System.out.println("Genul " + (wrap >> 8 & 1));
        System.out.println("Varsta " + (wrap >> 9 & 0x7f));
        System.out.println("\n4.3\n");

            //4.3

        String str = "Ana are mere";
        String voc = "aeiouAEIOU";
        int c = 0, v = 0;
        for(i = 0; i < str.length(); i++){
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
        System.out.println("\n4.4\n");

            //4.4

        String str1 = "Ana are ";
        String str2 = "mere";
        String str3 = str1 + str2;
        System.out.println(str3 == "Ana are mere");
        System.out.println(str3.equals("Ana are mere"));
        System.out.println("\n4.5\n");

            //4.5

        float sanse = 6/49F;
        System.out.println("Sansa de castig la loterie (Rosca vibes) este 6/49 = " + sanse);

        int[] a = new int[6];
        k = 0;
        int max = 49;
        int min = 1;
        int range = max - min + 1;
        for(i=0; i<6; i++){
            if(k == 0)
                a[k++] = (int)((Math.random() * range) + min);
            else{
                ok = 1;
                while(ok == 1){
                    a[k] = (int)((Math.random() * range) + min);
                    ok = 0;
                    for(j=0; j<k; j++){
                        if(a[j] == a[k])
                            ok = 1;
                    }
                }
                k++;
            }
        }
        System.out.print("6 numere random: ");
        for(i=0; i<6; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        long stack = 0;
        stack = stack | (1L << a[0]);
        stack = stack | (1L << a[1]);
        stack = stack | (1L << a[2]);
        stack = stack | (1L << a[3]);
        stack = stack | (1L << a[4]);
        stack = stack | (1L << a[5]);

        System.out.print("Ordine crescatoare: ");
        for(i=0; i<64; i++)
            if(((stack >> i) & 1L) == 1L)
                System.out.print(i + " ");
        System.out.println();

        System.out.print("Ordine descrescatoare: ");
        for(i=63; i>=0; i--)
            if(((stack >> i) & 1L) == 1L)
                System.out.print(i + " ");
        System.out.println();
    }
}