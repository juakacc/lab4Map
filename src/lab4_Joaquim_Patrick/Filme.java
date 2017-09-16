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
	private Cinegrafista cinegrafista;
	
	
	public Filme(String nome, Diretor diretor, Roteirista roteirista, Cinegrafista cinegrafista, List<Ator> elenco, List<Musica> trilhaSonora,
			int ano) {
		this.nome = nome;
		this.diretor = diretor;
		this.roteirista = roteirista;
		this.cinegrafista = cinegrafista;
		this.elenco = new ArrayList<>(elenco);
		this.trilhaSonora = new ArrayList<>(trilhaSonora);
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
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Características do filme -> ");
		builder.append(nome + ":\n");
		builder.append("\tDiretor: ");
		builder.append(diretor);
		builder.append("\n\tRoteirista: ");
		builder.append(roteirista);
		builder.append("\n\tCinegrafista: ");
		builder.append(cinegrafista);
		builder.append("\n\tElenco: ");
		builder.append(elenco);
		builder.append("\n\tTrilha sonora: ");
		builder.append(trilhaSonora);
		builder.append("\n\tAno: ");
		builder.append(ano);
		
		return builder.toString();
	}


	public List<String> getFuncao(Funcionario f) {
		List<String> funcoes = new ArrayList<>();
		if (diretor.equals(new Diretor(f))) {
			funcoes.add("Diretor");
		}
		if (roteirista.equals(new Roteirista(f))) {
			funcoes.add("Roteirista");
		}
		if (cinegrafista.equals(new Cinegrafista(f))) {
			funcoes.add("Cinegrafista");
		}
		if (elenco.contains(new Ator(f))) {
			funcoes.add("Ator");
		}
		return funcoes;
	}
	
}
