public class MatriceComplex {
    NumereComplexe[][] matrice;
    MatriceComplex(int rows, int cols){
        matrice = new NumereComplexe[rows][cols];
    }

    public MatriceComplex add(MatriceComplex matrice2){
        MatriceComplex rezultat = new MatriceComplex(matrice.length, matrice[0].length);
        for(int i = 0; i < matrice.length; i++)
            for(int j = 0; j < matrice[0].length; j++)
                rezultat.matrice[i][j] = matrice[i][j].adunare(matrice2.matrice[i][j]);
        return rezultat;
    }

    public MatriceComplex sub(MatriceComplex matrice2){
        MatriceComplex rezultat = new MatriceComplex(matrice.length, matrice[0].length);
        for(int i = 0; i < matrice.length; i++)
            for(int j = 0; j < matrice[0].length; j++)
                rezultat.matrice[i][j] = matrice[i][j].scadere(matrice2.matrice[i][j]);
        return rezultat;
    }

    public MatriceComplex inmult(MatriceComplex matrice2){
        MatriceComplex rezultat = new MatriceComplex(matrice.length, matrice[0].length);
        for(int i = 0; i < matrice.length; i++)
            for(int j = 0; j < matrice[0].length; j++)
                rezultat.matrice[i][j] = matrice[i][j].inmultire(matrice2.matrice[i][j]);
        return rezultat;
    }

    public MatriceComplex inmultScalar(int a){
        MatriceComplex rezultat = new MatriceComplex(matrice.length, matrice[0].length);
        for(int i = 0; i < matrice.length; i++)
            for(int j = 0; j < matrice[0].length; j++)
                rezultat.matrice[i][j] = matrice[i][j].inmultireScalar(a);
        return rezultat;
    }
}
