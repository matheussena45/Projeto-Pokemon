package Pokemons;

import java.io.Serializable;

import javax.swing.ImageIcon;

import Interfaces.Eletrico;

public class Pikachu extends MeuPokemon implements Eletrico, Serializable {

	private ImageIcon imagemPokemon;

	public Pikachu(int nivel, int ataque, int defesa, String nome, boolean vivo, ImageIcon imagemPokemon, int quantVitorias, double peso, double altura) {
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
			return "Pikachu: Thunder Shock";
		case 2:
			return "Pikachu: Electro Ball";
		case 3:
			return "Pikachu: Spark";
		case 4:
			return "Pikachu: Thunderbolt";
		default:
			return "Pikachu: Thunder Shock";
		}
	}
	public double golpeDeRaio1() {
		return 4.0;	
	}
	public double golpeDeRaio2() {
		return 5.5;	
	}
	public double golpeDeRaio3() {
		return 6.5;	
	}
	public double golpeDeRaio4() {
		return 9.0;	
	}
	public double golpe(int int_random) {
		switch (int_random) {
		case 1:
			return golpeDeRaio1();
		case 2:
			return golpeDeRaio2();
		case 3:
			return golpeDeRaio3();
		case 4:
			return golpeDeRaio4();
		default:
			return golpeDeRaio1();
		}
	}
}