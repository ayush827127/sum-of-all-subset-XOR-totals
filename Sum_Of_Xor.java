 public class Sum_Of_Xor {

	public static void main(String[] args) {

		int arr[] = {5,1,6};
		
		System.out.println("The Xor of 5 and  6 is "+(5^6));
		
		sum s = new sum();
		System.out.println("The Answer is "+ s.subset(arr));
	}

}

class sum{

private int res;
	
	public  int subset(int[] nums){
		dfs(nums,0,0);
		return res;
	}
	
	private void dfs(int[] nums, int depth, int prev){
		res += prev;
		for(int i = depth; i < nums.length; i++){
			prev^= nums[i];
			dfs(nums,++depth,prev);
			prev ^= nums[i];
		}
	}
	
	
}
	