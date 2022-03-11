package estacionamento.negocio;

/**
 * Representa as informações relativas a vagas do estacionamento ou status de ocupação.
 *
 * @Author: Jackson Santos
 */
public class Vaga {
	public static int TOTAL_VAGAS = 100;
    private static int vagasOcupadas = 0;

    private Vaga(){}


    /**
     * verificar a existencia de alguma vaga livre no estacionamento.
     *
     * @return true se houver alguma vaga e false se estiver lotado.
     */
    public static boolean temVagaLivre(){
        //TODO implementar este metodo.
        return false;
    }

    /**
     * Buscar o status atual das vagas do estacionamento.
     */
    public static void inicializarOcupadas(){
        //TODO implementar
    }

    /**
     * Retorna numero de vagas ocupadas.
     * @return numero total de vagas ocupadas em um determinado instante
     */
    public static int ocupadas(){
        return Vaga.vagasOcupadas;
    }

    /**
     * Retornar o numoero de vagas livres
     * @return numero tatol de vagas livres num determinado instante
     *
     */
    public static int livres(){
        return TOTAL_VAGAS - Vaga.vagasOcupadas;
    }

    /**
     * Atualiza o numero de vagas ocupadas apos entrada do veiculo.
     */
    public static void entrou(){
       Vaga.vagasOcupadas ++;
    }
}
