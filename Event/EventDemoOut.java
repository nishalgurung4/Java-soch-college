import javax.swing.*;
import java.awt.event.*;
class EventDemoOut
{
	JTextField t;
	JButton btn, reset;
	EventDemoOut()
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

		OuterHandler obj = new OuterHandler(this);
		btn.addActionListener(obj);
		reset.addActionListener(obj);
		frame.add(t);


		frame.add(btn);

		frame.add(reset);

		frame.setLayout(null);

	}

	

	public static void main(String[] args)
	{
		new EventDemoOut();
	}

}

class OuterHandler  implements ActionListener
{
	EventDemoOut edo;
	OuterHandler(EventDemoOut edo)
	{
		this.edo = edo;
	}
	public void actionPerformed(ActionEvent obj)
	{
		if(obj.getSource() == edo.btn)
		{
			edo.t.setText("Clicked");
		} else {
			edo.t.setText("");
		}
	}

}