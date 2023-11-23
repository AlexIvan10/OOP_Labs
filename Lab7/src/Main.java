import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Masina volvo = new Masina("Volvo", "Negru");
//        Student s1 = new Student("Andrei", 1, volvo);
//        Student s2 = s1.clone();
//        s2.id = 2;
//        s2.masina.revopseste("Rosu");
//        System.out.println(s1);
//        System.out.println(s2);

        Masina m1 = new Masina(3, "Logan", "negru");
        Masina m2 = new Masina(2, "Volvo", "alb");
        Masina m3 = new Masina(1, "Ferrari", "rosu");
        Masina[] arr = new Masina[] {m1, m2, m3};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}