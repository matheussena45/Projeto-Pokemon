package Pokemons;

import java.io.Serializable;

import javax.swing.ImageIcon;

import Interfaces.Voador;

public class Pidgeotto extends MeuPokemon implements Voador, Serializable {

	private ImageIcon imagemPokemon;

	public Pidgeotto(int nivel, int ataque, int defesa, String nome, boolean vivo, ImageIcon imagemPokemon, int quantVitorias, double peso, double altura) {
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
			return "Pidgeotto: Gust";
		case 2:
			return "Pidgeotto: Air Slash";
		case 3:
			return "Pidgeotto: Wing Attack";
		case 4:
			return "Pidgeotto: Feather Dance";
		default:
			return "Pidgeotto: Gust";
		}
	}
	public double golpeVoador1() {
		return 4.0;
	}
	public double golpeVoador2() {
		return 7.5;
	}
	public double golpeVoador3() {
		return 6.0;
	}
	public double golpeVoador4() {
		return 5.5;
	}
	public double golpe(int int_random) {
		switch (int_random) {
		case 1:
			return golpeVoador1();
		case 2:
			return golpeVoador2();
		case 3:
			return golpeVoador3();
		case 4:
			return golpeVoador4();
		default:
			return golpeVoador1();
		}
	}
}