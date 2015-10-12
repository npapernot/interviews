
public class CountingSegments {

	public static void main(String[] args) {
		int[] numbers = new int[]{1,2,3,5,6,7,8,10,11,12,14,15,16,17};
		consecutiveSegments(numbers);
	}

	private static void consecutiveSegments(int[] nums){
		int min=nums[0];
		int max=nums[0];
		for(int i=0; i<nums.length-1; i++){
			if(nums[i+1]==nums[i]+1){
				max=nums[i+1];
				if(i+1==nums.length-1){
					System.out.println(min + "-" + max);
				}
			}
			else{
				System.out.println(min + "-" + max);
				min=nums[i+1];
				max=nums[i+1];
			}
		}
	}
	
}
