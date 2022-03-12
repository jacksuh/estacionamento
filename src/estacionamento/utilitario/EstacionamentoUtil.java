package estacionamento.utilitario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public static boolean validarPadraoPlaca(String placa){
    	String padrao = "[A_Z][A_Z][A_Z]-\\d\\d\\d\\d";
        Pattern p = Pattern.compile(padrao);
        Matcher m = p.matcher(placa);
    	
        return m.matches();
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

