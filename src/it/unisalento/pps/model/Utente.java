package it.unisalento.pps.model;

import it.unisalento.pps.dao.UtenteDAO;


public class Utente {
	
	private String username;
	private String password;
	
	
	public Utente(String username, String password) {
		this.username = username;
		this.password = password;
	}

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public boolean login()
	{
		return UtenteDAO.getInstance().userExists(this);
	}
	
}