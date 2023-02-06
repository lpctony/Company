package org;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class sutdentUI extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField chi;
	private JTextField eng;
	private JTextField math;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sutdentUI frame = new sutdentUI();
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
	public sutdentUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(58, 48, 280, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student");
		lblNewLabel.setFont(new Font("標楷體", Font.BOLD, 24));
		lblNewLabel.setBounds(86, 10, 94, 32);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(140, 198, 198));
		panel_1.setBounds(58, 108, 280, 191);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("姓名:");
		lblNewLabel_1.setFont(new Font("標楷體", Font.BOLD, 18));
		lblNewLabel_1.setBounds(32, 30, 55, 20);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("國文:");
		lblNewLabel_1_1.setFont(new Font("標楷體", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(32, 60, 55, 20);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("英文:");
		lblNewLabel_1_2.setFont(new Font("標楷體", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(32, 90, 55, 20);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("數學:");
		lblNewLabel_1_3.setFont(new Font("標楷體", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(32, 120, 55, 20);
		panel_1.add(lblNewLabel_1_3);
		
		name = new JTextField();
		name.setBounds(88, 30, 96, 21);
		panel_1.add(name);
		name.setColumns(10);
		
		chi = new JTextField();
		chi.setColumns(10);
		chi.setBounds(88, 60, 96, 21);
		panel_1.add(chi);
		
		eng = new JTextField();
		eng.setColumns(10);
		eng.setBounds(88, 90, 96, 21);
		panel_1.add(eng);
		
		math = new JTextField();
		math.setColumns(10);
		math.setBounds(88, 120, 96, 21);
		panel_1.add(math);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 128));
		panel_2.setBounds(58, 309, 280, 259);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea output = new JTextArea();
		output.setBounds(34, 72, 213, 161);
		panel_2.add(output);
		
		JButton ok = new JButton("確定");
		ok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Name = name.getText();
				int Chi = Integer.parseInt(chi.getText());
				int Eng = Integer.parseInt(eng.getText());
				int Math = Integer.parseInt(math.getText());
				
				student s1 = new student(Name,Chi,Eng,Math);
				output.setText(" 成績明細"+"\n 姓名: "+s1.getName()+"\n 國文: "+
				s1.getChi()+"\n 英文: "+s1.getEng()+"\n 數學"+s1.getMath()+
				"\n 總分: "+s1.getSum()+"\n 平均: "+s1.getAve());
				
				name.setText("");
				chi.setText("");
				eng.setText("");
				math.setText("");
			}
		});
		ok.setFont(new Font("標楷體", Font.BOLD, 18));
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ok.setBounds(93, 20, 87, 31);
		panel_2.add(ok);
	}
}
