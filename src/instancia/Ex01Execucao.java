package instancia;

public class Ex01Execucao {
    
    public static void main(String[] args) {
        Ex01Clientes objClientes = new Ex01Clientes();
        //chamando pelas variaveis
        System.out.println(objClientes.nome); 
        System.out.println(objClientes.sobrenome); 
        System.out.println(objClientes.idade); 
        //chamando pelos metodos
        objClientes.primeiroNome();
        objClientes.segundoNome();
        objClientes.nascimento();
    }

}
