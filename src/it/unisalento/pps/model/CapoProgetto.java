package it.unisalento.pps.model;

public class CapoProgetto extends Utente {

	private String nome;
	private String cognome;
	private String telefono;
	private String email;
	
	
	public CapoProgetto(String username, String password) {
		super(username, password);
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
		this.email = email;
		
	}
	
	
	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getCognome() {
		return cognome;
	}




	public void setCognome(String cognome) {
		this.cognome = cognome;
	}




	public String getTelefono() {
		return telefono;
	}




	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
