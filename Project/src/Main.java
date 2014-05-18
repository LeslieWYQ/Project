import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Font;


public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		mnNewMenu.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("New menu");
		mnNewMenu_1.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("New menu");
		mnNewMenu.add(mnNewMenu_3);
		
		JMenu menu = new JMenu("New menu");
		menuBar.add(menu);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setForeground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Encode");
		btnNewButton.setBounds(166, 470, 122, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Decode");
		btnNewButton_1.setBounds(491, 470, 122, 32);
		contentPane.add(btnNewButton_1);
		
		JLabel lblAsdasdasda = new JLabel("Picture Stagnagraphy Tool");
		lblAsdasdasda.setForeground(SystemColor.inactiveCaptionText);
		lblAsdasdasda.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblAsdasdasda.setBounds(182, 181, 399, 55);
		contentPane.add(lblAsdasdasda);
		
		JLabel lblUseOfNonrepre = new JLabel("Use of Non-repudiation and Authentication to secure your images' rights.");
		lblUseOfNonrepre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUseOfNonrepre.setForeground(SystemColor.inactiveCaptionText);
		lblUseOfNonrepre.setBounds(58, 247, 681, 46);
		contentPane.add(lblUseOfNonrepre);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\yellow-folder-lock-data-security-concept-3d-20925219.jpg"));
		lblNewLabel_1.setBounds(634, 0, 160, 114);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Untitled2.png"));
		lblNewLabel.setBounds(0, 74, 794, 352);
		contentPane.add(lblNewLabel);
	}
}
