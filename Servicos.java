import javax.swing.JOptionPane;

public class Servicos extends Cadastro {
Cadastro cadastro = new Cadastro();
  
private int servico;
private int contadorClinico;
private int contadorMaternidade;
private int contadorOftalmo;
private int contadorPronto;
private double contaInicial;

public int getServico() {
		return servico;
	}
public void setServico(int servico) {
		this.servico = servico;
	}
public int getContadorClinico() {
		return contadorClinico;
	}
public void setContadorClinico(int contadorClinico) {
		this.contadorClinico = contadorClinico;
	}
public int getContadorMaternidade() {
		return contadorMaternidade;
	}
public void setContadorMaternidade (int contadorMaternidade) {
		this.contadorMaternidade = contadorMaternidade;
	}
public int getContadorOftalmo() {
		return contadorOftalmo;
	}
public void setContadorOftalmo (int contadorOftalmo) {
		this.contadorOftalmo = contadorOftalmo;
	}
public int getContadorPronto() {
		return contadorPronto;
	}
public void setContadorPronto (int contadorPronto) {
		this.contadorPronto = contadorPronto;
	}
public double getContaInicial() {
		return contaInicial;
	}
public void setContaInicial(double contaInicial) {
		this.contaInicial = contaInicial;
}
  
public double preco (double taxa) {
  this.contaInicial = 0;
  return this.getContaInicial();
}

 public void escolherServico () {
    ClinicoGeral puxarClinico = new ClinicoGeral();
    Maternidade puxarMaternidade = new Maternidade();
    Oftalmo puxarOftalmo = new Oftalmo();
    ProntoSocorro puxarPronto = new ProntoSocorro();

    do {
    this.servico = Integer.parseInt(JOptionPane.showInputDialog("|| Digite qual Serviço o Paciente irá Utilizar: \n>> Digite 1 - Clínico Geral\n>> Digite 2 - Maternidade\n>> Digite 3 - Oftalmo\n>> Digite 4 - Pronto Socorro "));

    switch (this.getServico()) {
      case 1:
        //this.valorClinico = 100.00;   
        //2000 + (2000 * 0.05)
        puxarClinico.servicoClinico();
        puxarClinico.pagamento(0);
          this.contaInicial = this.getContaInicial() + 100;
      break;
      case 2:
        //this.valorMaternidade = 8000.00; 
        puxarMaternidade.maternidade();
        puxarMaternidade.pagamento(0);
        this.contaInicial = this.getContaInicial() + 8000; 
      break;
      case 3:
        //this.valorOftalmo = 150.00;  
        puxarOftalmo.oftalmo();
        puxarOftalmo.pagamento(0);
        this.contaInicial = this.getContaInicial() + 150;
        break;
      case 4:
        //this.valorProntoSocorro = 748.00;
        puxarPronto.prontoSocorro();
        puxarPronto.pagamento(0);
        this.contaInicial = this.getContaInicial() + 780;
      break;

        
      } 
      String msgTentarNovamente = "|| O Paciente Gostaria ou Precisa Utilizar";
        msgTentarNovamente += "\n mais Algum de Nossos Serviços?\n\n";
        msgTentarNovamente += "|| Se o Paciente não precisar ou";
        msgTentarNovamente += "\n não quiser mais nossos serviços, DIGITE 0";
        msgTentarNovamente += "\n na próxima página ao invés de digitar algum";
        msgTentarNovamente += "\n número de Serviço";
        JOptionPane.showMessageDialog(null, msgTentarNovamente);
  } while (this.getServico() != 0);

 }
  
  public double pagamento(double taxa) {
    return this.getContaInicial();
  }

  public void mostrarConta () {
    String msgConta = "|| Sua conta final é: ";
    msgConta += this.getContaInicial();
    
    JOptionPane.showMessageDialog(null, msgConta);
  }
 }