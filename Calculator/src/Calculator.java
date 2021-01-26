import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Point;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Dimension;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Frame;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JRadioButton rdbtnNewRadioButton_1;
	private JButton btnNewButton;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	JButton btnNewButton_1 = new JButton("Clear");
	JButton btnNewButton_2 = new JButton("+");
	JButton btnNewButton_3 = new JButton("7");
	JButton btnNewButton_4 = new JButton("8");
	JButton btnNewButton_6 = new JButton("-");
	JButton btnNewButton_5 = new JButton("9");
	JButton btnNewButton_7 = new JButton("4");
	JButton btnNewButton_8 = new JButton("5");
	JButton btnNewButton_9 = new JButton("6");
	JButton btnNewButton_10 = new JButton("*");
	JButton btnNewButton_11 = new JButton("1");
	JButton btnNewButton_12 = new JButton("2");
	JButton btnNewButton_13 = new JButton("3");
	JButton btnNewButton_14 = new JButton("/");
	JButton btnNewButton_15 = new JButton("0");
	JButton btnNewButton_16 = new JButton(".");
	JButton btnNewButton_17 = new JButton("=");
	JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("ON");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	
	double num,ans;
	int calculation;
	private final JLabel lblNewLabel = new JLabel("");
	
	
	public Calculator() {
		setResizable(false);
		setLocation(new Point(400, 400));
		setType(Type.UTILITY);
		setTitle("Simple Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 308);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textField = new JTextField();
		textField.setSize(272, 29);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 23));
		textField.setLocation(new Point(12, 22));
		textField.setMargin(new Insets(5, 5, 5, 5));
		contentPane.add(textField);
		textField.setColumns(10);
		
		rdbtnNewRadioButton_1 = new JRadioButton("OFF");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disable();
				textField.setText("");
			}
		});
		buttonGroup_1.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(6, 58, 49, 29);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_1.setVerticalAlignment(SwingConstants.TOP);
		rdbtnNewRadioButton_1.setPreferredSize(new Dimension(35, 23));
		rdbtnNewRadioButton_1.setVerticalTextPosition(SwingConstants.TOP);
		contentPane.add(rdbtnNewRadioButton_1);
		
		
		btnNewButton = new JButton("<-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length=textField.getText().length();
				int number=textField.getText().length()-1;
				String store;
				if(length>0)
				{
					StringBuilder back=new StringBuilder(textField.getText());
					back.deleteCharAt(number);
					store=back.toString();
					textField.setText(store);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(75, 62, 62, 47);
		contentPane.add(btnNewButton);
		
		//JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enable();
			}
		});
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(6, 90, 49, 23);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_2.setVerticalTextPosition(SwingConstants.TOP);
		rdbtnNewRadioButton_2.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(rdbtnNewRadioButton_2);
		
		//JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(152, 62, 132, 25);
		contentPane.add(btnNewButton_1);
		
		//JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation=1;
				textField.setText("");
				lblNewLabel.setText(num + "+" );
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(224, 95, 62, 23);
		contentPane.add(btnNewButton_2);
		
		//JButton btnNewButton_3 = new JButton("7");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(6, 129, 62, 23);
		contentPane.add(btnNewButton_3);
		
		//JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.setBounds(75, 129, 62, 23);
		contentPane.add(btnNewButton_4);
		
		//JButton btnNewButton_5 = new JButton("9");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_5.setBounds(147, 129, 62, 23);
		contentPane.add(btnNewButton_5);
		
		//JButton btnNewButton_6 = new JButton("-");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation=2;
				textField.setText("");
				lblNewLabel.setText(num + "-" );
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6.setBounds(224, 129, 62, 23);
		contentPane.add(btnNewButton_6);
		
		//JButton btnNewButton_7 = new JButton("4");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_7.setBounds(6, 168, 62, 23);
		contentPane.add(btnNewButton_7);
		
		//JButton btnNewButton_8 = new JButton("5");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_8.setBounds(75, 168, 62, 23);
		contentPane.add(btnNewButton_8);
		
		//JButton btnNewButton_9 = new JButton("6");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_9.setBounds(147, 168, 62, 23);
		contentPane.add(btnNewButton_9);
		
		//JButton btnNewButton_10 = new JButton("*");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation=3;
				textField.setText("");
				lblNewLabel.setText(num + "*" );
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_10.setBounds(224, 168, 62, 23);
		contentPane.add(btnNewButton_10);
		
		//JButton btnNewButton_11 = new JButton("1");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
				 		
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_11.setBounds(6, 199, 62, 23);
		contentPane.add(btnNewButton_11);
		
		//JButton btnNewButton_12 = new JButton("2");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_12.setBounds(75, 199, 62, 23);
		contentPane.add(btnNewButton_12);
		
		//JButton btnNewButton_13 = new JButton("3");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
			
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_13.setBounds(147, 199, 62, 23);
		contentPane.add(btnNewButton_13);
		
		//JButton btnNewButton_14 = new JButton("/");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation=4;
				textField.setText("");
				lblNewLabel.setText(num + "/" );
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_14.setBounds(224, 199, 62, 23);
		contentPane.add(btnNewButton_14);
		
		//JButton btnNewButton_15 = new JButton("0");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_15.setBounds(6, 233, 62, 23);
		contentPane.add(btnNewButton_15);
		
		//JButton btnNewButton_16 = new JButton(".");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_16.setBounds(75, 233, 62, 23);
		contentPane.add(btnNewButton_16);
		
		//JButton btnNewButton_17 = new JButton("=");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic_operation();
				lblNewLabel.setText("");
				
			}
		});
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_17.setBounds(147, 235, 137, 23);
		contentPane.add(btnNewButton_17);
		lblNewLabel.setBounds(215, 0, 69, 23);
		
		contentPane.add(lblNewLabel);
		
		
	}
	
	public void arithmetic_operation() {
		switch(calculation)
		{
			case 1:	//Addition
				ans=num + Double.parseDouble(textField.getText());
				textField.setText(Double.toString(ans));
				break;
			case 2:	 //Substraction
				ans=num - Double.parseDouble(textField.getText());
				textField.setText(Double.toString(ans));
				break;
			case 3:	//Multiplication
				ans=num * Double.parseDouble(textField.getText());
				textField.setText(Double.toString(ans));
				break;
			case 4:	//Division
				ans=num / Double.parseDouble(textField.getText());
				textField.setText(Double.toString(ans));
				break;
				
		}
	}
	
	public void disable() {
		textField.setEnabled(false);
		btnNewButton.setEnabled(false);
		btnNewButton_1.setEnabled(false);
		btnNewButton_2.setEnabled(false);
		btnNewButton_3.setEnabled(false);
		btnNewButton_4.setEnabled(false);
		btnNewButton_5.setEnabled(false);
		btnNewButton_6.setEnabled(false);
		btnNewButton_7.setEnabled(false);
		btnNewButton_8.setEnabled(false);
		btnNewButton_9.setEnabled(false);
		btnNewButton_10.setEnabled(false);
		btnNewButton_11.setEnabled(false);
		btnNewButton_12.setEnabled(false);
		btnNewButton_13.setEnabled(false);
		btnNewButton_14.setEnabled(false);
		btnNewButton_15.setEnabled(false);
		btnNewButton_16.setEnabled(false);
		btnNewButton_17.setEnabled(false);
		
		}
		
	public void enable() {
		rdbtnNewRadioButton_1.setEnabled(true);
		rdbtnNewRadioButton_2.setEnabled(false);
		textField.setEnabled(true);
		btnNewButton.setEnabled(true);
		btnNewButton_1.setEnabled(true);
		btnNewButton_2.setEnabled(true);
		btnNewButton_3.setEnabled(true);
		btnNewButton_4.setEnabled(true);
		btnNewButton_5.setEnabled(true);
		btnNewButton_6.setEnabled(true);
		btnNewButton_7.setEnabled(true);
		btnNewButton_8.setEnabled(true);
		btnNewButton_9.setEnabled(true);
		btnNewButton_10.setEnabled(true);
		btnNewButton_11.setEnabled(true);
		btnNewButton_12.setEnabled(true);
		btnNewButton_13.setEnabled(true);
		btnNewButton_14.setEnabled(true);
		btnNewButton_15.setEnabled(true);
		btnNewButton_16.setEnabled(true);
		btnNewButton_17.setEnabled(true);
	}
	}

	
