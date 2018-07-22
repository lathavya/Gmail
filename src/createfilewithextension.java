import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class createfilewithextension {
public static void main(String[] args) {
	File f1=new File("D://filehandling.txt");
	try
	{
		f1.createNewFile();
		//
		
		FileWriter fw= new FileWriter(f1);
		BufferedWriter bw= new BufferedWriter(new FileWriter(f1));
		fw.write("this is very boring class");
		fw.flush();
		FileReader fr = new FileReader(f1);
		int data = fr.read();
		while (data!=-1){
			System.out.println((char)data);
		data= fr.read();
		}
		}
		catch(Exception e){
			
		}
	}
}

