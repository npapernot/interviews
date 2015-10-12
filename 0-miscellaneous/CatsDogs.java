import java.util.HashMap;

public class CatsDogs {

	public static void main(String[] args) {
		String input = "2" + ";" + 
		"1 1 2" + ";" +
		"C1 D1" + ";" + 
		"D1 C1" + ";" + 
		"1 2 4" + ";" + 
		"C1 D1" + ";" +
		"C1 D1" + ";" + 
		"C1 D2" + ";" + 
		"D2 C1"; 
		getViewers(input);
	}





	private static void getViewers(String input){
		String[] lines = input.split(";");
		int line=0;

		int numSamples = Integer.valueOf(lines[line]);
		line++;

		for(int sample=0; sample<numSamples; sample++){
			int cats = Integer.valueOf(lines[line].split(" ")[0]);
			int dogs = Integer.valueOf(lines[line].split(" ")[1]);
			int viewers = Integer.valueOf(lines[line].split(" ")[2]);
			line++;

			HashMap<String,Integer> positive = new HashMap<String,Integer>();
			HashMap<String,Integer> negative = new HashMap<String,Integer>();

			for(int viewer=0; viewer<viewers; viewer++){
				String pos = lines[line].split(" ")[0];
				String neg = lines[line].split(" ")[1];
				line++;
				
				if(positive.get(pos)==null){
					positive.put(pos, 1);
				}
				else{
					positive.put(pos, positive.get(pos)+1);
				}
				
				if(negative.get(neg)==null){
					negative.put(neg, 1);
				}
				else{
					negative.put(neg, negative.get(neg)+1);
				}
			}

			String maxPos="";
			int maxNum=0;
			for(String key : positive.keySet()){
				if(positive.get(key)>maxNum){
					maxNum= positive.get(key);
					maxPos=key;
				}	
			}
			System.out.println(maxPos + ":" + maxNum);
		}

	} 


}
