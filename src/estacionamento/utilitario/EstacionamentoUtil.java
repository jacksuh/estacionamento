package estacionamento.utilitario;

import estacionamento.negocio.Movimentacao;

public class EstacionamentoUtil {
	/**
     * Valida a placa com o padrao nacional.
     * L = Letra
     * N = Numero
     * @param placa Placa do veiculo
     *
     * @return true se atender o padrão e false senaão.
     */
    public boolean validarPadraoPlaca(String placa){
        //TODO implementar
        return false;
    }

    /**
     * O calculo do valor da estada do veiculo, baseado no tarifario e na hora de entrada e saida do veiculo.
     * @param movimentacao instancia da movimentacao
     *
     * altera a propria instancia do parametro.
     */
    public  void calcularPagamento (Movimentacao movimentacao){
        //TODO implementar.
    }
}

