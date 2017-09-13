package lab3_Joaquim_Patrick;

import java.util.ArrayList;
import java.util.List;

public class Filmografia {

	private List<Filme> filmes;
	
	public Filmografia() {
		this.filmes = new ArrayList<>();
	}
	
	public void addFilme(Filme f) {
		filmes.add(f);
	}
	
	public List<Filme> getFilmes(Funcionario f) {
		List<Filme> aux = new ArrayList<>();
		
		for (Filme filme : filmes) {
			if (filme.isFuncionario(f)) {
				aux.add(filme);
			}
		}
		return aux;
	}
}
