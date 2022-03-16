package estacionamento.utilitario;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Properties;
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
    	String padrao = "[A-Z][A-Z][A-Z]-\\d\\d\\d\\d";
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

    /**
     * Recupera uma propriedade do arquivo de configuração da aplicação.
     * @param propriedade
     * @return valor associado a propriedade
     */
	public static String get(String propriedade) {
		Properties prop = new Properties();
		String valor = null;
		try {
			prop.load(EstacionamentoUtil.class.
					getResourceAsStream("/recursos/configuration.txt"));
			valor = prop.getProperty(propriedade);
		} catch (IOException e) {
			assert false: "Configuração não carregada";
		}
		return valor;
	}
	
	public static String getDataAsString(LocalDateTime dataHoraEntrada){
		
		return dataHoraEntrada.toString();
	}
}

