# sum-of-all-subset-XOR-totals
The XOR total of any array and it all possible subset





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
	
	
