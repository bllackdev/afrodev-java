package contaCorrente;

/**
 * @author Raphael Renato
 *
 * ****Exercicio****
 * Tentar acessar os atributos
 * da classe Conta, com outra Calsse
 * DENTRO do Pacote da Conta.
 *
 * ****Resposta****
 * Não conseguimos acessar o atributo
 * com o Modificador PRIVATE!!!
 * Apenas os atributos com os Modificadore
 * PUBLIC (nome) e PROTECTED (conta)
 * conseguimos acessar.
 */

public class ContaDentroPackage {
    public static void main(String[] args) {
        Conta conta = new Conta();

        System.out.println(conta.nome);
        System.out.println(conta.conta);
        //System.out.println(conta.saldo);
    }
}
