import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;

public class ManageFiles {

	public static void main(String[] args) {
		int slot=-1;
		try{
			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

			String input;
			System.out.println("Please enter the slot of the sequence number, e.g.: 1");	

			while((input=br.readLine())!=null){
				try{
					slot = Integer.valueOf(input);
					slot--;
					break;
				}
				catch(Exception e){
					System.out.println("Please enter a number for the slot, e.g.: 1");
				}
			}
			System.out.println("Are these files from Sharooz? (y/n)");
			input=br.readLine();
			
			if(input.equals("y")){
				slot++;
			}

			File folder = new File(".");
			System.out.println("Your are in folder: " + folder.getCanonicalPath());
			File[] listOfFiles = folder.listFiles();

			System.out.println("Found " + listOfFiles.length + " files.");
			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isFile()) {
					String fileName = listOfFiles[i].getName();
					String fileNameTemp=fileName.replaceAll("-", "_");

					//check if folder for file(s) exist
					String[] seqNum = fileNameTemp.split("_");
					String folderName;
					if(slot>=seqNum.length){
						folderName = "NoSeqNum";
					}
					else{
						folderName = seqNum[slot];
					}
					//folderName="test1";
					File newFolder = new File(folder.getCanonicalPath() + "/" + folderName);
					if (!newFolder.exists()){
						boolean res = newFolder.mkdir();
						System.out.println("Created folder /" + folderName);
					}

					//String pathName = listOfFiles[i].getCanonicalPath();
					String src = listOfFiles[i].getCanonicalPath();
					String dst = folder.getCanonicalPath() + "/" + folderName + "/" + fileName;
					System.out.println("Moving file " + fileName + " to folder /" + folderName);
					//move file into folder
					try{
						Files.move(Paths.get(src), Paths.get(dst), REPLACE_EXISTING);
					}
					catch(Exception e){
						System.out.println("Could not copy file " + fileName);
						//e.printStackTrace();
					}

				} 

			}
			System.out.println("Everything done!");
			br.readLine();
		}
		catch(Exception io){
			io.printStackTrace();
		}	


	}

}
