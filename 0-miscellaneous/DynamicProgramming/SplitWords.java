package DynamicProgramming;

public class SplitWords {

	public static void main(String args[]){
		String input = "ilikeice";
		separate(input);

	}

	private static boolean dictionaryContains(String word){
		String dictionary[] = {"mobile","samsung","sam","sung","man","mango",
				"icecream","and","go","i","like","ice","cream"};
		int size = dictionary.length;
		for (int i = 0; i < size; i++){
			if (dictionary[i].equals(word)){
				return true;
			}
		}
		return false;
	}
	
	private static boolean separate(String input){
		boolean wb[] = new boolean[input.length()+1];
		
		for(int i=0; i<input.length(); i++){
			wb[i]=false;
		}
		
		for(int i=1; i<=input.length(); i++){
			String sub = input.substring(0, i);
			if(wb[i]==false && dictionaryContains(sub)){
				wb[i]=true;
			}
			
			if(wb[i]==true){
				if(i==input.length()){
					//return true;
				}
				
				for(int j=i+1; j<=input.length(); j++){
					sub = input.substring(i, i+(j-i));
					if(wb[j]==false && dictionaryContains(sub)){
						wb[j]=true;
					}
					
					if(j==input.length() && wb[j]==true){
						//return true;
					}
				}
				
			}
		}
		
		int c=0;
		for(int i=0; i<input.length(); i++){
			if(wb[i]){
				System.out.print(" ");
			}
			else{
				System.out.print(input.charAt(c));
				c++;
			}
		}
		return false;
		//Here: http://www.geeksforgeeks.org/dynamic-programming-set-32-word-break-problem/
	}
}
