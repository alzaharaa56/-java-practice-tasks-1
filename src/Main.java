import java.util.Scanner;

public class Main {
    private Task17 Task17;

    public static void main(String[] args) {
        //   Main program = new Main();
//String[] testCases = {"fig", "dib", "fib", "abc"};

//for (String test : testCases) {
//String result = program.fizzString(test);
//System.out.println(test + " -> " + result);}


        //Task17 program = new Task17();
        //  System.out.println("output " + program.inOrder(1, 2, 4, false));
        // System.out.println("output " + program.inOrder(1, 2, 1, false));
        //System.out.println("output " + program.inOrder(1, 1, 2, true));

       // Task18 task18 = new Task18();


       // System.out.println("Result 1: " + task18.lessBy10(1, 7, 11));
       // System.out.println("Result 2: " + task18.lessBy10(1, 7, 10));
       // System.out.println("Result 3: " + task18.lessBy10(11, 1, 7));



       Scanner scanner=new Scanner(System.in);
       // System.out.print("enter a  ");
       // int a = scanner.nextInt();
       // System.out.print("enter b  ");
      //  int b = scanner.nextInt();
      //  System.out.print("enter c  ");
      //  int c = scanner.nextInt();

       // System.out.println("output" + Task19.redTicket(a, b, c));

       // System.out.print("enter num1 (10-99 )");
       // int num1 = scanner.nextInt();
       // System.out.print("enter num2 (99 -10)");
        //int num2 = scanner.nextInt();

        //System.out.println("output " + Task20.shareDigit(num1, num2));

       // System.out.print("TEMPERATURE ");
       // int temp = scanner.nextInt();
       // System.out.print("CHOOSE (true/false): ");
       // boolean isSummer = scanner.nextBoolean();

        //System.out.println("output" + "  "+ Task21.squirrelPlay(temp, isSummer));

       // System.out.print("day (0-6)");
       // int day = scanner.nextInt();
        //System.out.print("ARE YOU ON VACATION (true/false): ");
        //boolean isVacation = scanner.nextBoolean();

       // System.out.println("alarm clock " + Task22.alarmClock(day, isVacation));
        //System.out.print("enter num: ");
        //int n = scanner.nextInt();

        //System.out.println("private number" + Task23.specialEleven(n));

       // System.out.print("enter num: ");
        //int n24 = scanner.nextInt();

       // System.out.println("rea" + Task24.less20(n24));

        //System.out.print("morning now(true/false): ");
        //boolean morning = scanner.nextBoolean();
        //System.out.print("mather cal (true/false): ");
       // boolean mom = scanner.nextBoolean();
        //System.out.print("sleep (true/false): ");
       // boolean asleep = scanner.nextBoolean();

        //System.out.println("answer" + Task25.answerCell(morning, mom, asleep));

       // System.out.print("enter num: ");
        //int n26 = scanner.nextInt();

       // System.out.println("output " + Task26.fizzString2(n26));


       // System.out.print("enter a: ");
       // int a27 = scanner.nextInt();
       // System.out.print("enter b: ");
        //int b27 = scanner.nextInt();
       // System.out.print("enterc: ");
        //int c27 = scanner.nextInt();

       // System.out.println( Task27.twoAsOne(a27, b27, c27));

       System.out.print("value of the first die");
       int d1 = scanner.nextInt();
        System.out.print("value of the second die");
        int d2 = scanner.nextInt();
        System.out.print("repetition(true/false): ");
        boolean nd = scanner.nextBoolean();

        System.out.println("total " + Task28.withoutDoubles(d1, d2, nd));



    }


    public static String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else {
            return str;
        }
    }
}


