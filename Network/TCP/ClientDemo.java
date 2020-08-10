import java.net.*;
import java.io.*;
class ClientDemo
{
public static void main(String args[]) throws Exception
	{
	Socket s = new Socket("localhost", 3333);
	DataOutputStream dout=new DataOutputStream(s.getOutputStream());
	dout.writeUTF("Hello Server");
	dout.flush();
	dout.close();
	s.close();
}

}