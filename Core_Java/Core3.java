// Lecture - 3 : Operators : Arithmetic, Relational, Logical

public class Core3 {
    public static void main(String[] args) {
        // Arithematic
        int num1 = 20;
        int num2 = 23;

        int add = num1 + num2;
        System.out.println("add : " + add);

        int sub = num1 - num2;
        System.out.println("sub : " + sub);

        int mul = num1 * num2;
        System.out.println("mul : " + mul);

        int div = num1 / num2;
        System.out.println("div : " + div);

        int rem = num1 % num2;
        System.out.println("rem : " + rem);

        num1 += 10;
        System.out.println("short cut : " + num1);

        num1++; // post - increment
        System.out.println("increment : " + num1);

        num1--; // post - decrement
        System.out.println("decrement: " + num1);

        ++num1; // pre - increment
        System.out.println("increment : " + num1);

        --num1; // pre - decrement
        System.out.println("decrement: " + num1);

        // Relational -> >, <, ==, !=
        int com1 = 10;
        int com2 = 20;

        if(com1 > com2) {
            System.out.println(" > Yes");
        } else {
            System.out.println(" > No");
        }

        if(com1 < com2) {
            System.out.println(" < Yes");
        } else {
            System.out.println(" < No");
        }

        if(com1 == com2) {
            System.out.println(" == Yes");
        } else {
            System.out.println(" == No");
        }

        if(com1 != com2) {
            System.out.println(" != Yes");
        } else {
            System.out.println(" != No");
        }

        if(com1 >= com2) {
            System.out.println(" >= Yes");
        } else {
            System.out.println(" >= No");
        }

        if(com1 <= com2) {
            System.out.println(" <= Yes");
        } else {
            System.out.println(" <= No");
        }

        // Logical
        int x = 10;
        int y = 15;
        int a = 14;
        int b = 23;

        boolean result = x > y && a < b;
        System.out.println("result [AND] : " + result);

        boolean result1 = x > y || a < b;
        System.out.println("result1 [OR] : " + result1);

        boolean result2 = !result1;
        System.out.println("result2 [NOT] : " + result2);

    }
}
