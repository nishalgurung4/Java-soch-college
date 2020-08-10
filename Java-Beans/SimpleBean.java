import java.awt.*;
import java.io.Serializable;
         
public class SimpleBean extends Canvas
                        implements Serializable
{
    //Constructor sets inherited properties
    public SimpleBean(){
        setSize(60,40);
        setBackground(Color.red);
    }
}