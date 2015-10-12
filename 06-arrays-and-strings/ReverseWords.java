
public class ReverseWords {

	public static void main(String[] args) {
		String words = "Do or do not, there is no try.";
		//words="quantum piglet";
		System.out.println(reverseWords(words));
	}
	
	private static String reverseWords(String words){
		StringBuilder reverse = new StringBuilder();
		StringBuilder temp = new StringBuilder();
		for(char c : words.toCharArray()){
			if(c == ' '){
				temp.insert(0,c);
				reverse.insert(0, temp.toString());
				temp.delete(0, temp.length());
				//temp = new StringBuilder();
			}
			else{
				temp.append(c);
			}
		}
		reverse.insert(0, temp.toString());
		return reverse.toString();
	}

}
