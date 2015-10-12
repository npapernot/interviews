import java.util.HashMap;

public class NonRepetitiveChar {

	public static void main(String args[]){
		String input="total";
		
		HashMap<String,Integer> count = new HashMap<String,Integer>();
		
		for(int i=0; i<input.length(); i++){
			if(!count.containsKey(input.substring(i, i+1))){
				count.put(input.substring(i, i+1), 1);
			}
			else{
				int j = count.get(input.substring(i, i+1));
				count.put(input.substring(i, i+1), ++j);
			}
		}
		
		for(int i=0; i<input.length(); i++){
			if(count.get(input.substring(i, i+1))==1){
				System.out.println("First non repetititve char: " + input.substring(i, i+1));
				break;
			}
		}
		
	}
}
