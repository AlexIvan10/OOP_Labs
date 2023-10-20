public class Main {
    public static void main(String[] args) {
        int varsta = 18, sex = 1, inaltime = 175;
        short wrap;
        wrap = (short)varsta;
        wrap = (short)((wrap<<1) | (short)sex);
        wrap = (short)((wrap<<8) | (short)inaltime);
        System.out.println(wrap);
        System.out.println(wrap & 0xff);
        System.out.println(wrap>>8 & 1);
        System.out.println(wrap>>9 & 0x7f);
    }
}