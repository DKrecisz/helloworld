/**
 * Created by Dam on 2018-11-16.
 */
//klasa Main
// english comments please motherfucker
public class Main {
    public static void main(String[] args) {
//        Main.helloworld();
//        Main.simpleAdding();
//        Main.letterIncrementing();
//        Main.doubleIncrementing();
        Main.circleArea();
        Main.arrays();

        System.out.println((float) 250/(float)500 );
    }

    public static void helloworld() {
        byte b = 127; //zmienna byte obejmuje wartosci od -128 do 127
        short s = 32767; // wartosci od -32768 do 32767
        int i = -2147483648; //do 2147483647
        long l = 35897345834759l; //
        float f = 3.44444f; // -3.4*10^38 do 3.4*10^38
        double d = 3.5463457834578; //-1.8*10^108 do 1.8*10^108
        char c = 'a'; // wiekszosc liter wystepujacych wspolczesnie lol
        String string = "to jest sparta";

        int wynik = 5;
        int i1 = 2;
        int i2 = 3;

        int wynik1 = i1 - i2;

        System.out.println("Wynik" + wynik1);
    }

    public static void simpleAdding() {
        int l1 = 5;
        int l2 = 15;

        int result = l1 + l2;
        System.out.println("result = " + result);
    }

    public static void letterIncrementing() {
        char letter = 'a';
        letter++;
        System.out.println("letterIncrementing " + letter++);
        System.out.println("letterIncrementing " + letter);
    }

    public static void doubleIncrementing() {
        double randomNumber = 10.123456789;
        randomNumber++;
        randomNumber++;
        randomNumber++;
        randomNumber++;
        randomNumber++;
        randomNumber++;
        randomNumber++;
        randomNumber++;
        randomNumber++;
        randomNumber++;
        System.out.println("doubleIncrementing " + randomNumber);
    }

    public static void circleArea() {
        double radius = 47;
        double result = Math.PI * radius * radius;
        System.out.println("circleArea " + result);
    }

    public static void arrays(){
        int[] tab = new int [5] ;
        tab[0] = 3;
        tab[1] = 1;
        tab[2] = 2;
        tab[3] = 8;
        tab[4] = 5;

        for(int i = 0; i<5; i++){
            System.out.println("restult skurwa = " + i );
        }

        int[] chuj = new int[10];
        for(int x = 0; x<10; x++){
            System.out.println("komorka sraka = " + x);
        }

        String[] cwel = new String[5];
        cwel[0] = "Radek";
        cwel[1] = "Mika";
        cwel[2] = "Lula";
        cwel[3] = "Phpowiec";
        cwel[4] = "Drugi phpowiec";

        for (int counter = 0; counter < cwel.length; counter++) {
            System.out.println("Chuj w dupe dla " + cwel[counter]);
        }
    }
}