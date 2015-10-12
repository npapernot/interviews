package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class SplitWordRecursive {

	private static Map<String, String> memoized = new HashMap<String, String>();


	public static void main(String[] args) {
		String input = "ilikeice";
		//separate(input);;
		System.out.println(splitWords(input));
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
		for(int i=0; i<input.length(); i++){
			if(dictionaryContains(input.substring(0,i)) && separate(input.substring(i,input.length()))){
				System.out.print(input.substring(0,i) + " " + input.substring(i,input.length()));
				return true;
			}
		}
		return false;
	}

	private static String splitWords(String input){
		if(dictionaryContains(input)){
			return input;
		}
		for(int i=1; i<input.length(); i++){
			String sub = input.substring(0,i);
			if(dictionaryContains(sub)){
				String next = splitWords(input.substring(i,input.length()));
				return sub + " " + next;
			}
		}
		return "";
	}



	private static String SegmentString(String input) {
		if (dictionaryContains(input)) return input;
		if (memoized.containsKey(input)) {
			return memoized.get(input);
		}
		int len = input.length();
		for (int i = 1; i < len; i++) {
			String prefix = input.substring(0, i);
			if (dictionaryContains(prefix)) {
				String suffix = input.substring(i, len);
				String segSuffix = SegmentString(suffix);
				if (segSuffix != null) {
					memoized.put(input, prefix + " " + segSuffix);
					return prefix + " " + segSuffix;
				}
			}
			memoized.put(input, null);
			return null;
		}
		return null;
	}
}