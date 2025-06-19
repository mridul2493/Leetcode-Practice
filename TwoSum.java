import java.util.*;
public class TwoSum {
        public static int []twoSum(int nums[], int target){
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        return new int[]{i,j};
                    }
                    else{
                        continue;
                    }
                }
            }
            return new int[]{};
        }
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length of array = ");
            int n = sc.nextInt();
            int nums[] = new int[n];
            for(int k=0;k<n;k++){
                nums[k]=sc.nextInt();
            }
            System.out.println("Enter target = ");
            int target = sc.nextInt();
            System.out.println(twoSum(nums,target));
        }
}