package Principal;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import Pokemons.MeuPokemon;
import Principal.Batalha;
import Principal.Pokemon;

public class Janela2{

	private JFrame janela2;
	MeuPokemon Player1;
	MeuPokemon Player2;

	public void setarJanela2() {
		//CONFIGURAÇÕES JANELA DE BATALHA
		layoutJanela2();//LAYOUT DA TELA			
		batalhar();//CHAMA A FUNÇÃO BATALHAR
		botaoVoltar();//BOTAO RESTART QUE VOLTA PARA O MENU
		imagemArena();//IMAGEM DA ARENA
	}

	private void player1(){//IMAGEM PLAYER1, GOLPE PLAYER1
		JLabel player1 = new JLabel();
		JLabel golpePlayer1 = new JLabel(Player1.nomeGolpe(Batalha.getIntRandom()));
		golpePlayer1.setFont(new Font("Snap ITC", Font.PLAIN, 20));
		golpePlayer1.setForeground(new Color(0, 0, 0));
		golpePlayer1.setBounds(647, 443, 363, 45);
		player1.setHorizontalAlignment(SwingConstants.CENTER);
		player1.setIcon((Player1).getImagemPokemon());
		player1.setBounds(130, 225, 282, 282);
		janela2.getContentPane().add(player1);
		janela2.getContentPane().add(golpePlayer1);
	}
	private void player2(){//IMAGEM PLAYER2, GOLPE PLAYER2
		JLabel player2 = new JLabel();
		JLabel golpePlayer2 = new JLabel(Player2.nomeGolpe(Batalha.getIntRandom()));
		golpePlayer2.setFont(new Font("Snap ITC", Font.PLAIN, 20));
		golpePlayer2.setForeground(new Color(0, 0, 0));
		golpePlayer2.setBounds(647, 387, 363, 45);
		player2.setHorizontalAlignment(SwingConstants.CENTER);
		player2.setIcon((Player2).getImagemPokemon());
		player2.setBounds(568, 0, 269, 299);
		janela2.getContentPane().add(player2);
		janela2.getContentPane().add(golpePlayer2);
	}
	private void vencedor(String nomeVencedor) {//IMPRIME O NOME DO VENCEDOR DA BATALHA
		JLabel vencedor = new JLabel("O Vencedor foi o");
		vencedor.setFont(new Font("Snap ITC", Font.PLAIN, 20));
		vencedor.setForeground(new Color(0, 0, 0));
		vencedor.setBounds(120, 0, 200, 50);
		janela2.getContentPane().add(vencedor);

		JLabel nomeDoVencedor = new JLabel(nomeVencedor);
		nomeDoVencedor.setFont(new Font("Snap ITC", Font.PLAIN, 20));
		nomeDoVencedor.setForeground(new Color(0, 0, 0));
		nomeDoVencedor.setBounds(320, 0, 200, 50);
		janela2.getContentPane().add(nomeDoVencedor);
	}
	private void layoutJanela2(){//CONFIG DA JANELA
		janela2 = new JFrame();
		janela2.setBounds(100, 100, 450, 300);
		janela2.setSize(1000, 500);
		janela2.getContentPane().setLayout(null);
		janela2.setResizable(false);
		janela2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		janela2.setLocationRelativeTo(null);
		janela2.setUndecorated(true);
		janela2.setVisible(true);
	}
	private void imagemArena(){//CONFIG DA IMAGEM DA ARENA
		JLabel imagemDeFundoTela2 = new JLabel();
		imagemDeFundoTela2.setHorizontalAlignment(SwingConstants.CENTER);
		imagemDeFundoTela2.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\ARENA.png"));
		imagemDeFundoTela2.setBounds(0, 0, 1000, 500);
		janela2.getContentPane().add(imagemDeFundoTela2);
	}
	private void botaoVoltar(){//BOTAO QUE VOLTA PARA A JANELA1/MENU DO JOGO
		JLabel botaoVoltar = new JLabel();
		botaoVoltar.setHorizontalAlignment(SwingConstants.CENTER);
		botaoVoltar.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\NEXT.png"));
		botaoVoltar.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				botaoVoltar.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent e) {
				botaoVoltar.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		botaoVoltar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//FECHA A JANELA DE BATALHA
				janela2.dispose();
				//ABRE O MENU
				Janela1 menuDoJogo = new Janela1();
				menuDoJogo.setarJanela1();
			}
		});
		botaoVoltar.setBounds(150, 60, 129, 45);
		janela2.getContentPane().add(botaoVoltar);
	}
	public void batalhar(){//CHAMA A LISTA USANDO O GETLIST
		ArrayList<MeuPokemon> listaPokemons = ConfigListBatalha.listaPokemons;

		Random random = new Random();//RANDOM PARA ESCOLHER DOIS POKEMONS DA LISTA
		int pokemon1;
		do {
			pokemon1 = random.nextInt(listaPokemons.size());
		} while (!listaPokemons.get(pokemon1).isVivo());

		int pokemon2;

		do {
			pokemon2 = random.nextInt(listaPokemons.size());
		} while (pokemon2 == pokemon1 || !listaPokemons.get(pokemon2).isVivo());

		Player1 = ConfigListBatalha.listaPokemons.get(pokemon1);
		Player2 = ConfigListBatalha.listaPokemons.get(pokemon2);

		Batalha batalhaPokemon = new Batalha();
		try {
			batalhaPokemon.configuraBatalha(Player1, Player2);
			Batalha.gerarIntRandom();//GERA UM RANDOM
			player1();//IMPRIME NA TELA AS CONFIGURAÇÕES DO PLAYER1
			player2();//IMPRIME NA TELA AS CONFIGURAÇÕES DO PLAYER2
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Pokemon vencedorDaBatalha = batalhaPokemon.batalhar();//SET FALSE PARA O PERDEDOR E +1WIN PARA O VENCEDOR
		if (Player1 == vencedorDaBatalha) {
			Player1.setQuantVitorias(Player1.getQuantVitorias() + 1);
		} else {
			Player1.setVivo(false);
		}
		if (Player2 == vencedorDaBatalha) {
			Player2.setQuantVitorias(Player2.getQuantVitorias() + 1);
		} else {
			Player2.setVivo(false);
		}
		vencedor(vencedorDaBatalha.getNome());
	}
}