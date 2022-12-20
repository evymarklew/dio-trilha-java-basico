public class main {
    
    public static void main(String[] args) {

        // calculadora
        System.out.println(" Exercicio calculadora");
        calculadora.soma(3, 6);
        calculadora.subtracao(9, 1.8);
        calculadora.multiplicacao(7, 8);
        calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem(hora: 9);
        Mensagem.obterMensagem(hora: 14);
        Mensagem.obterMensagem(hora: 1); 

       // Emprestimo
       System.out.println("Exercicio emprestimo");
       Emprestimo.calcular( valor: 1000, Emprestimo.getDuasParcelas());
       Emprestimo.calcular( valor: 1000, Emprestimo.getTresParcelas());
       Emprestimo.calcular( valor: 1000, parcelas: 5);

    }

}
