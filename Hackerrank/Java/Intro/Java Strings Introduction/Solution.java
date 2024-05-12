import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length() + B.length());
        int result = A.compareTo(B);
        if(result>0)
        {
            System.out.println("Yes");
            
        }
        else{
            System.out.println("No");
        }
        String firstWord = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        String secondWord = Character.toUpperCase(B.charAt(0)) + B.substring(1);
        System.out.println(firstWord + " " + secondWord); 
        sc.close();
    }
}
