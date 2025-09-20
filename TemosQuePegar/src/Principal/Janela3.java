package Principal;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import Pokemons.MeuPokemon;

public class Janela3{

	private JFrame janela3;

	public void setarJanela3() {
		//CONFIGURAÇÕES JANELA POKEDEX
		layoutJanela3();//LAYOUT DA TELA
		iconPokemons();//MOSTRA OS BOTOES DOS POKEMONS NA TELA
		botaoVoltar();//BOTAO PARA VOLTAR PARA O MENU
		imagemTelaPokedex();//IMAGEM DA POKEDEX
	}
	private void layoutJanela3(){//CONFIG JANELA3
		janela3 = new JFrame();
		janela3.setBounds(100, 100, 450, 300);
		janela3.setSize(980, 573);
		janela3.getContentPane().setLayout(null);
		janela3.setResizable(false);
		janela3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		janela3.setLocationRelativeTo(null);
		janela3.setUndecorated(true);
		janela3.setVisible(true);
	}
	private void imagemTelaPokedex(){//IMAGEM DA POKEDEX
		JLabel telaPokedex = new JLabel();
		telaPokedex.setHorizontalAlignment(SwingConstants.CENTER);
		telaPokedex.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\TELAPOKEDEX2.png"));
		telaPokedex.setBounds(0, 0, 980, 573);
		janela3.getContentPane().add(telaPokedex);
	}
	private void botaoVoltar(){//BOTAO VOLTAR PARA O MENU
		JLabel botaoBack = new JLabel();
		botaoBack.setHorizontalAlignment(SwingConstants.CENTER);
		botaoBack.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\BACK (2).png"));
		botaoBack.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				botaoBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent e) {
				botaoBack.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		botaoBack.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//FECHA A JANELA
				janela3.dispose();
				//ABRE UMA NOVA JANELA
				Janela1 menuDoJogo = new Janela1();
				menuDoJogo.setarJanela1();
			}
		});
		botaoBack.setBounds(419, 484, 142, 52);
		janela3.getContentPane().add(botaoBack);
	}
	private void iconPokemons(){//BOTOES COM OS ICONES DOS POKEMONS
		JLabel iconZapdos = new JLabel();
		iconZapdos.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\ICONZAPDOS.png"));
		iconZapdos.setHorizontalAlignment(SwingConstants.CENTER);
		iconZapdos.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				iconZapdos.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent e) {
				iconZapdos.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		iconZapdos.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//ATRIBUI O VALOR DA LISTA A O OBJETO DA CLASSE MEU POKEMON
				MeuPokemon zapdos = ConfigListBatalha.listaPokemons.get(6);
				janela3.dispose();

				janelaPokedex pokedex = new janelaPokedex();
				if (zapdos != null) {
					pokedex.setMeuPokemon(zapdos);
					pokedex.setarMiniJanela();
				} else {
					System.err.println("Objeto é null.");
				}
			}
		});
		iconZapdos.setBounds(824, 428, 72, 69);
		janela3.getContentPane().add(iconZapdos);

		JLabel iconMachamp = new JLabel();
		iconMachamp.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\ICONMACHAMP.png"));
		iconMachamp.setHorizontalAlignment(SwingConstants.CENTER);
		iconMachamp.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				iconMachamp.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent e) {
				iconMachamp.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		iconMachamp.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MeuPokemon machamp = ConfigListBatalha.listaPokemons.get(3);
				janela3.dispose();

				janelaPokedex pokedex = new janelaPokedex();
				if (machamp != null) {
					pokedex.setMeuPokemon(machamp);
					pokedex.setarMiniJanela();
				} else {
					System.err.println("Objeto é null.");
				}
			}
		});
		iconMachamp.setBounds(79, 420, 72, 77);
		janela3.getContentPane().add(iconMachamp);

		JLabel iconCharmander = new JLabel();
		iconCharmander.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\ICONCHARMANDER.png"));
		iconCharmander.setHorizontalAlignment(SwingConstants.CENTER);
		iconCharmander.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				iconCharmander.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent e) {
				iconCharmander.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		iconCharmander.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MeuPokemon charmander = ConfigListBatalha.listaPokemons.get(0);
				janela3.dispose();

				janelaPokedex pokedex = new janelaPokedex();
				if (charmander != null) {
					pokedex.setMeuPokemon(charmander);
					pokedex.setarMiniJanela();
				} else {
					System.err.println("Objeto é null.");
				}
			}
		});
		iconCharmander.setBounds(79, 163, 64, 69);
		janela3.getContentPane().add(iconCharmander);

		JLabel iconGreninja = new JLabel();
		iconGreninja.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\ICONGRENINJA.png"));
		iconGreninja.setHorizontalAlignment(SwingConstants.CENTER);
		iconGreninja.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				iconGreninja.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent e) {
				iconGreninja.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		iconGreninja.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MeuPokemon greninja = ConfigListBatalha.listaPokemons.get(4);
				janela3.dispose();

				janelaPokedex pokedex = new janelaPokedex();
				if (greninja != null) {
					pokedex.setMeuPokemon(greninja);
					pokedex.setarMiniJanela();
				} else {
					System.err.println("Objeto é null.");
				}
			}
		});
		iconGreninja.setBounds(79, 243, 72, 69);
		janela3.getContentPane().add(iconGreninja);

		JLabel iconBanette = new JLabel();
		iconBanette.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\ICONBANETTE.png"));
		iconBanette.setHorizontalAlignment(SwingConstants.CENTER);
		iconBanette.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				iconBanette.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent e) {
				iconBanette.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		iconBanette.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MeuPokemon banette = ConfigListBatalha.listaPokemons.get(8);
				janela3.dispose();

				janelaPokedex pokedex = new janelaPokedex();
				if (banette != null) {
					pokedex.setMeuPokemon(banette);
					pokedex.setarMiniJanela();
				} else {
					System.err.println("Objeto é null.");
				}
			}
		});
		iconBanette.setBounds(79, 330, 72, 77);
		janela3.getContentPane().add(iconBanette);

		JLabel iconPikachu = new JLabel();
		iconPikachu.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\ICONPIKACHU1.png"));
		iconPikachu.setHorizontalAlignment(SwingConstants.CENTER);
		iconPikachu.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				iconPikachu.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent e) {
				iconPikachu.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		iconPikachu.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MeuPokemon pikachu = ConfigListBatalha.listaPokemons.get(2);
				janela3.dispose();

				janelaPokedex pokedex = new janelaPokedex();
				if (pikachu != null) {
					pokedex.setMeuPokemon(pikachu);
					pokedex.setarMiniJanela();
				} else {
					System.err.println("Objeto é null.");
				}
			}
		});
		iconPikachu.setBounds(84, 75, 72, 77);
		janela3.getContentPane().add(iconPikachu);

		JLabel iconMagikarp = new JLabel();
		iconMagikarp.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\ICONMAGIKARP.png"));
		iconMagikarp.setHorizontalAlignment(SwingConstants.CENTER);
		iconMagikarp.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				iconMagikarp.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent e) {
				iconMagikarp.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		iconMagikarp.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MeuPokemon magikarp = ConfigListBatalha.listaPokemons.get(5);
				janela3.dispose();

				janelaPokedex pokedex = new janelaPokedex();
				if (magikarp != null) {
					pokedex.setMeuPokemon(magikarp);
					pokedex.setarMiniJanela();
				} else {
					System.err.println("Objeto é null.");
				}
			}
		});
		iconMagikarp.setBounds(832, 341, 64, 69);
		janela3.getContentPane().add(iconMagikarp);

		JLabel iconFlusao = new JLabel();
		iconFlusao.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\ICONFLUSAO.png"));
		iconFlusao.setHorizontalAlignment(SwingConstants.CENTER);
		iconFlusao.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				iconFlusao.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent e) {
				iconFlusao.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		iconFlusao.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MeuPokemon flusao = ConfigListBatalha.listaPokemons.get(9);
				janela3.dispose();

				janelaPokedex pokedex = new janelaPokedex();
				if (flusao != null) {
					pokedex.setMeuPokemon(flusao);
					pokedex.setarMiniJanela();
				} else {
					System.err.println("Objeto é null.");
				}
			}
		});
		iconFlusao.setBounds(822, 261, 72, 69);
		janela3.getContentPane().add(iconFlusao);

		JLabel iconPidgeotto = new JLabel();
		iconPidgeotto.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\ICONPIDGEOTTO.png"));
		iconPidgeotto.setHorizontalAlignment(SwingConstants.CENTER);
		iconPidgeotto.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				iconPidgeotto.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent e) {
				iconPidgeotto.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		iconPidgeotto.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MeuPokemon pidgeotto = ConfigListBatalha.listaPokemons.get(7);
				janela3.dispose();

				janelaPokedex pokedex = new janelaPokedex();
				if (pidgeotto != null) {
					pokedex.setMeuPokemon(pidgeotto);
					pokedex.setarMiniJanela();
				} else {
					System.err.println("Objeto é null.");
				}
			}
		});
		iconPidgeotto.setBounds(812, 157, 83, 88);
		janela3.getContentPane().add(iconPidgeotto);

		JLabel iconKadabra = new JLabel();
		iconKadabra.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\ICONKADABRA.png"));
		iconKadabra.setHorizontalAlignment(SwingConstants.CENTER);
		iconKadabra.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				iconKadabra.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent e) {
				iconKadabra.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		iconKadabra.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MeuPokemon kadabra = ConfigListBatalha.listaPokemons.get(1);
				janela3.dispose();

				janelaPokedex pokedex = new janelaPokedex();
				if (kadabra != null) {
					pokedex.setMeuPokemon(kadabra);
					pokedex.setarMiniJanela();
				} else {
					System.err.println("Objeto é null.");
				}
			}
		});
		iconKadabra.setBounds(823, 75, 72, 77);
		janela3.getContentPane().add(iconKadabra);
	}
}