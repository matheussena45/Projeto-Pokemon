package Pokemons;

import java.io.Serializable;

import javax.swing.ImageIcon;

import Interfaces.Psiquico;

public class Kadabra extends MeuPokemon implements Psiquico, Serializable {

	private ImageIcon imagemPokemon;

	public Kadabra(int nivel, int ataque, int defesa, String nome, boolean vivo, ImageIcon imagemPokemon, int quantVitorias, double peso, double altura) {
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
			return "Kadabra: Teleport";
		case 2:
			return "Kadabra: Psycho Cut";
		case 3:
			return "Kadabra: Confusion";
		case 4:
			return "Kadabra: Psychic";
		default:
			return "Kadabra: Teleport";
		}
	}
	public double golpePsiquico1() {
		return 3.0;	
	}
	public double golpePsiquico2() {
		return 7.0;	
	}
	public double golpePsiquico3() {
		return 5.0;	
	}
	public double golpePsiquico4() {
		return 9.0;	
	}
	public double golpe(int int_random) {
		switch (int_random) {
		case 1:
			return golpePsiquico1();
		case 2:
			return golpePsiquico2();
		case 3:
			return golpePsiquico3();
		case 4:
			return golpePsiquico4();
		default:
			return golpePsiquico1();
		}
	}
}