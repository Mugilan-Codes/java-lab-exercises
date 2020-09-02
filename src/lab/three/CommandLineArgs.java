package lab.three;

import java.util.Arrays;

public class CommandLineArgs {

    public static void main(String[] args) {

        double answer = 0.0;
        for(String str: args) {
            answer += Double.parseDouble(str);
        }
        System.out.println("The Arguments are "+ Arrays.toString(args));
        System.out.println("Their Sum is " + answer);

    }

}

// Output:

// ❯ javac CommandLineArgs.java
// ❯ java CommandLineArgs 1 2 3 4 5 6 7
// The Arguments are [1, 2, 3, 4, 5, 6, 7]
// Their Sum is 28.0