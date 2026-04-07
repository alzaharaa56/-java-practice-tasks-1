//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main(String[] args) {
Main program = new Main();
String[] testCases = {"fig", "dib", "fib", "abc"};

for (String test : testCases) {
String result = program.fizzString(test);
System.out.println(test + " -> " + result);
}
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