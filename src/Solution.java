/**
 *
 * @author Fenias
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
    
public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if(N%2==1){
            //impar
        }
        if(N%2==0) {
            //par
        }
        for(int i = 2; i <= 100; i++){
            if(1<=N && N<=100 && N>2 && N<5){
                System.out.println("Not Weird");
            }else{System.out.println("weird");}
            
            if(1<=N && N<=100 && N>6 && N<20){
                System.out.println("Weird");
            }
            if(1<=N && N<=100 && 20>N){
                System.out.println("Not Weird");
            }
        }
        scanner.close();
    }
}

