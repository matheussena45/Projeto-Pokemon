package Pokemons;

import java.io.Serializable;

import javax.swing.ImageIcon;

import Interfaces.Eletrico;
import Interfaces.Voador;

public class Zapdos extends MeuPokemon implements Voador, Eletrico, Serializable{

	private ImageIcon imagemPokemon;

	public Zapdos(int nivel, int ataque, int defesa, String nome, boolean vivo, ImageIcon imagemPokemon, int quantVitorias, double peso, double altura) {
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
			return "Zapdos: Peck";
		case 2:
			return "Zapdos: Thunder";
		case 3:
			return "Zapdos: Drill Peck";
		case 4:
			return "Zapdos: Discharge";
		default:
			return "Zapdos: Peck";
		}
	}
	public double golpeDeRaio1() {
		return 3.5;	
	}
	public double golpeDeRaio2() {
		return 11.0;	
	}
	public double golpeVoador1() {
		return 8.0;	
	}
	public double golpeVoador2() {
		return 7.0;	
	}
	public double golpe(int int_random) {
		switch (int_random) {
		case 1:
			return golpeDeRaio1();
		case 2:
			return golpeDeRaio2();
		case 3:
			return golpeVoador1();
		case 4:
			return golpeVoador2();
		default:
			return golpeDeRaio1();
		}
	}

	public double golpeVoador3() {
		//nada
		return 0;
	}
	public double golpeVoador4() {
		//nada
		return 0;
	}
	public double golpeDeRaio3() {
		//nada
		return 0;
	}
	public double golpeDeRaio4() {
		//nada
		return 0;
	}
}