package Sorting;

import java.util.Arrays;

public class SortEmployees {

	public static void main(String[] args) {
		Employee e1 = new Employee("Mr.","stefan","achleitner");
		Employee e2 = new Employee("Ms.","tricia","goulding");
		Employee e3 = new Employee("Mr.","martin","achleitner");
		
		Employee[] emplList = new Employee[]{e3,e2,e1};
		
		Arrays.sort(emplList, new EmployeeComparator());
		
		for(Employee e : emplList){
			System.out.println(e.givenname + " " + e.surname);
		}

	}

	
	
	private int getLetterPos(String letter){
		if(letter.equals("a")){
			return 1;
		}
		else if(letter.equals("b")){
			return 2;
		}
		else if(letter.equals("c")){
			return 3;
		}
		else if(letter.equals("d")){
			return 4;
		}
		else if(letter.equals("e")){
			return 5;
		}
		else if(letter.equals("f")){
			return 6;
		}
		else if(letter.equals("g")){
			return 7;
		}
		else if(letter.equals("h")){
			return 8;
		}
		else if(letter.equals("i")){
			return 9;
		}
		else if(letter.equals("j")){
			return 10;
		}
		else if(letter.equals("k")){
			return 11;
		}
		else if(letter.equals("l")){
			return 12;
		}
		else if(letter.equals("m")){
			return 13;
		}
		else if(letter.equals("n")){
			return 14;
		}
		else if(letter.equals("o")){
			return 15;
		}
		else if(letter.equals("p")){
			return 16;
		}
		else if(letter.equals("q")){
			return 17;
		}
		else if(letter.equals("r")){
			return 18;
		}
		else if(letter.equals("s")){
			return 19;
		}
		else if(letter.equals("t")){
			return 20;
		}
		else if(letter.equals("u")){
			return 21;
		}
		else if(letter.equals("v")){
			return 22;
		}
		else if(letter.equals("w")){
			return 23;
		}
		else if(letter.equals("x")){
			return 24;
		}
		else if(letter.equals("y")){
			return 25;
		}
		else if(letter.equals("z")){
			return 26;
		}
		else{
			return -1;
		}
		
	}
}
