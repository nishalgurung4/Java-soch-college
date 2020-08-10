import javax.swing.*;
import java.awt.event.*;
class EventDemo implements ActionListener
{
	JTextField t;
	JButton btn, reset;
	EventDemo()
	{
		JFrame frame = new JFrame("Event Demo");
		frame.setVisible(true);
		frame.setSize(500, 500);

		t = new JTextField();
		t.setBounds(150, 50, 150, 20);
		btn = new JButton("Click Me");
		btn.setBounds(150, 100, 150, 20);

		reset = new JButton("Reset");
		reset.setBounds(150, 150, 150, 20);

		btn.addActionListener(this);
		reset.addActionListener(this);
		frame.add(t);


		frame.add(btn);

		frame.add(reset);

		frame.setLayout(null);

	}

	public void actionPerformed(ActionEvent obj)
	{
		if(obj.getSource() == btn)
		{
			t.setText("Clicked");
		} else {
			t.setText("");
		}
	}

	public static void main(String[] args)
	{
		new EventDemo();
	}

}