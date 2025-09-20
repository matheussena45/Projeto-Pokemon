package Pokemons;

import java.io.Serializable;

import javax.swing.ImageIcon;

import Interfaces.Agua;

public class Magikarp extends MeuPokemon implements Agua, Serializable{

	private ImageIcon imagemPokemon;

	public Magikarp(int nivel, int ataque, int defesa, String nome, boolean vivo, ImageIcon imagemPokemon, int quantVitorias, double peso, double altura) {
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
			return "Magikarp: Splash";
		case 2:
			return "Magikarp: Bubble";
		case 3:
			return "Magikarp: Tackle";
		case 4:
			return "Magikarp: Soak";
		default:
			return "Magikarp: Splash";
		}
	}
	public double golpeDeAgua1() {
		return 2.5;
	}
	public double golpeDeAgua2() {
		return 3.0;
	}
	public double golpeDeAgua3() {
		return 4.0;
	}
	public double golpeDeAgua4() {
		return 3.5;
	}
	public double golpe(int int_random) {
		switch (int_random) {
		case 1:
			return golpeDeAgua1();
		case 2:
			return golpeDeAgua2();
		case 3:
			return golpeDeAgua1();
		case 4:
			return golpeDeAgua2();
		default:
			return golpeDeAgua1();
		}
	}
}