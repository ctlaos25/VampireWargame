package game.pieza;

import utilidades.Utils;

public class Muerte extends Pieza implements Movible {

	private int zombies = 0;
	public Muerte(){}
	public Muerte(boolean blanco, int x, int y)
	{
		this.blanco = blanco;
		identificador = (blanco) ? "BM" : "NM";
		setX(x);
		setY(y);
		setHp(3);
		setEscudo(1);
		ataque = 4;
	}
	
	public Muerte(boolean blanco, int escudo, int ataque, 
			int hp, int x, int y, String identificador)
	{
		super(blanco,escudo,ataque,hp,x,y,identificador);
	}
	public void menuPiezaSeleccionada() 
	{
		Utils.clearConsole();
		System.out.println("Muerte : ");
		System.out.println("HP : " + getHp());
		System.out.println("Escudo : " + getEscudo());
		System.out.println("Ataque : " + getAtaque());
		System.out.println("Zombies : " + getNumeroDeZombies());
		System.out.println("1 : Mover");
		System.out.println("2 : Atacar con lanza");
		System.out.println("3 : Atacar con zombie");
		System.out.println("4 : Conjurar Zombie");
		Utils.separador();
	}
	
	public int getNumeroDeZombies(){return zombies;}
}
