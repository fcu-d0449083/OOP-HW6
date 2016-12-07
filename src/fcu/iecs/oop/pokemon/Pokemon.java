package fcu.iecs.oop.pokemon;

public class Pokemon {
	
	private final String name;
	private final PokemonType type;
    private int cp;
    
	public Pokemon(String name,PokemonType type,int cp){
		this.name=name;
		this.type=type;
		this.cp=cp;
	}
	public String getName() {
	    return name;
	}
	public int getCP(){
		return cp;
	}
	public PokemonType getType(){
		return type;
	}
	public void setCP(int cp) {
		this.cp = cp;
	}

	
}