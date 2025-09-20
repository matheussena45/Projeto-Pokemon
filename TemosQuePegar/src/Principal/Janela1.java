package Principal;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import Pokemons.MeuPokemon;

public class Janela1 {

	private JFrame janela1;

	public void setarJanela1(){
		layoutJanela1();//CONFIG DA JANELA
		LogoPokemon();//CONFIG LOGO POKEMON
		botaoPlay();//CONFIG BOTAO PLAY
		botaoLoadGame();//CONFIG CARREGAR JOGO
		botaoSaveGame();//CONFIG SALVAR GAME
		botaoPokedex();//CONFIG BOTAO LISTA
		botaoExit();//CONFIG BOTAO EXIT
		imagemDeFundo();//IMAGEM DE FUNDO DO MENU
	}
	private void layoutJanela1(){
		janela1 = new JFrame();
		janela1.setBounds(100, 100, 450, 300);
		janela1.setSize(1000, 600);
		janela1.getContentPane().setLayout(null);
		janela1.setResizable(false);
		janela1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		janela1.setLocationRelativeTo(null);
		janela1.setUndecorated(true);
	}
	private void LogoPokemon(){
		JLabel logo = new JLabel();
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\LOGOPOKEMON.png"));
		logo.setBounds(238, 11, 509, 196);
		janela1.getContentPane().add(logo);
	}
	private void botaoPlay(){
		JLabel botaoJogar = new JLabel();
		botaoJogar.setHorizontalAlignment(SwingConstants.CENTER);
		botaoJogar.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\PLAY.png"));
		botaoJogar.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				botaoJogar.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent e) {
				botaoJogar.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		botaoJogar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//VÊ QUANTOS POKEMONS TEM VIVO NA LISTA
				ArrayList<MeuPokemon> listaPokemons = ConfigListBatalha.listaPokemons;
				int countPokemonsVivos = 0;
				for (Pokemon pokemon : listaPokemons) {
					if (pokemon.isVivo()) {
						countPokemonsVivos++;
					}
				}
				//SE TIVER APENAS 1, A BATALHA NÃO CONTINUA
				if (countPokemonsVivos > 1) {
					janela1.dispose();
					Janela2 janelaDoJogo = new Janela2();
					janelaDoJogo.setarJanela2();
				} else {
					JOptionPane.showMessageDialog(null, "O FLUSÃO É O GRANDE CAMPEÃO DO POKETADS");
					playErrorSound();
				}
			}

			private void playErrorSound() {
				try {
					String path = "D:\\Biblioteca\\Downloads\\HinoDoFlusao.wav";
					File audioFile = new File(path);
					if (!audioFile.exists()) {
						System.err.println("Arquivo de áudio não encontrado: " + path);
						return;
					}
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
					ex.printStackTrace();
				}
			}
		});

		botaoJogar.setBounds(423, 218, 153, 56);
		janela1.getContentPane().add(botaoJogar);
	}
	private void botaoPokedex(){
		JLabel botaoLista = new JLabel();
		botaoLista.setHorizontalAlignment(SwingConstants.CENTER);
		botaoLista.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\MENU.png"));
		botaoLista.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				botaoLista.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent e) {
				botaoLista.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		botaoLista.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//FECHA A JANELA
				janela1.dispose();
				//ABRE UMA NOVA JANELA
				Janela3 pokedex = new Janela3();
				pokedex.setarJanela3();
			}
		});
		botaoLista.setBounds(420,375, 153, 56);
		janela1.getContentPane().add(botaoLista);
	}
	private void botaoExit(){//BOTAO PARA ENCERRAR O JOGO
		JLabel botaoExit = new JLabel();
		botaoExit.setHorizontalAlignment(SwingConstants.CENTER);
		botaoExit.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\EXIT.png"));
		botaoExit.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				botaoExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent e) {
				botaoExit.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		botaoExit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		botaoExit.setBounds(423,430, 139, 56);
		janela1.getContentPane().add(botaoExit);
	}
	private void botaoLoadGame(){//CARREGA O SALVAMENTO DO JOGO
		JLabel botaoloadgame = new JLabel();
		botaoloadgame.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\START (1).png"));
		botaoloadgame.setHorizontalAlignment(SwingConstants.CENTER);
		botaoloadgame.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				botaoloadgame.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent e) {
				botaoloadgame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		botaoloadgame.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					String caminhoArquivo = "D:\\Biblioteca\\IMAGENS DO PROJETO\\salvar_jogo";
					File arquivo = new File(caminhoArquivo);

					if (arquivo.exists()) {
						ArrayList<MeuPokemon> listaCarregada = (ArrayList<MeuPokemon>) salvarArquivo.lerObjeto(caminhoArquivo);

						if (listaCarregada != null) {
							ConfigListBatalha.listaPokemons = listaCarregada;
							JOptionPane.showMessageDialog(null, "Jogo carregado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, "Falha ao carregar o jogo.", "Erro", JOptionPane.ERROR_MESSAGE);
						}
					} else {
						JOptionPane.showMessageDialog(null, "Arquivo não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Falha ao carregar o jogo.", "Erro", JOptionPane.ERROR_MESSAGE);
					e2.printStackTrace();
				}
			}
		});
		botaoloadgame.setBounds(420, 280, 153, 45);
		janela1.getContentPane().add(botaoloadgame);
	}
	private void botaoSaveGame(){//SALVAR O PROGRESSO DO JOGO
		JLabel botaosavegame = new JLabel();
		botaosavegame.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\DOWNLOAD.png"));
		botaosavegame.setHorizontalAlignment(SwingConstants.CENTER);
		botaosavegame.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				botaosavegame.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent e) {
				botaosavegame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		botaosavegame.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				salvarArquivo.escreveObjeto(ConfigListBatalha.listaPokemons, "D:\\Biblioteca\\IMAGENS DO PROJETO\\salvar_jogo");
				JOptionPane.showMessageDialog(null, "Jogo salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		botaosavegame.setBounds(403, 330, 193, 45);
		janela1.getContentPane().add(botaosavegame);
	}
	private void imagemDeFundo(){
		JLabel imagemDeFundoTela1 = new JLabel();
		imagemDeFundoTela1.setVerticalAlignment(SwingConstants.TOP);
		imagemDeFundoTela1.setHorizontalAlignment(SwingConstants.LEFT);
		imagemDeFundoTela1.setBounds(0, 0, 1000, 625);
		imagemDeFundoTela1.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\FUNDODETELA1.jpg"));
		janela1.getContentPane().add(imagemDeFundoTela1);
		janela1.setVisible(true);
	}
}