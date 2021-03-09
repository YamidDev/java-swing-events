package acceso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Window {

	private JFrame frame;
	private JTextField textField;
	private JLabel showText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(34, 10, 200, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton send = new JButton("Entrar");
		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = textField.getText();
				if(data.equals("yamid")) {
					showText.setText(data);
				}
			}
		});
		send.setBounds(149, 58, 85, 26);
		frame.getContentPane().add(send);
		
		showText = new JLabel("texto ingresado");
		showText.setBounds(34, 155, 138, 13);
		frame.getContentPane().add(showText);
	}
}
