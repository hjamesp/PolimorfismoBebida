
public class Aplicacao {
	
	public static void main(String[] args) {
		
		//Animal a = new Cachorro(); //Casting IMPLICITO
		// ou Animal a = (Cachorro) c;
		//if(a instanceof Cachorro) {
		//Cachorro c = (Cachorro)a;
		//c.morder();
		//a.falar();
		//}
		Cachorro c = new Cachorro();
		Gato g = new Gato();
		
		falar(c);
		falar(g);
	} 
	
	private static void falar(Animal a) {
		a.falar();

	}

}
