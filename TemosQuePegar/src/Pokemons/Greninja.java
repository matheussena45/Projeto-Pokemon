package Pokemons;

import java.io.Serializable;

import javax.swing.ImageIcon;

import Interfaces.Agua;
import Interfaces.Sombrio;

public class Greninja extends MeuPokemon implements Sombrio, Agua, Serializable{

	private ImageIcon imagemPokemon;

	public Greninja(int nivel, int ataque, int defesa, String nome, boolean vivo, ImageIcon imagemPokemon, int quantVitorias, double peso, double altura) {
		this.nivel = nivel;
		this.ataque = ataque;
		this.defesa = defesa;
		this.nome = nome;
		this.vivo = vivo;
		this.imagemPokemon = imagemPokemon;
		this.quantVitorias = quantVitorias;
		this.peso = peso;
		this.altura = altura;
	}
	public ImageIcon getImagemPokemon() { 
		return imagemPokemon;
	}
	public void setImagemPokemon(ImageIcon imagemPokemon) {
		this.imagemPokemon = imagemPokemon;
	}
	public String nomeGolpe(int int_random) {
		switch (int_random) {
		case 1:
			return "Greninja: Smokescreen";
		case 2:
			return "Greninja: Night Slash";
		case 3:
			return "Greninja: Water Shuriken";
		case 4:
			return "Greninja: Aqua Jet";
		default:
			return "Greninja: Smokescreen";
		}
	}
	public double golpeSombrio1() {
		return 4.0;	
	}
	public double golpeSombrio2() {
		return 7.0;	
	}
	public double golpeDeAgua1() {
		return 5.5;	
	}
	public double golpeDeAgua2() {
		return 6.5;	
	}
	public double golpe(int int_random) {
		switch (int_random) {
		case 1:
			return golpeSombrio1();
		case 2:
			return golpeSombrio2();
		case 3:
			return golpeDeAgua1();
		case 4:
			return golpeDeAgua2();
		default:
			return golpeSombrio1();
		}
	}
	public double golpeSombrio3() {
		//nada
		return 0;	
	}
	public double golpeSombrio4() {
		//nada
		return 0;	
	}
	public double golpeDeAgua3() {
		//nada
		return 0;	
	}
	public double golpeDeAgua4() {
		//nada
		return 0;	
	}
}
