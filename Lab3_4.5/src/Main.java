public class Main {
    public static void main(String[] args) {
        float sanse = 6/49F;
        System.out.println("Sansa de castig la loterie (Rosca vibes) este 6/49 = " + sanse);

        int[] a = new int[6];
        int i = 0, k = 0, j, ok = 1;
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