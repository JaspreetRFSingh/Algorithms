package strings;
import java.util.Scanner;

public class Palindrome {

public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A=sc.next();

        int n = A.length();
        if(n==1) {
        	System.out.println("Yes");
        }
        else {
        	char[] data = A.toCharArray();
            boolean isPali = false;
            for(int i =0; i<n/2; i++){
                isPali = false;
                if(data[i]==data[n-1-i]){
                    isPali = true;
                }
            }
            if(isPali){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        sc.close();
    }
	 
}
