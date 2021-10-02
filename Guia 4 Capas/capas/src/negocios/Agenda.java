package negocios;
import usuariointerfaz.Interfaz;
import java.util.LinkedList;
import datos.contacto;

public class Agenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaz i1=new Interfaz();
		i1.lectura();
	}
	
	//Lista de contactos
	LinkedList<contacto> lista= new LinkedList<contacto>();
	public boolean add(contacto contacto){
	char[] letras=contacto.getNombre().toCharArray();
	if(letras.length>=0 && letras.length<=10) {
	String enteroString=Long.toString(contacto.getCelular());
	letras=enteroString.toCharArray();
	if(letras.length==8) {
	lista.add(contacto);
	return true;
	}
	}
	return false;
	}
	@Override
	public String toString() {
		return "Agenda [lista=" + lista + "]";
	}
	public LinkedList<contacto> getLista() {
		return lista;
	}
	public void setLista(LinkedList<contacto> lista) {
		this.lista = lista;
	}
}
