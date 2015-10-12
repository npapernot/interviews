package Recursion;

public class CombinateStrings {
	
	private static boolean used[];
	private static String string;
	private static StringBuilder builder;
	private static int size;
	private static int count=1;

	public static void main(String[] args) {
		size=4;
		used = new boolean[size];
		string = "wxyz";
		builder = new StringBuilder();
		combineString1(0);
		System.out.println("Combinations " + count);
	}

	private static void combineString(int s){
		if(builder.length()!=0){
			System.out.println(builder.toString());
			count++;
		}
		
		for(int i=s; i<size; i++){
			if(used[i]){
				continue;
			}
			builder.append(string.charAt(i));
			used[i]=true;
			combineString(i);
			used[i]=false;
			builder.setLength(builder.length()-1);
		}
		
	}
	
	private static void combineString1(int s){

		for(int i=s; i<size; i++){
			builder.append(string.charAt(i));
			System.out.println(builder.toString());
			count++;
			if(i < size){
				combineString1(i+1);
			}
			builder.setLength(builder.length()-1);
		}
		
	}
	
}
