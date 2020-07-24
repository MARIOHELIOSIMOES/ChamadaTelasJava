package view;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class JPanelTela1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPanelTela1() {
		setLayout(null);
		
		JLabel lblTela = new JLabel("TELA 1");
		lblTela.setBounds(179, 130, 70, 15);
		add(lblTela);

	}

}
