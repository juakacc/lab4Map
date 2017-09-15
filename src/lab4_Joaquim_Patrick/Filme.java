package lab4_Joaquim_Patrick;

import java.util.ArrayList;
import java.util.List;

public class Filme {
	
	private String nome;
	private Diretor diretor;
	private Roteirista roteirista;
	private List<Ator> elenco;
	private List<Musica> trilhaSonora;
	private int ano;
	
	
	public Filme(String nome, Diretor diretor, Roteirista roteirista, List<Ator> elenco, List<Musica> trilhaSonora,
			int ano) {
		this.nome = nome;
		this.diretor = diretor;
		this.roteirista = roteirista;
		this.elenco = elenco;
		this.trilhaSonora = trilhaSonora;
		this.ano = ano;
	}


	public String getNome() {
		return nome;
	}


	public Diretor getDiretor() {
		return diretor;
	}


	public Roteirista getRoteirista() {
		return roteirista;
	}


	public List<Ator> getElenco() {
		return elenco;
	}


	public List<Musica> getTrilhaSonora() {
		return trilhaSonora;
	}


	public int getAno() {
		return ano;
	}
	
	// 3
	@Override
	public String toString() {
		return "Filme [getNome()=" + getNome() + ", getDiretor()=" + getDiretor() + ", getRoteirista()="
				+ getRoteirista() + ", getElenco()=" + getElenco() + ", getTrilhaSonora()=" + getTrilhaSonora()
				+ ", getAno()=" + getAno() + "]";
	}

	public List<String> getFuncao(Funcionario f) {
		List<String> funcoes = new ArrayList<>();
		if (diretor.equals(new Diretor(f))) {
			funcoes.add("Diretor");
		}
		if (roteirista.equals(new Roteirista(f))) {
			funcoes.add("Roteirista");
		}
		if (elenco.contains(new Ator(f))) {
			funcoes.add("Ator");
		}
		return funcoes;
	}
	
}
