import javax.swing.JOptionPane;

public class ClinicoGeral extends Servicos {

  public void servicoClinico() {
    Servicos opcoes = new Servicos();
    String msgClinico = "{|||___Paciente foi Enviado para o Clinico Geral___|||}";
    msgClinico += "\n{ Vá para a Sala 25 no 2º Andar do Prédio, \nsuba e espere que nosso médico logo\nirá atender você, se entreta lendo revistas";
	  JOptionPane.showMessageDialog(null, msgClinico);
	  }
}
