package easy;

import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        
        double valorTotal, valorJuros= 0, taxaJuros= 0.05;
        int i=1;

        String valorInveString = JOptionPane.showInputDialog("O valor do investimento será de R$ ");
        Double valorInve = Double.parseDouble(valorInveString);

        //Sem While:
        // taxaJuros= 0.05*10;
        // valorJuros= valorInve*taxaJuros;
        // valorTotal= valorJuros+valorInve;


        while (i <= 10) {
            valorJuros = (valorInve * taxaJuros) + valorJuros;
            i++;
        }

        valorTotal = valorJuros + valorInve;

        System.out.println("Você investiu R$ " +valorInve);
        System.out.println("Rendeu R$ " +valorJuros+ " de Juros.");   
        System.out.println("O valor total são R$ " +valorTotal);

    }
}
