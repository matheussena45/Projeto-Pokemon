package Pokemons;

import java.io.Serializable;

import javax.swing.ImageIcon;

import Interfaces.Lutador;

public class Machamp extends MeuPokemon implements Lutador, Serializable{

	private ImageIcon imagemPokemon;

	public Machamp(int nivel, int ataque, int defesa, String nome, boolean vivo, ImageIcon imagemPokemon, int quantVitorias, double peso, double altura) {
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
			return "Machamp: Dual Punch";
		case 2:
			return "Machamp: Wake-Up Slap";
		case 3:
			return "Machamp: Karate Chop";
		case 4:
			return "Machamp: Dynamic Punch";
		default:
			return "Machamp: Dual Punch";
		}
	}
	public double golpeLutador1() {
		return 4.0;
	}
	public double golpeLutador2() {
		return 7.0;
	}
	public double golpeLutador3() {
		return 5.0;
	}
	public double golpeLutador4() {
		return 10.0;
	}
	public double golpe(int int_random) {
		switch (int_random) {
		case 1:
			return golpeLutador1();
		case 2:
			return golpeLutador2();
		case 3:
			return golpeLutador3();
		case 4:
			return golpeLutador4();
		default:
			return golpeLutador1();
		}
	}
}