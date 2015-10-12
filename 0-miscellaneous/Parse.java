import java.util.ArrayList;

public class Parse {

	public static void main(String[] args) {
		String input = "(a,b,cy)n,m";
		parse(input,0,"");
	}


	private static String parse(String input, int i, String cur){
		String next = input.substring(i, i+1);
		if(next.equals("(")){
			if(i>=input.length()){
				return cur;
			}
			cur=input.substring(i+1, i+2);
			return parse(input,input.indexOf(")")+1,cur);
		}
		else if(next.equals(")")){
			if(i>=input.length()){
				return cur;
			}
		}
		else if(next.equals(",")){
			if(i>=input.length()){
				return cur;
			}
			int nextBrace = input.indexOf("(")+1;
			if(nextBrace<i){
				System.out.println(cur);
			}
			else{
				return parse(input,input.indexOf("(")+1,cur);
			}
		}
		else{
			if(i>=input.length()){
				return cur;
			}
			cur=cur+next;
			return parse(input,i+1,cur);
		}
		//
		//return parse(input,input.indexOf(")")+1,cur);
		return parse(input,i+1,cur);
	}



}
