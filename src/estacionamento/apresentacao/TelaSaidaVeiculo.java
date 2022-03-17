package estacionamento.apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

import estacionamento.controle.EstacionamentoController;
import estacionamento.negocio.Movimentacao;

public class TelaSaidaVeiculo extends JFrame implements ActionListener{
	
	private JFrame parent;
	private JFormattedTextField txtPlaca;
	

	
	public TelaSaidaVeiculo(JFrame parent) {
		setResizable(false);
		setTitle("Saida de Veiculo");
		setSize(new Dimension(620, 214));
		this.parent = parent;
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnOK = new JButton("Ok");
		btnOK.addActionListener(this);
		btnOK.setActionCommand("ok");
		panel.add(btnOK);
		
		JButton btnCancel = new JButton("Cancelar");
		btnCancel.addActionListener(this);
		btnCancel.setActionCommand("cancelar");
		panel.add(btnCancel);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setVgap(30);
		getContentPane().add(panel_1, BorderLayout.CENTER);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(lblPlaca);
		
	
		try {
			txtPlaca = new JFormattedTextField(new MaskFormatter("UUU-####"));
		} catch (ParseException e) {
			assert false :"Formato do padrao invalido";
		}
		
		txtPlaca.setForeground(Color.BLUE);
		txtPlaca.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(txtPlaca);
		txtPlaca.setColumns(10);
		
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		String cmd = evento.getActionCommand();
		
		if(cmd.equals("ok")){
			//vai para a proxima tela de pagamento
			EstacionamentoController controle = new EstacionamentoController();
			Movimentacao movimentacao = controle.processarSaida(txtPlaca.getText());
			TelaResumoPagamento telaresumo = new TelaResumoPagamento(movimentacao,parent);
			telaresumo.setVisible(true);
		}else{
			parent.setVisible(true);
			
		}
		
		dispose();
		
	}

}
