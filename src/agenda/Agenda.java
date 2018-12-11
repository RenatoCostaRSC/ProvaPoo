package agenda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Agenda {
	
	Set<Contato> Agenda = new HashSet<Contato>();
	
	
	
	public ArrayList<Contato> converterHashSet(Set<Contato> Agenda){
		
		ArrayList<Contato> contatos = new ArrayList<Contato>();
		
		for (Contato contato : contatos) {
			
			contatos.add(contato);
		}
		
		return contatos;
		
	}
	
	public void ordenaNome() {
		
		ComparadorNome compara = new ComparadorNome();
		List <Contato> lista =  converterHashSet(Agenda);
		lista.addAll(Agenda);
		Collections.sort(lista, compara);
		for (Contato contato : lista) {
			
			System.out.println(contato);
			
		}
		
	}
	
	public void ordenaId() {
		
		ComparadorNome compara = new ComparadorNome();
		List <Contato> lista =  converterHashSet(Agenda);
		lista.addAll(Agenda);
		Collections.sort(lista, compara);
		for (Contato contato : lista) {
			
			System.out.println(contato);
			
		}
		
	}
	
	public void atualizar(int id,String Nome){
		
		try {
			Contato c = buscaContato(id);
			c.setNome(Nome);
		} catch (ContatoNotFoudException e) {
			
			System.out.println(e);
		}
		
	}
	
	public Contato buscaContato(int id) throws ContatoNotFoudException{
		
		Iterator<Contato> i = Agenda.iterator();
		while(i.hasNext()){
			Contato c = i.next();
			if(c.getId()==id){
				
				return c;
				
			}
			else{
				
				throw new ContatoNotFoudException("Contato não Encontrado");
				
			}
		}
		return null;
		
		
	}
	
	public void removerContato(Contato c){
		
		try {
			excluir(c);
		}catch (ContatoNotFoudException e) {
			
			System.out.println(e);
		}
		
	}
	
	public void excluir(Contato c) throws ContatoNotFoudException{
		
		if(Agenda.remove(c)==false){
			
			throw new ContatoNotFoudException("Contato Não Existe");
			
		}
		else{
			
			System.out.println("Contato Removido Com Sucesso");
			
		}
		
	}
	
	public void adicionar(Contato c){
		
		Agenda.add(c);
		
	}
	
	public void listar(){
				
		
		for (Contato contato : Agenda) {
			
			System.out.println(contato);
			
		}
		
	}

}
