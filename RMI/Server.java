import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class Server extends ServerImpl{

	
	public static void main(String args[]) { 
	      try { 
	         // Instantiating the implementation class 
	         ServerImpl obj = new ServerImpl(); 
	    
	         // Exporting the object of implementation class  
	         // (here we are exporting the remote object to the stub) 
	         ServerInterface stub = (ServerInterface) UnicastRemoteObject.exportObject(obj, 0);  
	         
	         // Binding the remote object (stub) in the registry 
	         Registry registry = LocateRegistry.getRegistry(); 
	         
	         registry.bind("ServerInterface", stub);  
	         System.out.println("Server ready"); 
	      } catch (Exception e) { 
	         System.out.println("Server exception: " + e.toString()); 
	         e.printStackTrace(); 
	      } 
	   } 

}
