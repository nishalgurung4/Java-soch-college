import javax.swing.*;
// Through association
class FrameDemo
{
	public static void main(String[] args)
	{
		JFrame jf = new JFrame();

		JButton btn = new JButton("Click Me!");

		btn.setBounds(130,100,100, 40);//x axis, y axis, width, height  

		jf.add(btn);

		jf.setLayout(null);

		jf.setSize(400, 500);

		jf.setVisible(true);

	}

}