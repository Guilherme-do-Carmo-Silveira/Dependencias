
public class NoteBook {
	
	String placaMae;
	private Processador processador;
	MemoriaRam memoria;
	

	public NoteBook() {
		this.placaMae = "Stell Legend AsRock";
		processador = new Processador();
		memoria = new MemoriaRam();
	}
	
	public NoteBook(String PlacaMae, MemoriaRam memoria) {
		this.placaMae = PlacaMae;
		this.memoria = memoria;
		processador = new Processador(5.5, 10.0, "AM4");
	}

	@Override
	public String toString() {
		return "NoteBook [placaMae=" + placaMae + ", processador=" + processador + ", memoria=" + memoria + "]";
	}

}
