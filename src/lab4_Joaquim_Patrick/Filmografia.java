package lab4_Joaquim_Patrick;

import java.util.ArrayList;
import java.util.List;

public class Filmografia {

	private static List<Filme> filmes = new ArrayList<>();
	
	
	public void addFilme(Filme f) {
		filmes.add(f);
	}
	
	public String getFilmes(Funcionario f) {
		StringBuilder sb = new StringBuilder();
		
		for (Filme filme : filmes) {
			List<String> funcoes = filme.getFuncao(f);

			if (!funcoes.isEmpty()) {
				sb.append("\t" + filme.getNome() + ": " + funcoes + "\n");
			}
		}
		return sb.toString();
	}
}
