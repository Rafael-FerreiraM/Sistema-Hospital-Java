import javax.swing.JOptionPane;

public class Maternidade extends Servicos {

	  public void maternidade () {
    String msgMaternidade = "{|||___Paciente Enviado para a Maternidade___|||}";
      msgMaternidade += "\n{ Pode esperar tranquilamente no\n seu quarto, que um de nosso funcionários\nirá lhe atender e lever você e seu bebe\npara a Maternidade";
	  JOptionPane.showMessageDialog(null, msgMaternidade);
	}
}
