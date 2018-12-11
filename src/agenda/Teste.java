package agenda;

public class Teste {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		Contato c1 = new Contato(4,"Renato","85989735454","renatosilvacosta1998@gmail.com");
		Contato c2 = new Contato(3,"Abestado","85989735454","renatosilvacosta1998@gmail.com");
		
		agenda.adicionar(c1);
		agenda.adicionar(c2);
		agenda.listar();
		//agenda.atualizar("Renato2", "telefone", "renatosilvacosta1998@gmail.com");
		//agenda.listar();
		//agenda.ordenaNome();
		agenda.ordenaId();
	}

}
