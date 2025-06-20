import java.util.*;
public class reverseinteger {
        public static int reverse(int x) {
            int lastdigit;
            int revnum=0;
            while(x!=0){
                lastdigit=x%10;
                x=x/10;
                revnum=(revnum*10)+lastdigit;
            }
            if(revnum>Integer.MIN_VALUE && revnum<Integer.MAX_VALUE){
                return revnum;
            }
            else{
                return 0;
            }
        }
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println(reverse(x));
        }
}