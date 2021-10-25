package it.campe;

public class Main {

    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int z = 0;
        String digits = String.valueOf(x+y) + String.valueOf(z);

        //String digits = "" + (x+y) + z; //напишите тут ваш код

        System.out.println(digits);
    }
}
