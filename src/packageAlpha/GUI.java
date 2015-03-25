package packageAlpha;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JToolBar;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setTitle("Chaos Magic");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[440px,grow]", "[][][1px][grow]"));
		
		JButton btnChaosList = new JButton("Chaos List");
		contentPane.add(btnChaosList, "flowx,cell 0 0");
		
		JButton btnWackyLand = new JButton("WackyLand");
		contentPane.add(btnWackyLand, "flowx,cell 0 1");
		
		JButton btnEnchantWorldLand = new JButton("EnchantWorldLand");
		contentPane.add(btnEnchantWorldLand, "cell 0 0");
		
		JButton btnPersonaLand = new JButton("PersonaLand");
		contentPane.add(btnPersonaLand, "cell 0 0");
		
		JButton btn1d3 = new JButton("1d3");
		contentPane.add(btn1d3, "cell 0 1");
		
		JButton btn1d6 = new JButton("1d6");
		contentPane.add(btn1d6, "cell 0 1");
		
		JButton btn1d10 = new JButton("1d10");
		contentPane.add(btn1d10, "cell 0 1");
		
		JButton btnCoin = new JButton("Coin");
		contentPane.add(btnCoin, "cell 0 1");
		
		JTextArea resultText = new JTextArea();
		resultText.setLineWrap(true);
		resultText.setWrapStyleWord(true);
		resultText.setEditable(false);
		resultText.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		contentPane.add(resultText, "cell 0 3,grow");
		
		btnChaosList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultText.setText(ChaosMagic.roll("ChaosList"));
			}
		});
		
		btnEnchantWorldLand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultText.setText(ChaosMagic.roll("EnchantWorldLand"));
			}
		});
		
		btnPersonaLand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultText.setText(ChaosMagic.roll("PersonaLand"));
			}
		});
		
		btnWackyLand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultText.setText(ChaosMagic.roll("WackyLand"));
			}
		});
		
		btn1d3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultText.setText(ChaosMagic.roll("1d3"));
			}
		});
		
		btn1d6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultText.setText(ChaosMagic.roll("1d6"));
			}
		});
		
		btn1d10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultText.setText(ChaosMagic.roll("1d10"));
			}
		});
		
		btnCoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultText.setText(ChaosMagic.roll("Coin"));
			}
		});
	}
}
