// Lecture - 2 : Type Conversion & Type Casting, Type Promotion

public class Core2 {
    public static void main(String args[]) {
        byte b = 127;
        int a = 12;

        a = b; // Conversion [Implict]
        System.out.println("a : " + a);

        b = (byte) a; // Type Casting [Explict]
        System.out.println("b :  " + b);

        int aa = 258;
        byte bb = (byte) aa;
        System.out.println("bb : " + bb); // Internally it do modulo with max limt of data type [256]

        byte n = 50;
        byte m = 20;

        int result = n * m;
        System.out.println("result : " + result); // Type Promotion
    }
}