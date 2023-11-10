
public class Main {

	public static void main(String[] args) {
		Cadastro cadastro = new Cadastro();
    Servicos opcoes = new Servicos();
    
		cadastro.inserirDados();
    opcoes.escolherServico();
    cadastro.mostrar();
    opcoes.mostrarConta();
	}

}
