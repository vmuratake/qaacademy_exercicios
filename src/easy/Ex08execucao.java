package easy;

public class Ex08execucao {
    public static void main(String[] args) {
        Exercicio08 exercicio08 = new Exercicio08();
        double salario = 2000.00;
        double impostoRenda = exercicio08.calcularImpostodeRenda(2000.00);

        System.out.println("O Valor do Imposto de renda será: " + impostoRenda);
        System.out.println("O Valor do Salario Bruto será: " + salario);
        System.out.println("O Valor do salario liquido será " +
        exercicio08.calcularSalarioLiquido(salario, impostoRenda, impostoRenda));
    }
}
