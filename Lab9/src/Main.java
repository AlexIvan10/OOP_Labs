import com.sun.source.tree.Tree;

import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.io.*;

public class Main {
    public static void main(String[] args) {
//        List<String> cars = new ArrayList<>();
//        Map<String, String> carteTelefonica = new HashMap<>();
//        Map<String, Integer> numarAparitiiCuv = new TreeMap<>();
//        String[] chat = {"Buna", "Buna", "ce", "mai", "zici", "ce", "Buna"};
//        cars.add("Dacia");
//        cars.add("Renault");
//        cars.add("Tesla");
//        carteTelefonica.put("Maria", "123");
//        ListIterator<String> carIt = cars.listIterator();
//
//        while(carIt.hasNext()){
//            String car = carIt.next();
//            if(car.equals("Dacia"))
//                carIt.set("Logan");
//        }
//        for (int i = 0; i < cars.size(); i++) {
//            if(cars.get(i).equals("Dacia"))
//                cars.set(i, "Logan");
//        }
//        for(String car: cars){
//            if(car.equals("Dacia"))
//                car = "Logan";
//        }
//        System.out.println(cars);
//        for (int i = 0; i < chat.length; i++) {
//            if (!numarAparitiiCuv.containsKey(chat[i]))
//                numarAparitiiCuv.put(chat[i], 1);
//            else{
//                int n = numarAparitiiCuv.get(chat[i]);
//                numarAparitiiCuv.put(chat[i], n + 1);
//            }
//        }
//        for (Map.Entry<String, Integer> entry: numarAparitiiCuv.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        Comparator<File> byDirThenAlpha = new DirAlphaComparator();
        Comparator<File> byNameLength = new NameLengthComparator();

        File dir = new File(System.getProperty("user.home"));
        File[] children = dir.listFiles();

        System.out.println("Fisierele dupa director, apoi alfabetic ");
        Arrays.sort(children, byDirThenAlpha);
        printFileNames(children);
    }
    private static void printFileNames(File[] f){
        for (File entry : f){
            System.out.println("   " + entry.getName());
        }
    }
}