package parteII;

public class ExParametroSemComRetorno {
    public static void main(String[] args) {
        //Sem retorno
        contagem( 1, 2, 3);
        salario(1.000, 2.000, 3.000);
        predioTorre(2, 6, 8);
        carroModelo(320, 450, 640);
        estoque(50, 10, 5);

        //Com retorno
        System.out.println(contagem2("Um", "Dois", "Três")); 
        System.out.println(salario2("Hum mil", "Dois mil", "Três mil"));
        System.out.println(predioTorre2("Torre 2", "Torre 6", "Torre 8")); 
        System.out.println(carroModelo2("Peugeot 320", "Peugeot 450", "Peugeot 640"));
        System.out.println(estado("Paraná", "Amapá", "São Paulo"));
    }

    public static void contagem(int num1, int num2, int num3){
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

    public static String contagem2(String num1, String num2, String num3){    
            return num1+" - "+num2+" - "+num3;
    }

    public static void salario(Double janeiro, Double fevereiro, Double marco){
        System.out.println(janeiro);
        System.out.println(fevereiro);
        System.out.println(marco);
    }

    public static String salario2(String janeiro, String fevereiro, String marco){    
            return janeiro+" - "+fevereiro+" - "+marco;
    }

    public static void predioTorre(int predio1, int predio2, int predio3){
        System.out.println(predio1);
        System.out.println(predio2);
        System.out.println(predio3);
    }

    public static String predioTorre2(String predio1, String predio2, String predio3){    
            return predio1+" - "+predio2+" - "+predio3;
    }


    public static void carroModelo(int ModeloBasico, int ModeloCompacto, int ModeloPlus){
        System.out.println(ModeloBasico);
        System.out.println(ModeloCompacto);
        System.out.println(ModeloPlus);
    }

    public static String carroModelo2(String modeloBasico, String modeloCompacto, String modeloPlus){    
            return modeloBasico+" - "+modeloCompacto+" - "+modeloPlus;
    }


    public static void estoque(int celular, int televisao, int geladeira){
        System.out.println(celular);
        System.out.println(televisao);
        System.out.println(geladeira);
    }

    public static String estado(String regiaoSul, String regiaoNorte, String regiãoSudeste){    
            return regiaoSul+" - "+regiaoNorte+" - "+regiãoSudeste;
    }


    

}
