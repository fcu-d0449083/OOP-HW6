package fcu.iecs.oop.pokemon;
import java.util.Random;

public class GYM {
	public static void fight(Player... players){
		Random random = new Random();
		Pokemon[] p1,p2;
		String winner=null;
		int n=0;
		p1=players[0].getPokemons();
		p2=players[1].getPokemons();
		
		int i,wincount0=0,wincount1=0;
		
		for(i=0;i<3;i++)
		{
		if(p1[i].getType()==PokemonType.FIRE&&p2[i].getType()==PokemonType.GRASS){	
		wincount0++;
		}
		if(p1[i].getType()==PokemonType.GRASS&&p2[i].getType()==PokemonType.WATER){	
		wincount0++;
		}
		if(p1[i].getType()==PokemonType.WATER&&p2[i].getType()==PokemonType.FIRE){	
		wincount0++;
		}
		if(p1[i].getType()==PokemonType.FIRE&&p2[i].getType()==PokemonType.GRASS){	
		wincount1++;
		}
		if(p1[i].getType()==PokemonType.GRASS&&p2[i].getType()==PokemonType.WATER){
		wincount1++;
		}
		if(p1[i].getType()==PokemonType.WATER&&p2[i].getType()==PokemonType.FIRE){
		wincount1++;
		}
		if(p1[i].getType()==p2[i].getType())
		{
			if(p1[i].getCP()>p2[i].getCP())
			{	
			players[0].setLevel(players[0].getLevel()+1);
			wincount0++;
			}
			else if(p1[i].getCP()<p2[i].getCP())
			{
			players[1].setLevel(players[1].getLevel()+1);
			wincount1++;
			}
			else if(p1[i].getCP()==p2[i].getCP())
			{
				if(random.nextInt(2)==0){
					wincount0++;
				}
				else{	
					wincount1++;
				}
			}
		}
		}
		
		if(wincount0>wincount1){
			winner=players[0].getPlayerName();
			players[0].setLevel(players[0].getLevel()+1);
			n=players[0].getLevel();
		}
		else if(wincount1>wincount0){
			winner=players[1].getPlayerName();
			players[1].setLevel(players[1].getLevel()+1);
			n=players[1].getLevel();
		}
		System.out.println("\"Winner is ["+winner+"], and his/her level becomes ["+n+"].\"");
	}
}