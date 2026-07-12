// Conditional Statement, switch, for, while, do-while loop

public class Core4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;


        if(a > 12) {
            System.out.println("Greater");
        } else {
            System.out.println("Smaller");
        }

        if(a < 1) {
            System.out.println("1");
        } else if(b > 10) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }

        // switch
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wedsday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
                break;
        }

        // while
        int i = 1;
        while (i < 10) {
            i++;
            System.out.println("While looop");
        }

        // do-while
        int j = 1;
        do {
            System.out.println("Do While loop : " + j);
            j++;
        } while (j > 2);
    }
}
