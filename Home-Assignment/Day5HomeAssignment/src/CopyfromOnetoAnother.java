import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyfromOnetoAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String file1=sc.next();
		String file2=sc.next();
		
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		try
		{
		  br=new BufferedReader(new FileReader(file1));
		  bw=new BufferedWriter(new FileWriter(file2));	
		  
		  String line="";
		  while((line=br.readLine())!=null)
		  {
			  bw.write(line+"\n");
		  }
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				if(br!=null)
				{
					bw.close();
				}
				if(bw!=null)
				{
					br.close();
				}
			}
			catch(IOException io)
			{
				System.out.println(io);
			}
		}
		
	}

}
