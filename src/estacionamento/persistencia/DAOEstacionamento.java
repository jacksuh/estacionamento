package estacionamento.persistencia;

import java.time.LocalDateTime;

import java.util.List;

import estacionamento.negocio.Movimentacao;

public class DAOEstacionamento {
	public void criar(Movimentacao movimentacao){
        //TODO implementar
    }

    public void atualizar(Movimentacao movimentacao){
        //TODO implementar.
    }

    public Movimentacao buscarMovimentacaoAberta(String placa){
        //TODO implementar
        return null;

    }

    public List<Movimentacao> consultarMovimentacoes(LocalDateTime data){
        //TODO implementar.
        return null;
    }
}
