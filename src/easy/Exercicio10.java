package easy;

public class Exercicio10 {
    public double  calcularInvestimento( double valorInvestimento, double taxaJuros) {
        double valorJuros = 0;
        int i=1;

        // String valorInveString = JOptionPane.showInputDialog("O valor do investimento será de R$ ");
        // Double valorInve = Double.parseDouble(valorInveString);

        //Sem While:
        // taxaJuros= 0.05*10;
        // valorJuros= valorInve*taxaJuros;
        // valorTotal= valorJuros+valorInve;


        while (i <= 10) {
            valorJuros = (valorInvestimento * taxaJuros) + valorJuros;
            i++;
        }
        return valorJuros;


        // valorTotal = valorJuros + valorInvestimento;
    }

    
}
