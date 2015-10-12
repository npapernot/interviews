
public class IntStringConversion {
	public static void main(String []args) { 
		int n = StringToInt("1234");
		System.out.println(n);
		String num = IntToString(n);
		System.out.println(num);
	}

	private static int StringToInt(String number){
		char[] digits = number.toCharArray();
		int isNegative=0;
		if(digits[0]=='-'){
			isNegative=1;
		}	
		int num=0;
		int factor=1;
		for(int i=digits.length-1; i>= isNegative; i--){
			int temp = Character.getNumericValue(digits[i]);
			num=num + factor*temp;
			factor = factor*10;
		}
		if(isNegative==1){
			num=num*-1;
		}
		return num;
	}

	private static String IntToString(int num){
		int isNegative=1;
		if(num<0){
			num=num*-1;
			isNegative=-1;
		}
		
		int temp=num;
		int factor=1;
		int res=num;
		StringBuilder n= new StringBuilder();

		do{
			res=res/factor;
			factor*=10;
		}while(res!=0);
		factor/=10;
		res=num;
		
		if(isNegative==-1){
			n.append("-");
		}
		
		
		for(int f=factor; f>0; f=f/10){
			temp=temp/f;
			n.append((char)(temp + '0'));
			temp=res-temp*f;
			res=temp;
		}
		

		return n.toString();
	}


}
