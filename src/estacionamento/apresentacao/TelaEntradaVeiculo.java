package estacionamento.apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import estacionamento.controle.EstacionamentoController;
import estacionamento.controle.EstacionamentoException;
import estacionamento.controle.VeiculoException;

public class TelaEntradaVeiculo extends JFrame implements ActionListener {
	private JFrame parent;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtCor;
	private JFormattedTextField txfPlaca;
	private JButton btnOK;
	private JButton btnCancel;
	
	//TODO temporario
	public static void main(String[] args) {
		TelaEntradaVeiculo tela = new TelaEntradaVeiculo(null);
		tela.setVisible(true);
	}

	public TelaEntradaVeiculo(JFrame parent) {
		setResizable(false);
		setSize(545,430);
		setTitle("Entrada de Veiculo");
		
		this.parent = parent;
		getContentPane().setLayout(null);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setBounds(62, 63, 69, 20);
		getContentPane().add(lblPlaca);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(62, 107, 69, 20);
		getContentPane().add(lblMarca);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(62, 153, 69, 20);
		getContentPane().add(lblModelo);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setBounds(62, 200, 69, 20);
		getContentPane().add(lblCor);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(175, 104, 146, 26);
		getContentPane().add(txtMarca);
		txtMarca.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(175, 150, 146, 26);
		getContentPane().add(txtModelo);
		txtModelo.setColumns(10);
		
		txtCor = new JTextField();
		txtCor.setBounds(175, 200, 146, 26);
		getContentPane().add(txtCor);
		txtCor.setColumns(10);
		
		btnCancel = new JButton("Cancelar");
		btnCancel.setBounds(235, 293, 115, 29);
		btnCancel.addActionListener(this);
		btnCancel.setActionCommand("cancel");
		getContentPane().add(btnCancel);
		
		btnOK = new JButton("Ok");
		btnOK.setBounds(62, 293, 115, 29);
		btnOK.addActionListener(this);
		btnOK.setActionCommand("ok");
		getContentPane().add(btnOK);
		
		try {
			txfPlaca = new JFormattedTextField(new MaskFormatter("UUU-####"));
		} catch (ParseException e) {
			assert false: "Padrão de placa errado";
		}
		txfPlaca.setBounds(175, 60, 86, 26);
		getContentPane().add(txfPlaca);
		
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getActionCommand().equals("ok")){
			EstacionamentoController controle = new EstacionamentoController();
			try {
				controle.processarEntrada(txfPlaca.getText(), 
										  txtMarca.getText(),
										  txtModelo.getText(), 
										  txtCor.getText());
				JOptionPane.showMessageDialog(null, "Veiculo Registrado com sucesso",
						"Entrada de Veiculo", JOptionPane.INFORMATION_MESSAGE);
			} catch (EstacionamentoException | VeiculoException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(),"Falha na Entrada", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		this.parent.setVisible(true);
		this.dispose();
		
	}
}
