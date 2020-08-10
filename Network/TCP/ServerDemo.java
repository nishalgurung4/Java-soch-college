import java.net.*;
import java.io.*;
class ServerDemo
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss = new ServerSocket(3333);
		Socket s = ss.accept();
		DataInputStream dis=new DataInputStream(s.getInputStream());  
		String  str=(String)dis.readUTF();  
		System.out.println("message= "+str);  
		ss.close();
		
	}

}