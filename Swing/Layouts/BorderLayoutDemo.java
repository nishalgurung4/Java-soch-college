import javax.swing.*;
import java.awt.*;
class BorderLayoutDemo
{
	BorderLayoutDemo()
	{
		//container
		JFrame f = new JFrame();

		//component
		JButton north = new JButton("North");
		JButton south = new JButton("South");
		JButton east = new JButton("East");
		JButton west = new JButton("West");
		JButton center = new JButton("Center");
		
		f.setLayout(new BorderLayout(20,15));

		f.add(north, BorderLayout.NORTH);
		f.add(south, BorderLayout.SOUTH);
		f.add(east, BorderLayout.EAST);
		f.add(west, BorderLayout.WEST);
		f.add(center, BorderLayout.CENTER);

		f.setVisible(true);
		f.setSize(400, 400);
	}
	public static void main(String[] args)
	{
		new BorderLayoutDemo();
	}
}