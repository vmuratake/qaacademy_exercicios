package easy;

public class Ex10execucao {
    public static void main(String[] args) {
        Exercicio10 exercicio10 = new Exercicio10();

        double valorInvestimento = 10000.00;
        double taxaJuros = 0.05;
        double valorJuros = exercicio10.calcularInvestimento(valorInvestimento, taxaJuros);

        
        System.out.println("O valor do juros será: R$ "+valorJuros); 
        System.out.println("Você investiu: R$ "+valorInvestimento);
        System.out.println("O valor total são: R$ "+(valorInvestimento+valorJuros));
    }
}


