package Pokemons;

import java.io.Serializable;

import javax.swing.ImageIcon;

import Interfaces.Fogo;

public class Charmander extends MeuPokemon implements Fogo, Serializable{

	private ImageIcon imagemPokemon;

	public Charmander(int nivel, int ataque, int defesa, String nome, boolean vivo, ImageIcon imagemPokemon, int quantVitorias, double peso, double altura) {
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
			return "Charmander: Scratch";
		case 2:
			return "Charmander: Flamethrower";
		case 3:
			return "Charmander: Flame Burst";
		case 4:
			return "Charmander: Fire Fang";
		default:
			return "Charmander: Scratch";
		}
	} 
	public double golpeDeFogo1() {
		return 4.0;	
	}
	public double golpeDeFogo2() {
		return 9.0;	
	}
	public double golpeDeFogo3() {
		return 7.0;	
	}
	public double golpeDeFogo4() {
		return 6.5;	
	}
	public double golpe(int int_random) {
		switch (int_random) {
		case 1:
			return golpeDeFogo1();
		case 2:
			return golpeDeFogo2();
		case 3:
			return golpeDeFogo3();
		case 4:
			return golpeDeFogo4();
		default:
			return golpeDeFogo1();
		}
	}
}