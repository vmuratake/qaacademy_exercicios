package medium;

import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        double taxaJuros= 0.05, valorJuros, valorTotal;
        int i=1;

         String valorInveString = JOptionPane.showInputDialog("Qual o valor do investimento R$ ");
         Double valorInve = Double.parseDouble (valorInveString);

         valorTotal = valorInve;


        while (i <= 10) {
            valorTotal = (valorTotal * taxaJuros) + valorTotal;
            i++;
        }
        

        valorJuros = valorTotal - valorInve;

        System.out.println("Você investiu R$ " +valorInve);
        System.out.println("Rendeu R$ " +valorJuros+ " de Juros");
        System.out.println("O valor Total será R$ " +valorTotal);
    }
}
