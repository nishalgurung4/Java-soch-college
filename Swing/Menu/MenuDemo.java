import javax.swing.*;
class MenuDemo
{
	MenuDemo()
	{
		JFrame frame = new JFrame("Menu Demo");
		JMenuBar bar = new JMenuBar();

		//Menu
		JMenu file = new JMenu("File");

			//item for file
			JMenuItem n = new JMenuItem("New");
			file.add(n);

			JMenu saveAs = new JMenu("SaveAs");
				JMenuItem old = new JMenuItem("Old");
				saveAs.add(old);
			file.add(saveAs);



		JMenu edit = new JMenu("Edit");
		JMenu window = new JMenu("Window");


		bar.add(file);
		bar.add(edit);
		bar.add(window);

		frame.setJMenuBar(bar);


		frame.setVisible(true);
		frame.setSize(500, 500);

	}

	public static void main(String[] args)
	{
		new MenuDemo();
	}

}