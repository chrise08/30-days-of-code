import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BinaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int consecutiveOnes = 0;
        String binaryString = Integer.toBinaryString(n);
        // get all strings of ones
        String[] strparts = binaryString.split("0");
        // find max string of ones
        for(int i = 0; i < strparts.length; i++){
            if (consecutiveOnes < strparts[i].length()) {
                consecutiveOnes = strparts[i].length();
            }
        }
        System.out.println(consecutiveOnes);

        scanner.close();
    }
}