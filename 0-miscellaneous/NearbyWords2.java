package Recursion;

import java.util.HashSet;
import java.util.Set;

public class NearbyWords2 {

	public static void main(String[] args) {
		nearby_words("hj");

	}

	private static Set<String> allWords = new HashSet<String>();

	private static StringBuilder newWord;
	private static boolean used[][];

	public static Set<String> nearby_words(String word){
		newWord = new StringBuilder();
		used = new boolean[word.length()][5];
		permute("hj",0);
		return allWords;
	}

	private static void permute(String word, int start){
		if(newWord.length()==word.length()){
			System.out.println(newWord.toString());
		}
		
		for(int i=start; i<word.length(); i++){
			newWord.append(get_nearby_chars(word.substring(i,i+1)));
			permute(word,i+1);
			newWord.setLength(newWord.length()-1);
		}
	}

	private static Set<String> get_nearby_chars(String character){
		Set<String> set = new HashSet<String>();
		if(character.equals("h")){
			set.add("g");
			set.add("j");
			set.add("y");
			set.add("b");
			set.add("h");
		}
		if(character.equals("j")){
			set.add("o");
			set.add("k");
			set.add("u");
			set.add("j");
			set.add("i");
		}
		return set;
	}

	private static boolean is_word(String word){
		if(word.equals("hi")){
			return true;
		}
		else if(word.equals("ho")){
			return true;
		}
		else{
			return false;
		}
	}



}
