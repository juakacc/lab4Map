package lab4_Joaquim_Patrick;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Filmografia filmes = new  Filmografia();
		
		Funcionario jackie = new Funcionario("Jackie Chan");
		Funcionario alfredo = new Funcionario("Alfredo");
		Funcionario marcio = new Funcionario("Marcio");
		Funcionario joao = new Funcionario("João");
		Funcionario maria = new Funcionario("Maria");
		Funcionario mara = new Funcionario("Mara");
		Funcionario tati = new Funcionario("Tati");
		
		
		List<Ator> elenco = new ArrayList<>();
		elenco.add(new Ator(jackie));
		elenco.add(new Ator(alfredo));
		elenco.add(new Ator(marcio));
		elenco.add(new Ator(maria));
		elenco.add(new Ator(tati));
		
		List<Musica> trilhaSonora = new ArrayList<>();
		trilhaSonora.add(new Musica("Bawitaba"));
		trilhaSonora.add(new Musica("The Barracuda"));
		
		Filme vf = new Filme("Velozes e Furiosos", new Diretor(jackie), new Roteirista(alfredo), new Cinegrafista(tati), elenco, trilhaSonora, 2017);
		
		elenco.add(new Ator(mara));
		trilhaSonora.clear();
		trilhaSonora.add(new Musica("Angered Rhinos"));
		trilhaSonora.add(new Musica("Dodos"));
		trilhaSonora.add(new Musica("Baby Walks"));
		
		Filme aEraDoGelo = new Filme("A era do gelo", new Diretor(marcio), new Roteirista(maria), new Cinegrafista(mara), elenco, trilhaSonora, 2000);
		
		elenco.add(new Ator(joao));
		
		trilhaSonora.clear();
		trilhaSonora.add(new Musica("Say"));
		trilhaSonora.add(new Musica("Full of Joy"));
		
		Filme karateKid = new Filme("Karatê Kid", new Diretor(jackie), new Roteirista(marcio), new Cinegrafista(mara), elenco, trilhaSonora, 2010);
		
		filmes.addFilme(vf);
		filmes.addFilme(aEraDoGelo);
		filmes.addFilme(karateKid);
		
		System.out.println(jackie.getFilmografia());
		System.out.println(marcio.getFilmografia());
		System.out.println(mara.getFilmografia());
		
		System.out.println(vf);
		System.out.println(aEraDoGelo);
		System.out.println(karateKid);

	}
}
