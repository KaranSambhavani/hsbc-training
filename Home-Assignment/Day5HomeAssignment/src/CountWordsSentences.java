import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsSentences {

	public static void main(String[] args) {
		
		BufferedReader br=null;
		
		try {
			br=new BufferedReader(new FileReader("data.txt"));

			String line="";
			int lineCount=0;
			int wordCount=0;
			while((line=br.readLine())!=null)
			{
			  lineCount++;
			  String s[]=line.split(" ");
			  wordCount=wordCount+s.length;
			  
			}
			System.out.println("Total lines= "+lineCount);
			System.out.println("Total words= "+wordCount);
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		

	}

}
