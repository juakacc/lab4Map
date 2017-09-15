package lab4_Joaquim_Patrick;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Filmografia f = new  Filmografia();
		
		Funcionario joaquim = new Funcionario("Joaquim");
		Funcionario alfredo = new Funcionario("Alfredo");
		Funcionario marcio = new Funcionario("Marcio");
		
		Diretor diretor = new Diretor(joaquim);
		Roteirista roteirista = new Roteirista(joaquim);
		List<Ator> elenco = new ArrayList<>();
		Ator ator1 = new Ator(joaquim);
		elenco.add(ator1);
		elenco.add(new Ator(alfredo));
		elenco.add(new Ator(marcio));
		
		
		List<Musica> trilhaSonora = new ArrayList<>();
		trilhaSonora.add(new Musica("Bawitaba"));
		trilhaSonora.add(new Musica("The Barracuda"));
		int ano = 2017;
		
		Filme filme = new Filme("Velozes e Furiosos", diretor, roteirista, elenco, trilhaSonora, ano);
		
		
		f.addFilme(filme);
		
		System.out.println(joaquim.getFilmografia());
		System.out.println(marcio.getFilmografia());
		
	}
}
