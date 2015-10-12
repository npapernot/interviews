
public class ConvertArray {

	public static void main(String args[]){
		int[] array = new int[]{3,4,5,2};
		increase(array);
	}
	
	private static int[] increase(int[] array){
		int factor=1;
		int num=0;
		for(int i=array.length-1; i>=0; i--){
			num=num+array[i]*factor;
			factor=factor*10;
		}
		
		num++;
		System.out.println("Num " + num);
		
		int digits=(int)Math.pow(10, array.length-1);
		int tempNum=num;
		int[] resArr = new int[array.length];
		int c=0;
		while(digits>0){
			int tNum=tempNum/digits;
			resArr[c]=tNum;
			c++;
			tempNum=tempNum-(tNum*digits);
			digits=digits/10;
		}
		
		System.out.print("[");
		for(int j=0; j<resArr.length; j++){
			System.out.print(resArr[j] + ",");
		}
		System.out.print("]");
		return resArr;
	}
	
	
}
