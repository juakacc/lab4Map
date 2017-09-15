package lab4_Joaquim_Patrick;

public class Cinegrafista {

private Funcionario f;
	
	public Cinegrafista(Funcionario f) {
		this.f = f;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Funcionario other = (Funcionario) obj;
		
		if (!f.equals(other))
			return false;
		
		return true;
	}
}
