import java.util.HashMap;

public class RemoveChars {

	public static void main(String[] args) {
		
		String result = removeChars("Battle of the Vowels: Hawaii vs. Grozny", "aeiou");
		System.out.println(result);
		result = perfRemoveChars("Battle of the Vowels: Hawaii vs. Grozny", "aeiou");
		System.out.println(result);
	}
	
	private static String removeChars(String str, String remove){
		char[] strArr = str.toCharArray();
		char[] rmvArr = remove.toCharArray();
		
		String res="";
		for(int i=0; i<strArr.length; i++){
			boolean notIn=true;
			for(int j=0; j<rmvArr.length; j++){
				if(strArr[i]==rmvArr[j]){
					notIn = false;
				}
			}
			if(notIn){
				res=res+strArr[i];	
			}
		}
		return res;
	}
	
	private static String perfRemoveChars(String str, String remove){
		char[] strArr = str.toCharArray();
		char[] rmvArr = remove.toCharArray();
		HashMap<Character,Boolean> rmvMap = new HashMap<Character,Boolean>();
		
		for(Character c : rmvArr){
			rmvMap.put(c, true);
		}
		
		int write=0;
		for(int i=0; i<strArr.length; i++){
			char c = strArr[i];
			boolean cont = rmvMap.containsKey(c);
			if(!cont){
				strArr[write]=strArr[i];
				write++;
			}
		}
		
		String res="";
		for(int i=0; i<write; i++){
			res=res+strArr[i];
		}
		
		return res;
	}
	
	
}
