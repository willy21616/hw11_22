package p35;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Sample5_7 {
	public static void main(String[] args)
	{
		try
		{
			FileWriter fw=new FileWriter("teat1.txt");
			PrintWriter pw =new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Holle!");
			pw.println("GoodBye!");
			
			pw.close();
			System.out.println("��Ƥw�g�J�ɮפF");
		}
		catch(IOException e)
		{
			System.out.println("��X�J���~");
		}
	}

}
