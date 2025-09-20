package Pokemons;

import Principal.Pokemon;

import java.io.Serializable;

import javax.swing.Icon;



public abstract class MeuPokemon extends Pokemon implements Serializable{
	int quantVitorias;
	double peso;
	double altura;
	public int getQuantVitorias() {
		return quantVitorias;
	}
	public void setQuantVitorias(int quantVitorias) {
		this.quantVitorias = quantVitorias;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	} 
	public abstract Icon getImagemPokemon();
	public abstract String nomeGolpe(int int_random);
}