package estacionamento.controle;

import java.time.LocalDateTime;

import java.util.List;

import estacionamento.negocio.Movimentacao;
import estacionamento.negocio.Vaga;
import estacionamento.negocio.Veiculo;
import estacionamento.persistencia.DAOEstacionamento;
import estacionamento.utilitario.EstacionamentoUtil;




public class EstacionamentoController {
	
	public void processarEntrada(String placa,String marca,String modelo, String cor) throws EstacionamentoException, VeiculoException{
        //Verificar se o estacionamento esta cheio
		if(!Vaga.temVagaLivre()){
			throw new EstacionamentoException("Estacionamento Lotado!");
		}
		//verificar o padrão de string da placa
		if(!EstacionamentoUtil.validarPadraoPlaca(placa)){
			throw new VeiculoException("Placa informada invalida");
		}
		//criar uma instancia do veiculo
		Veiculo veiculo = new Veiculo(placa,marca,modelo,cor);
		//criar a movimentacao vinculando o veiculo com data de entrada
		Movimentacao movimentacao = new Movimentacao(veiculo, LocalDateTime.now());
		//registrar na base da dados a informação.
		DAOEstacionamento dao =  new DAOEstacionamento();
		dao.criar(movimentacao);
		//atualizar o numero de vagas ocupadas
		Vaga.entrou();
		
    }

    public Movimentacao processarSaida(String placa){
        //TODO implementar
        return null;
    }

    public List<Movimentacao> emitirRelatorio(LocalDateTime data){
        //TODO

        return null;
    }
}
