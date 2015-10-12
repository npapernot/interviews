
public class CumulativeSumArray {

	public static void main(String[] args) {
		int[] nums = new int[]{1,3,6,3,5,9,0,4,2,5,4,1};
		int target = 9;

		for(int i=0; i<nums.length; i++){
			int tempSum=0;
			for(int j=i; j<nums.length; j++){
				tempSum=tempSum+nums[j];
				if(tempSum>target){
					break;
				}
				if(tempSum==target){
					System.out.println("Target found starting at " + i + " to " + j + " with " + tempSum);
					break;
				}

			}
		}

	}

}
