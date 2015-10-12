package Recursion;

public class PermuteStringsTest {

	private static StringBuilder builder = new StringBuilder();

	public static void main(String[] args) {
		permute("abcdefghijklmnopqrstuvwxyz");
	}

	private static void permute(String input){

		if(builder.length()==8){
			System.out.println(builder.toString());
		}
		else{
			for(int i=0; i<input.length(); i++){
				builder.append(input.charAt(i));
				permute(input);
				builder.setLength(builder.length()-1);
			}
		}

	}



}
