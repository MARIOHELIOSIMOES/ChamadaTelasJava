package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class JFramePrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFramePrincipal frame = new JFramePrincipal();
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
	public JFramePrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnEscolhaDeTelas = new JMenu("Escolha de Telas");
		menuBar.add(mnEscolhaDeTelas);
		
		JMenuItem mntmInicial = new JMenuItem("Inicial");
		mntmInicial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				trocarTela(new JPanelInicial());
			
			}
		});
		mnEscolhaDeTelas.add(mntmInicial);
		
		JMenuItem mntmTela1 = new JMenuItem("Tela 1");
		mntmTela1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				trocarTela(new JPanelTela1());
			
			}
		});
		mnEscolhaDeTelas.add(mntmTela1);
		
		
		JMenuItem mntmTela2 = new JMenuItem("Tela 2");
		mntmTela2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				trocarTela(new JPanelTela2());
			
			}
		});
		mnEscolhaDeTelas.add(mntmTela2);
		
		
		JMenuItem mntmTelaSolta = new JMenuItem("Tela Solta");
		mnEscolhaDeTelas.add(mntmTelaSolta);
		mntmTelaSolta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFrameTelaSolta jFrameTelaSolta = new JFrameTelaSolta();
				jFrameTelaSolta.setLocationRelativeTo(null);
				jFrameTelaSolta.setVisible(true);
				
			}
		});
		
		contentPane = new JPanelTela1();
		setContentPane(contentPane);
		
	}
	
	
	private void trocarTela(JPanel panel) {
		setContentPane(panel);
		revalidate();
	}
}
