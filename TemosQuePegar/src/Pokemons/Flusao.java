package Pokemons;

import java.io.Serializable;

import javax.swing.ImageIcon;

import Interfaces.Gigante;

public class Flusao extends MeuPokemon implements Gigante, Serializable{

	private ImageIcon imagemPokemon;

	public Flusao(int nivel, int ataque, int defesa, String nome, boolean vivo, ImageIcon imagemPokemon, int quantVitorias, double peso, double altura) {
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
			return "Flusão: Dinizismo";
		case 2:
			return "Flusão: Grrrr, woof woof";
		case 3:
			return "Flusão: Gol do Cano";
		case 4:
			return "Flusão: Pena Cortante";
		default:
			return "Flusão: Dinizismo";
		}
	}
	public double golpeGigante1() {
		return 5.5;
	}
	public double golpeGigante2() {
		return 7.5;
	}
	public double golpeGigante3() {
		return 7.0;
	}
	public double golpeGigante4() {
		return 8.5;
	}
	public double golpe(int int_random) {
		switch (int_random) {
		case 1:
			return golpeGigante1();
		case 2:
			return golpeGigante2();
		case 3:
			return golpeGigante3();
		case 4:
			return golpeGigante4();
		default:
			return golpeGigante1();
		}
	}
}