package Recursion;

public class PermuteStrings {
	
	private static boolean used[];
	private static StringBuilder out = new StringBuilder();
	private static String in;

	public static void main(String[] args) {
		in = "helho";
		used = new boolean[in.length()];
		permute();
	}
	
	private static void permute(){
		if(in.length()==out.length()){
			System.out.println(out.toString());
			return;
		}
		else{
			for(int i=0; i<in.length(); i++){
				if(used[i]){
					continue;
				}
				out.append(in.charAt(i));
				used[i]=true;
				permute();
				used[i]=false;
				out.setLength(out.length()-1);
			}
		}
	}

}
