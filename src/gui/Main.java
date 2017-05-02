package gui;

import javax.swing.*;

public class Main extends JFrame{

	public Main() {
		super("Simple GUI Application");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
		add(new JLabel("<html><body><h2>Hello World!</h2><h2>This is a simple GUI application</h2><h3>By: SAMI BETTAYEB.</h3></body></html>"));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Main().setLocationRelativeTo(null);

	}

}
