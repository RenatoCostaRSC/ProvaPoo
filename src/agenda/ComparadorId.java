package agenda;

import java.util.Comparator;

public class ComparadorId implements Comparator<Contato> {

	@Override
	public int compare(Contato c, Contato o) {
		
		return c.getId() - o.getId();
	}
	
	

}
