
public class Principal {

	public static void main(String[] args) {
		
		MemoriaRam m = new MemoriaRam(56000, "DDR5");
		NoteBook n = new NoteBook("Aourus Elite", m);
		
		NoteBook n2 = new NoteBook();
		
		System.out.println("Notebook 1: " + n + "\nNOtebook 2: " + n2);
	}

}
