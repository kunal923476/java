import java.io.FileWriter;
import java.io.IOException;
class createFile
{
	

public class Read_file {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		String str="File Handling in java using"+" Filewriter and FileReader";
		FileWriter fw=new FileWriter("output.txt");
		
        for(int i=0; i< str.length();i++)
        	fw.write(str.charAt(i));
        System.out.println("writing successful");
        fw.close();
        	
	}

}
}
