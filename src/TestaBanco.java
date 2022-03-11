
public class TestaBanco {
	public static void main(String[] args) {
		Cliente fulano = new Cliente();
		fulano.nome = "Fulano da Silva";
		fulano.cpf = "222.222.222-22";
		fulano.profissao = "Programador";
		
		Conta contaDoFulano = new Conta();
		contaDoFulano.deposita(100);
		
		contaDoFulano.titular = fulano; // Associa o cliente a conta
		System.out.println(contaDoFulano.titular.nome);
	}
}
