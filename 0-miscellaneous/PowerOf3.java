
public class PowerOf3 {

	public static void main(String[] args) {
		System.out.println(powerOf3(42));

	}
	
	private static boolean powerOf3(int num){
		int r = num % 3;
		
		if(r==0){
			return true;
		}
		else{
			return false;
		}
	}

}
