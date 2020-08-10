import java.net.*;
class UrlDemo
{
	public static void main(String[] args)
	{
		try {
		URL url = new URL("https://sochcollege.edu.np:8080/java?present=10&teacher=nishal");
		System.out.println("Protocol: "+ url.getProtocol());
		System.out.println("Host Name: "+ url.getHost());
		System.out.println("Port Number: "+ url.getPort());
		System.out.println("File Name: "+ url.getFile());
		System.out.println("Query String: "+ url.getQuery());
	} catch (Exception e) {
		System.out.println("Exception");
	}

	}
}