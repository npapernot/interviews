public class consSequenceTargetSum{ 
	public static void main(String []args) { 
		int [] a=new int []{1,7,3,5,8,9}; 
		int targetSum=8; 
		int x=targetSum; 
		int count=0; 
		for(int i=0;i< a.length;i++){ 
			if((a[i] > targetSum) || (a[i]==targetSum)){ 
				x=targetSum; continue; 
			} 
			else 
			{ 
				x=x-a[i]; count++; 
				if((x==0) && count > 0){ 
					for(int k=count;k==0;k--){ 
						System.out.print(""+a[i-k]); 
					} 
					System.out.println(); x=targetSum; count=0; } 
				else if(x<0) { x=targetSum; count=0; 
				} continue; 
			} 
		} 
	}
}