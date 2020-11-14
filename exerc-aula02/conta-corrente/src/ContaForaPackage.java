import contaCorrente.Conta;

/**
 * @author Raphael Renato
 *
 * ****Exercicio****
 * Tentar acessar os atributos
 * da classe Conta, com outra Calsse
 * FORA do Pacote da Conta.
 *
 * ****Resposta****
 * Não conseguimos acessar os atributos
 * com os Modificadores PRIVATE e PROTECTED!!!
 * Apenas o atributo com o Modificador PUBLIC (nome)
 * conseguimos acessar.
 */
public class ContaForaPackage {
    public static void main(String[] args) {
        Conta conta = new Conta();

        System.out.println(conta.nome);
        //System.out.println(conta.conta);
        //System.out.println(conta.saldo);
    }
}
