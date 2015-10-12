package Recursion;

public class PhoneNumbers {

	private static boolean[][] used; 
	private static String number;
	private static StringBuilder text;
	private static int count;

	public static void main(String[] args) {
		used = new boolean[7][3];
		number = "4971927";
		text = new StringBuilder();
		count=0;
		permutePhone2();
		System.out.println("Combinations: " + count);
	}

	private static void permutePhone(int start){
		if(text.length() == number.length()){
			System.out.println(text.toString());
			count++;
			return;
		}

		for(int i=start; i<7; i++){
			int iter=3;
			if(number.charAt(i)=='1'){
				iter = 1;
			}
			for(int j=0; j<iter; j++){
				if(used[i][j]){
					continue;
				}
				text.append(getCharKey(Character.getNumericValue(number.charAt(i)),j));
				used[i][j]=true;
				permutePhone(i+1);
				used[i][j]=false;
				text.setLength(text.length()-1);
			}
		}
	}
	
	private static void permutePhone1(int start){
		if(text.length() == number.length()){
			System.out.println(text.toString());
			count++;
			return;
		}
		else{
			int iter=3;
			if(number.charAt(start)=='1'){
				iter = 1;
			}
			for(int j=0; j<iter; j++){
				text.append(getCharKey(Character.getNumericValue(number.charAt(start)),j));
				permutePhone(start+1);
				text.setLength(text.length()-1);
			}
		}
	}
	
	private static void permutePhone2(){
		for(int i=0; i<number.length(); i++){
			text.append(getCharKey(Character.getNumericValue(number.charAt(i)), 0));
		}

		for( ; ; ){
			System.out.println(text.toString());
			for(int j=number.length()-1; j>=-1; j--){
				if(j==-1){
					return;
				}
				
				if(text.charAt(j) == getCharKey(Character.getNumericValue(number.charAt(j)), 2) || number.charAt(j)=='1'){
					text.setCharAt(j,getCharKey(Character.getNumericValue(number.charAt(j)), 0));
				}
				else if(text.charAt(j) == getCharKey(Character.getNumericValue(number.charAt(j)), 0)){
					text.setCharAt(j,getCharKey(Character.getNumericValue(number.charAt(j)), 1));
					break;
				}
				else if(text.charAt(j) == getCharKey(Character.getNumericValue(number.charAt(j)), 1)){
					text.setCharAt(j,getCharKey(Character.getNumericValue(number.charAt(j)), 2));
					break;
				}
			}
		}
	}

	private static char getCharKey(int telKey, int place){
		switch (telKey){
		case 1:
			switch (place){
			default: return '1';
			}
		case 2:
			switch (place){
			case 0: return 'a';
			case 1: return 'b';
			case 2: return 'c';
			}
		case 3:
			switch (place){
			case 0: return 'd';
			case 1: return 'e';
			case 2: return 'f';
			}
		case 4:
			switch (place){
			case 0: return 'g';
			case 1: return 'h';
			case 2: return 'i';
			}
		case 5:
			switch (place){
			case 0: return 'j';
			case 1: return 'k';
			case 2: return 'l';
			}
		case 6:
			switch (place){
			case 0: return 'm';
			case 1: return 'n';
			case 2: return 'o';
			}
		case 7:
			switch (place){
			case 0: return 'p';
			case 1: return 'r';
			case 2: return 's';
			}
		case 8:
			switch (place){
			case 0: return 't';
			case 1: return 'u';
			case 2: return 'v';
			}
		case 9:
			switch (place){
			case 0: return 'w';
			case 1: return 'x';
			case 2: return 'y';
			}
		default: return ' ';
		}
	}

}
