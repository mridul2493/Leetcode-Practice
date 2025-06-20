import java.util.*;
public class Palindrome {
        public static boolean isPalindrome(int x) {
            int lastdigit;
            int revnum=0;
            int trap = x;
            while(x>0){
                lastdigit=x%10;
                x=x/10;
                revnum=(revnum*10)+lastdigit;
            }
            if(revnum==trap){
                return true;
            }
            else{
                return false;
            }
        }
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println(isPalindrome(x));
        }
}