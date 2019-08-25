package tw.music.streamer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.awt.Color;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import AppPackage.AnimationClass;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8682190393117684757L;
	private JPanel contentPane;
	private Font GoogleSansBold;
	Font GoogleSansMedium;
	Font GoogleSansRegular;
	private JTextField textField;
	private JPasswordField passwordField;
	private boolean isLogin = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		
		// Importing Fonts
		try {
			
			GoogleSansBold = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/GoogleSans-Bold.ttf")).deriveFont(20f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts/GoogleSans-Bold.ttf")));
			
			GoogleSansMedium = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/GoogleSans-Medium.ttf")).deriveFont(20f);
			GraphicsEnvironment gq = GraphicsEnvironment.getLocalGraphicsEnvironment();
			gq.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts/GoogleSans-Medium.ttf")));
			
			GoogleSansRegular = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/GoogleSans-Regular.ttf")).deriveFont(20f);
			GraphicsEnvironment gw = GraphicsEnvironment.getLocalGraphicsEnvironment();
			gw.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts/GoogleSans-Regular.ttf")));
			
		} catch (FontFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 465);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250,250,250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(GoogleSansBold.deriveFont(50f));
		lblLogin.setForeground(new Color(12, 142, 245));
		lblLogin.setBounds(191, 27, 204, 59);
		contentPane.add(lblLogin);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(166, 114, 447, 72);
		contentPane.add(panel_4);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setFont(GoogleSansBold.deriveFont(50f));
		lblRegister.setForeground(new Color(12, 142, 245));
		lblRegister.setBounds(191, 114, 284, 59);
		contentPane.add(lblRegister);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(36, 151, 242));
		panel.setBounds(0, 0, 165, 462);
		contentPane.add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel Icon = new JLabel(" ");
		sl_panel.putConstraint(SpringLayout.NORTH, Icon, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, Icon, 26, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, Icon, -30, SpringLayout.EAST, panel);
		Icon.setIcon(new ImageIcon("D:\\eclipse-workspacce\\TeamMusicPC\\img\\Webp.net-resizeimage.jpg"));
		panel.add(Icon);
		
		JLabel lblTeammusic = new JLabel("TeamMusic");
		sl_panel.putConstraint(SpringLayout.WEST, lblTeammusic, 0, SpringLayout.WEST, Icon);
		sl_panel.putConstraint(SpringLayout.EAST, lblTeammusic, 0, SpringLayout.EAST, Icon);
		lblTeammusic.setForeground(new Color(250,250,250));
		lblTeammusic.setFont(GoogleSansMedium);
		sl_panel.putConstraint(SpringLayout.NORTH, lblTeammusic, 6, SpringLayout.SOUTH, Icon);
		panel.add(lblTeammusic);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 114, 632, 328);
		contentPane.add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JPanel panel_2 = new JPanel();
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel_2, 71, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, panel_2, -468, SpringLayout.EAST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, panel_2, -10, SpringLayout.EAST, panel_1);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblEmail = new JLabel("Email : ");
		lblEmail.setFont(GoogleSansRegular.deriveFont(15f));
		lblEmail.setForeground(new Color(12, 142, 245));
		lblEmail.setBounds(21, 0, 87, 39);
		panel_2.add(lblEmail);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 13));
		textField.setBorder(UIManager.getBorder("PopupMenu.border"));
		textField.setBounds(102, 8, 333, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		sl_panel_1.putConstraint(SpringLayout.SOUTH, panel_2, -26, SpringLayout.NORTH, panel_3);
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel_3, 136, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, panel_3, -400, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, panel_3, -153, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, panel_3, -10, SpringLayout.EAST, panel_1);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setFont(GoogleSansRegular.deriveFont(15f));
		lblPassword.setForeground(new Color(12, 142, 245));
		lblPassword.setBounds(582, 0, 80, 39);
		panel_3.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(UIManager.getBorder("PopupMenu.border"));
		passwordField.setBounds(665, 9, 332, 20);
		panel_3.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnLogin, 229, SpringLayout.NORTH, panel_1);
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if (!isLogin) {
					AnimationClass anim = new AnimationClass();
					anim.jLabelYDown(lblLogin.getY(), 28, 1, 1, lblLogin);
					anim.jLabelYDown(lblRegister.getY(), 120, 1, 1, lblRegister);
					isLogin = true;
				}
				btnLogin.setBackground(new Color(0, 114, 204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnLogin.setBackground(new Color(12, 142, 245));
			}
		});
		btnLogin.setForeground(new Color(250, 250, 250));
		btnLogin.setBackground(new Color(12, 142, 245));
		btnLogin.setBorderPainted(false);
		btnLogin.setFocusPainted(true);
		btnLogin.setFont(GoogleSansMedium);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnLogin, -152, SpringLayout.EAST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btnLogin, 93, SpringLayout.SOUTH, panel_3);
		btnLogin.setBorder(UIManager.getBorder("MenuBar.border"));
		sl_panel_1.putConstraint(SpringLayout.EAST, btnLogin, -60, SpringLayout.EAST, panel_1);
		panel_1.add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if (isLogin) {
					AnimationClass anim = new AnimationClass();
					anim.jLabelYUp(lblLogin.getY(), -70, 1, 1, lblLogin);
					anim.jLabelYUp(lblRegister.getY(), 28, 1, 1, lblRegister);
					isLogin = false;
				}
				btnRegister.setBackground(new Color(0, 114, 204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnRegister.setBackground(new Color(12, 142, 245));
			}
		});
		
		sl_panel_1.putConstraint(SpringLayout.WEST, btnRegister, -167, SpringLayout.WEST, btnLogin);
		btnRegister.setForeground(new Color(250, 250, 250));
		btnRegister.setBackground(new Color(12, 142, 245));
		btnRegister.setBorderPainted(false);
		btnRegister.setFocusPainted(true);
		btnRegister.setFont(GoogleSansMedium);
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnRegister, 0, SpringLayout.NORTH, btnLogin);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btnRegister, 0, SpringLayout.SOUTH, btnLogin);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnRegister, -22, SpringLayout.WEST, btnLogin);
		panel_1.add(btnRegister);
		
		JLabel lblForgotPassword = new JLabel("Forgot Password?");
		lblForgotPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblForgotPassword.setFont(GoogleSansRegular.deriveFont(12f));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblForgotPassword.setFont(GoogleSansRegular.deriveFont(10f));
			}
		});
		lblForgotPassword.setForeground(new Color(12, 142, 245));
		sl_panel_1.putConstraint(SpringLayout.WEST, lblForgotPassword, 175, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblForgotPassword, -22, SpringLayout.SOUTH, panel_1);
		lblForgotPassword.setFont(GoogleSansRegular.deriveFont(10f));
		panel_1.add(lblForgotPassword);
	
	}
}
