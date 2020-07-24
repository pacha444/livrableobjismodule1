package com.gestionclient.domaine;

public abstract class Client {
	private int idclient;
	private String tel;
	private String email;
	
	
	public Client(int idclient, String tel, String email) {
		super();
		this.idclient = idclient;
		this.tel = tel;
		this.email = email;
	}
	public int getIdclient() {
		return idclient;
	}
	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void identifiercli()
	{
		System.out.println("Cette m�thode permet d'identifier la nature du client");
	}
	
	

	
}
