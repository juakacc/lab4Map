package lab4_Joaquim_Patrick;

public class Diretor {

	private Funcionario f;

	public Diretor(Funcionario f) {
		this.f = f;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((f == null) ? 0 : f.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Diretor other = (Diretor) obj;
		Funcionario func = other.getF();
		
		if (!f.equals(func))
			return false;
		
		return true;
	}

	public Funcionario getF() {
		return f;
	}
	
}
