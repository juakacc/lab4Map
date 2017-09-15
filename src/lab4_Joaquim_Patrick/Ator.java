package lab4_Joaquim_Patrick;

public class Ator {
	
	private Funcionario f;
	
	public Ator (Funcionario f) {
		this.f = f;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Ator other = (Ator) obj;
		Funcionario func = other.getF();
		
		if (!f.equals(func)) {
			return false;
		}
		
		return true;
	}

	public Funcionario getF() {
		return f;
	}
}
