package br.edu.ifpb.jpa.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//@DiscriminatorValue("BlogPostagem")

@Entity
public class BlogPostagem extends Publicacao {

	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
