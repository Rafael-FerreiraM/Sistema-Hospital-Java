import javax.swing.JOptionPane;

public class Cadastro {

  private String nome;
  private String dataDeNascimento;
  private String genero; 
  private String documento;
  private String endereco;
  private String contato;
  private String email;

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getDataDeNascimento() {
	return dataDeNascimento;
}
public void setDataDeNascimento(String dataDeNascimento) {
	this.dataDeNascimento = dataDeNascimento;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public String getDocumento() {
	return documento;
}
public void setDocumento(String documento) {
	this.documento = documento;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public String getContato() {
	return contato;
}
public void setContato(String  contato) {
	this.contato = contato;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public void inserirDados() {
	this.nome = JOptionPane.showInputDialog("Nome: ");
	this.dataDeNascimento = JOptionPane.showInputDialog("Data de Nascimento: ");
	this.genero = JOptionPane.showInputDialog("Gênero: ");
	this.documento = JOptionPane.showInputDialog("Documento (CPF ou RG): ");
	this.endereco = JOptionPane.showInputDialog("Endereço: ");
	this.contato = JOptionPane.showInputDialog("Contato: ");
	this.email = JOptionPane.showInputDialog("E-mail (se não tiver digite 0)");
  }
  
  public void mostrar () { 
	  String mensagem = "{|||___Ficha do Paciente___|||}";
	  mensagem += "\nNome: " + this.getNome();
	  mensagem += "\nData de Nascimento: " + this.getDataDeNascimento();
	  mensagem += "\nGênero: " + this.getGenero();
	  mensagem += "\nDocumento: " + this.getDocumento();
	  mensagem += "\nEndereço: " + this.getEndereco();
	  mensagem += "\nContato: " + this.getContato();
	  mensagem += "\nE-mail: " + this.getEmail();
    
	  JOptionPane.showMessageDialog(null, mensagem);
} 
  
}