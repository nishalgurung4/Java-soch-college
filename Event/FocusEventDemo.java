import java.awt.*;  
import java.awt.event.*;  
public class FocusEventDemo extends Frame implements FocusListener{  
    FocusEventDemo(){  
    	TextField b = new TextField();
    	TextField c = new TextField();
    	b.setBounds(100, 100, 50, 20);
    	c.setBounds(100, 200, 50, 20);

    	add(b);
    	add(c);
        b.addFocusListener(this);  
          
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);
        setLayout(null);  
    }  
      
public static void main(String[] args) {  
    new FocusEventDemo();  
} 

	public void focusGained(FocusEvent e)
	{
		System.out.println("Gained");
	} 

	public void focusLost(FocusEvent e)
	{
		System.out.println("Lost");
	}
 
}