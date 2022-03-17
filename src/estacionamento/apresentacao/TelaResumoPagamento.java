package estacionamento.apresentacao;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import estacionamento.negocio.Movimentacao;

public class TelaResumoPagamento extends JFrame implements ActionListener{
	
	private JFrame parent;

	public TelaResumoPagamento(Movimentacao movimentacao, JFrame parent) {
		this.parent = parent;
		getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
		setResizable(false);
		setTitle("Resumo de Pagamento");
		getContentPane().setLayout(null);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPlaca.setBounds(76, 52, 69, 20);
		getContentPane().add(lblPlaca);
		
		JLabel lblDataEntrada = new JLabel("Entrada:");
		lblDataEntrada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataEntrada.setBounds(76, 103, 69, 20);
		getContentPane().add(lblDataEntrada);
		
		JLabel lblDataSaida = new JLabel("Saida:");
		lblDataSaida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataSaida.setBounds(76, 157, 69, 20);
		getContentPane().add(lblDataSaida);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValor.setBounds(76, 222, 69, 20);
		getContentPane().add(lblValor);
		
		JLabel lblValPlaca = new JLabel("{placa}");
		lblValPlaca.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValPlaca.setBounds(375, 52, 104, 20);
		getContentPane().add(lblValPlaca);
		
		JLabel lblValDataEntrada = new JLabel("{data_entrada}");
		lblValDataEntrada.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValDataEntrada.setBounds(375, 103, 169, 20);
		getContentPane().add(lblValDataEntrada);
		
		JLabel lblValDataSaida = new JLabel("{data_saida}");
		lblValDataSaida.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValDataSaida.setBounds(375, 157, 196, 20);
		getContentPane().add(lblValDataSaida);
		
		JLabel lblValValor = new JLabel("{valor}");
		lblValValor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValValor.setBounds(375, 222, 196, 20);
		getContentPane().add(lblValValor);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(this);
		btnOk.setBounds(278, 356, 115, 29);
		getContentPane().add(btnOk);
		
		
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		parent.setVisible(true);
		dispose();
		
	}
}
