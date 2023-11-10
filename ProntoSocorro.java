import javax.swing.JOptionPane;

public class ProntoSocorro extends Servicos {
  
	public void prontoSocorro () {
    String msgPronto = "{|||___Paciente foi Eviado para o\n Pronto Socorro___|||}";    
	  JOptionPane.showMessageDialog(null, msgPronto);
		}
}
