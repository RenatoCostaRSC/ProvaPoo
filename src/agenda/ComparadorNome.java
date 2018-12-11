package agenda;

import java.util.Comparator;

public class ComparadorNome implements Comparator<Contato> {
	
	
	@Override
	public int compare(Contato c, Contato o) {
		
		return c.getNome().compareTo(o.getNome()) ;
	}

}
