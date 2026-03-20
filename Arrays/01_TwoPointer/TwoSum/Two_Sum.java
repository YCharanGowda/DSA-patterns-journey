import java.util.Arrays;

class Solution{
	public static int[] twoSum(int nums[],int target){
		int n = nums.length;
		int left = 0;
		int right = n-1;
	
		while(left<right){
			int sum = nums[left]+nums[right];
			if(sum == target){
				return new int[] {left++,right++};
			}
			else if(sum<target){
				left++;
			}
			else{
				right--;
			}
		}	
		return new int[] {};

	}	
}
public class Two_Sum{
	public static void main(String[] args){
	int[] arr={1,2,3,4,5,6};// array must be given pre-sorted
	int target = 4;
	
	int[] result = Solution.twoSum(arr,target);
	System.out.println("Result :"+Arrays.toString(result));
}
}
