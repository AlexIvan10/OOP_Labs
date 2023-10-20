public class Main {
    public static void main(String[] args) {
        int n = 15, m = 28, i, j, k, x=0, y=0, nrPrimeGasite, ok;
        for(i = n; i <= m; i++){
            if(i%2 == 0){
                nrPrimeGasite = 0;
                for(j=i-1; j>=1 && nrPrimeGasite<2; j--){
                    ok=1;
                    for(k=2; k<=j/2; k++)
                        if(j%k == 0)
                            ok = 0;
                    if(ok == 1){
                        if(nrPrimeGasite == 0){
                            x = j;
                            nrPrimeGasite++;
                        }
                        else if(nrPrimeGasite == 1 && (x+j) == i){
                            y = j;
                            nrPrimeGasite++;
                        }
                    }
                }
                System.out.println(x + "+" + y + "=" + i);
            }
        }
    }
}