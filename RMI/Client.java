import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

	public static void main(String[] args) {
		try {  
	         // Getting the registry 
	         Registry registry = LocateRegistry.getRegistry(null); 
	    
	         // Looking up the registry for the remote object 
	         ServerInterface stub = (ServerInterface) registry.lookup("ServerInterface"); 
	    
	         // Calling the remote method using the obtained object 
	         stub.printMsg(); 
	         
	         // System.out.println("Remote method invoked"); 
	      } catch (Exception e) {
	         System.out.println("Client exception: " + e.toString()); 
	         e.printStackTrace(); 
	      } 

	}

}
