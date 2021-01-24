import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandeling {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
     
		String path="C:\\Users\\Sandip Ghosh\\Desktop\\mywebsite\\2022.txt";
		File fl= new File(path);
	//CREATE AN FILE	
		
		try
		{
		fl.createNewFile();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		//WRITE INSIDE AN FILE
		try
		{
		FileWriter fw= new FileWriter(path);
		fw.write("hi i love you sandip");
		fw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//READ FROM A FILE
		try{
		FileReader fr= new FileReader(path);
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//READ FROM A FILE USING SCANNER CLASS
		try
		{
		Scanner sc = new Scanner(fl);
        System.out.println("\n");
		while(sc.hasNext())
		{
			System.out.print(sc.next()+" ");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
}
}
