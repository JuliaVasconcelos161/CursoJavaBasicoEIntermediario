package com.loiane.cursojava.aula56;

public class Pessoa {
	private TipoDocumento tipoDoc;
	private String numeroDocumento;
	
	public Pessoa(TipoDocumento tipoDoc, String numeroDocumento) {
		super();
		this.tipoDoc = tipoDoc;
		this.numeroDocumento = numeroDocumento;
	}
	public Pessoa() {
	}
	public TipoDocumento getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(TipoDocumento tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
	@Override
	public String toString() {
		return "Pessoa [tipoDoc=" + tipoDoc + ", numeroDocumento=" + numeroDocumento + "]";
	}
	
	
}
