import java.io.*;
import java.rmi.*;
public class Client
	{
		public static void main(String args[])
	{
	try
		{
			intf ch=(intf)Naming.lookup("lr");

			byte[] fdata=ch.getFileContent(args[0]);


			System.out.println("Enter the File Name:");

			BufferedReader d=new BufferedReader(new InputStreamReader(System.in));

			String fname=d.readLine();

			File file=new File(fname);

		BufferedOutputStream d1=new BufferedOutputStream(new FileOutputStream(file.getName()));
		
		d1.write(fdata,0,fdata.length);
		
		d1.close();
		}
	catch(IOException e)
	{
	}
	catch(Exception e)
	{
	}
}
}
