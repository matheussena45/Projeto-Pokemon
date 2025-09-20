package Principal;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import Pokemons.Banette;
import Pokemons.Charmander;
import Pokemons.Flusao;
import Pokemons.Greninja;
import Pokemons.Kadabra;
import Pokemons.Machamp;
import Pokemons.Magikarp;
import Pokemons.MeuPokemon;
import Pokemons.Pidgeotto;
import Pokemons.Pikachu;
import Pokemons.Zapdos;


public class ConfigListBatalha implements Serializable{

	//CRIA UMA LISTA DE POKEMONS
	static ArrayList<MeuPokemon> listaPokemons = new ArrayList<>();//VARIAVEL DE CLASSE 
	//PODE SER ACESSADA DIRETAMENTE ATRAVÉS DO NOME DA CLASSE

	static {//INSTANCIA OS POKEMONS //INICIALIZAR AS LISTA DOS POKEMONS E ADICIONALOS A LISTAPOKEMONS
		ImageIcon imagemCharmander = new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\CHARMANDER.png");
		Charmander charmander = new Charmander(11, 75, 50, "Charmander",true, imagemCharmander, 0, 8.5, 0.6);
		ImageIcon imagemPikachu = new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\PIKACHU (2).png");
		Pikachu pikachu = new Pikachu(11, 73, 51, "Pikachu",true, imagemPikachu, 0, 6.0, 0.4);
		ImageIcon imagemKadabra = new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\KADABRA (2).png");
		Kadabra kadabra = new Kadabra(11, 92, 67, "Kadabra",true, imagemKadabra, 0, 56.5, 1.3);
		ImageIcon imagemMachamp = new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\MACHAMP.png");
		Machamp machamp = new Machamp(11, 130, 80, "Machamp",true, imagemMachamp, 0, 130.0, 1.6);
		ImageIcon imagemGreninja = new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\GRENINJA.png");
		Greninja greninja = new Greninja(11, 95, 68, "Greninja",true, imagemGreninja, 0, 40.0, 1.5);
		ImageIcon imagemMagikarp = new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\MAGIKARP.png");
		Magikarp magikarp = new Magikarp(11, 60, 53, "Magikarp",true, imagemMagikarp, 0, 10.0, 0.9);
		ImageIcon imagemZapdos = new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\ZAPDOS.png");
		Zapdos zapdos = new Zapdos(11, 110 , 85, "Zapdos",true, imagemZapdos, 0, 52.6, 1.6);
		ImageIcon imagemPidgeotto = new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\PIDGEOTTO.png");
		Pidgeotto pidgeotto = new Pidgeotto(11, 89, 57, "Pidgeotto",true, imagemPidgeotto, 0, 30.0, 1.1);
		ImageIcon imagemBanette = new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\BANETTE.png");
		Banette banette = new Banette(11, 98, 65, "Banette",true, imagemBanette, 0, 12.5, 1.1);
		ImageIcon imagemFlusao =  new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\FLUSAO.png");
		Flusao flusao = new Flusao(11, 500, 200, "Flusão", true, imagemFlusao, 0, 200.0, 4.0);

		//ADICIONA NA LISTA
		listaPokemons.add(charmander);
		listaPokemons.add(kadabra);
		listaPokemons.add(pikachu);
		listaPokemons.add(machamp);
		listaPokemons.add(greninja);
		listaPokemons.add(magikarp);
		listaPokemons.add(zapdos);
		listaPokemons.add(pidgeotto);
		listaPokemons.add(banette);
		listaPokemons.add(flusao);
	}
	//METODO PARA SALVAR AS ALTERAÇÕES DA LISTA
	public static void salvarAlteracoes(ArrayList<MeuPokemon> novaLista) {
		listaPokemons = novaLista;
	}
}