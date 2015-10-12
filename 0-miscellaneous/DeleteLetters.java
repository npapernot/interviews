import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class DeleteLetters {

	public static void main(String[] args) {
		String input = "cbacdcbc";
		deleteChars(input);

	}

	private static void deleteChars(String in){
		//HashMap<String,Integer> count = new HashMap<String,Integer>(); 
		ArrayList<Entry> entries = new ArrayList<Entry>();
		for(int i=0; i<in.length(); i++){
			entries.add(new Entry(in.substring(i, i+1),i,getCharIdx(in.substring(i, i+1))));
		}
		entries.sort(new EntryComparator());

		for(int i=0; i<entries.size()-1; i++){
			if(entries.get(i+1).letter.equals(entries.get(i).letter)){
				entries.remove(i);
			}
		}
		entries.sort(new EntryComparator2());
		
		for(int i=0; i<entries.size(); i++){
			System.out.print(entries.get(i).letter);
		}

	}

	private static int getCharIdx(String letter){
		if(letter.equals("a")){
			return 0;
		}
		else if(letter.equals("b")){
			return 1;
		}
		else if(letter.equals("c")){
			return 2;
		}
		else if(letter.equals("d")){
			return 3;
		}
		else{
			return -1;
		}
	}

	public static class Entry{
		public String letter;
		public int origPos;
		public int idx;

		public Entry(String l, int p, int i){
			this.letter=l;
			this.origPos=p;
			this.idx=i;
		}
	}

	public static class EntryComparator implements Comparator<Entry>{
		@Override
		public int compare(Entry o1, Entry o2) {

			if(o1.idx<o2.idx){
				return -1;
			}
			else if(o1.idx>o2.idx){
				return 1;
			}
			else{
				if(o1.origPos<o2.origPos){
					return -1;
				}
				else {
					return 1;
				}
			}
		}
	}

	public static class EntryComparator2 implements Comparator<Entry>{
		@Override
		public int compare(Entry o1, Entry o2) {

			if(o1.origPos<o2.origPos){
				return -1;
			}
			else {
				return 1;
			}
		}
	}

}
