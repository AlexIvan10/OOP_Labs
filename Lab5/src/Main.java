public class Main {
    public static void main(String[] args) {
        NumereComplexe a = new NumereComplexe(5, 2);
        NumereComplexe b = new NumereComplexe(1, -1);
        System.out.println(a.adunare(b));
        System.out.println(a.scadere(b));
        System.out.println(a.inmultire(b));
        System.out.println(a.inmultireScalar(3));

        int[] arr = new int[]{1, 2, 3, 4, 5};
//        int[] arr2 = arr; //shellow copy
        int[] arr2;
        arr2 = System.arraycopy(arr, 0, arr2, 0, 5); //deep copy
//        arr2[1] = 5;
        System.out.println(arr[1]);

        int i = 0, j = arr.length - 1;
        int aux;
        while(i < j){
            aux = arr[i];
            arr[i] = arr[j];
            arr[j] = aux;
            i++;
            j--;
        }
        for(int element:arr){
            System.out.print(element + " ");
        }
        System.out.println();

        int[][] matrice = new int[3][3];
        int rows = matrice.length;
        int col = matrice[0].length;

        MatriceComplex m1 = new MatriceComplex(2, 2);
        MatriceComplex m2 = new MatriceComplex(2, 2);

        m1.matrice[0][0] = new NumereComplexe(5, 2);
        m1.matrice[0][1] = new NumereComplexe(5, 2);
        m1.matrice[1][0] = new NumereComplexe(5, 2);
        m1.matrice[1][1] = new NumereComplexe(5, 2);

        m2.matrice[0][0] = new NumereComplexe(1, -1);
        m2.matrice[0][1] = new NumereComplexe(2, -1);
        m2.matrice[1][0] = new NumereComplexe(3, -1);
        m2.matrice[1][1] = new NumereComplexe(4, -1);

        m1 = m1.add(m2);

        for(i = 0; i < m1.matrice.length; i++){
            for(j = 0; j < m1.matrice[0].length; j++)
                System.out.print(m1.matrice[i][j] + " ");
            System.out.println();
        }

    }
}