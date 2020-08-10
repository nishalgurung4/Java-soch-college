import javax.swing.*;
class JButtonDemo
{
	JButtonDemo()
	{
		JFrame f = new JFrame("Button Demo");
		
		//Label
		JLabel l = new JLabel("User name:");
		l.setBounds(100,20, 100, 100);
		f.add(l);

		//TextField
		JTextField t = new JTextField("admin");
		t.setBounds(200, 50, 200, 40);
		f.add(t);



		//TextArea
		JTextArea ta = new JTextArea(60, 40);
		ta.setBounds(100, 100, 200, 100);
		f.add(ta);


		//Password Field
		JPasswordField p = new JPasswordField();
		p.setBounds(100,200, 200, 40);
		f.add(p);

		//button
		JButton btn = new JButton("Click");
		btn.setBounds(100,250, 60, 30);
		f.add(btn);

		f.setLayout(null);
		f.setVisible(true);
		f.setSize(500, 500);

	}

	public static void main(String[] args)
	{
		new JButtonDemo();
	}
}