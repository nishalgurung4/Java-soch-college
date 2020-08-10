import java.applet.Applet;  
import java.awt.Graphics;  
  
public class Param extends Applet{  
  

public void init()
{
	System.out.println("Init");
}

public void start()
{
	System.out.println("Start");

}
public void stop()
{
	System.out.println("Stop");

}
public void destroy()
{
	System.out.println("Destroy");

}
public void paint(Graphics g){  
String str=getParameter("msg");  
g.drawString(str,50, 50);  
}  
  
}  

/*
<applet code="Param.class" width="300" height="300">  
<param name="msg" value="Welcome to applet">  
</applet>
 */