// Core5: Class, Objects

// Way: 1
class Calculator {

    int a;
    int b = 1;

    public int add() {
        System.out.println("Add Operation");
        return 0;
    }

    public int addWithData(int a, int b) {
        int result = a + b;
        return result;
    }

    public void returnEmpty() {
        System.out.println("No Data");
    }

    public String compareMe (int num) {
        if (num == 10) {
            return "I am 10";
        } else {
            return "I am 0";
        }
    }

    // Method Overloading
    public int data(int num1, int num2) {
        return num1 + num2;
    }

    public int data(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double data(double num1, int num2) {
        return num1 + num2;
    }
}

public class Core5 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;

        int normalResult = num1 + num2;
        System.out.println("Normal addition reult : " + normalResult);

        // Calculator calc; here calc as Reference Variable & type as Calculator

        Calculator calc = new Calculator(); // new Calculator() => Object creation

        System.out.print(calc);

        int classResult = calc.add(); // calling method with object
        System.out.println("Calculator Return value : " + classResult);
        System.out.println("Calculator variable : " + calc.a);
        System.out.println("Calculator variable with value : " + calc.b);

        int addClassResult = calc.addWithData(10, 15);
        System.out.println("addClassResult : " + addClassResult);

        calc.returnEmpty();
        String printStr = calc.compareMe(num1);
        System.out.print(printStr);

        // Method Overlaoding
        System.out.println("Method Overloading Exg (Double) : " + calc.data(5034.3452, 10));
        System.out.println("Method Overloading Exg (Add) : " + calc.data(5, 10));
        System.out.println("Method Overloading Exg (Add) : " + calc.data(5, 10, 5));


    }
}
