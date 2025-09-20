package Pokemons;

import java.io.Serializable;

import javax.swing.ImageIcon;

import Interfaces.Fantasma;

public class Banette extends MeuPokemon implements Fantasma, Serializable {

	private ImageIcon imagemPokemon;

	public Banette(int nivel, int ataque, int defesa, String nome, boolean vivo, ImageIcon imagemPokemon, int quantVitorias, double peso, double altura) {
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
			return "Banette: Shadow Sneak";
		case 2:
			return "Banette: Feint Attack";
		case 3:
			return "Banette: Hex";
		case 4:
			return "Banette: Shadow Ball";
		default:
			return "Banette: Shadow Sneak";
		}
	}      
	public double golpeFantasma1() {
		return 4.0;
	}
	public double golpeFantasma2() {
		return 6.0;
	}
	public double golpeFantasma3() {
		return 6.5;
	}
	public double golpeFantasma4() {
		return 8.0;
	}
	public double golpe(int int_random) {
		switch (int_random) {
		case 1:
			return golpeFantasma1();
		case 2:
			return golpeFantasma2();
		case 3:
			return golpeFantasma3();
		case 4:
			return golpeFantasma4();
		default:
			return golpeFantasma1();
		}
	}
}