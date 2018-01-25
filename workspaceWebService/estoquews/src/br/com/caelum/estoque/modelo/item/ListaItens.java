package br.com.caelum.estoque.modelo.item;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement  //definir que será apresentado os valores em um xml
@XmlAccessorType(XmlAccessType.FIELD) //diz ao JAX-B para trabalhar com acessos aos atributos e não aos propreties (getters/setters)
public class ListaItens {

	@XmlElement(name="item") //dizendo que cada elemento da lista é um item na estrutura do XML
	private List<Item> itens;

	public ListaItens(List<Item> itens) {
		this.itens = itens;
	}

	ListaItens() {
	}
	
	public List<Item> getItens() {
		return itens;
	}
	
}
