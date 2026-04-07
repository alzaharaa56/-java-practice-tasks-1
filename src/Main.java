

public class Main {
    private Task17 Task17;

    public static void main(String[] args) {
     //   Main program = new Main();
//String[] testCases = {"fig", "dib", "fib", "abc"};

//for (String test : testCases) {
//String result = program.fizzString(test);
//System.out.println(test + " -> " + result);}


        Task17 program = new Task17();
        System.out.println("output " + program.inOrder(1, 2, 4, false));
        System.out.println("output " + program.inOrder(1, 2, 1, false));
        System.out.println("output " + program.inOrder(1, 1, 2, true));
    }


    public String fizzString(String str) {
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

