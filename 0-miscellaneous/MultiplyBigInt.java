
public class MultiplyBigInt {

	public static void main(String[] args) {
		int[] num1 = new int[]{2,3,4};
		int[] num2 = new int[]{5,6,7,8,9};
		
		int[] res = multiplyBig(num1,num2);
		
		for(int r : res){
			System.out.print(r);
		}
	}
	
	private static int[] multiplyBig(int[] num1, int[] num2){

		int carry=0;
		int subproduct=0;
		int subfactor=1;
		int[] product = new int[num1.length*num2.length];
		int pos=num1.length*num2.length-1;
		int factor=1;
		
		for(int i=0; i<num1.length-1; i++){
			factor=factor*10;
		}

		for(int i=0; i<num1.length; i++){
			subproduct=0;
			subfactor=1;
			carry=0;
			for(int j=num2.length-1; j>=0; j--){
				int temp=num1[i]*num2[j];
				
				subproduct=subproduct+((temp%10)+carry)*subfactor;

				subfactor*=10;
				carry=temp/10;
			}
			subproduct+=carry*subfactor;
			product[pos] = subproduct*factor;
			System.out.println(subproduct*factor);
			pos--;
			factor/=10;
		}
		return product;
		}

}
