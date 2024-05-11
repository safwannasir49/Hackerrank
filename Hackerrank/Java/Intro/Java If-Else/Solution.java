import java.io.*;
import java.math.*;
import java.security.*;
import java.util.*;
import java.util.Scanner;
class Solution{

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();

        if(n%2==0)
        {
            if(n<=5)
            System.out.println("Not Weird");
            else if(n<=20)
            System.out.println("Weird");
            else
            System.out.println("Not Weird");
        }
        else{
        System.out.println("Weird");
        }

        scanner.close();
    }
}
