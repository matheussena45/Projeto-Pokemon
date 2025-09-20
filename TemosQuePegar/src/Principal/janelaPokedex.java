package Principal;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import Pokemons.MeuPokemon;

public class janelaPokedex{

	private JFrame miniJanela;
	private MeuPokemon meuPokemon;

	public void setarMiniJanela(){
		layoutMiniJanela();//CONFIGURA O LAYOUT DA TELA
		botaoPokedex();//BOTAO PARA FECHAR A MINIPOKEDEX
		mostrarAtributos(meuPokemon);//METODO PARA MOSTRAR OS ATRIBUTOS DOS POKEMONS
		imagemPokedex();//IMAGEM DA MINIPOKEDEX
	}
	private void layoutMiniJanela(){
		miniJanela = new JFrame();
		miniJanela.setBounds(100, 100, 450, 300);
		miniJanela.getContentPane().setBackground(new Color(0, 0, 0));
		miniJanela.setSize(554, 450);
		miniJanela.getContentPane().setLayout(null);
		miniJanela.setResizable(false);
		miniJanela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		miniJanela.setLocationRelativeTo(null);
		miniJanela.setUndecorated(true);
		miniJanela.setVisible(true);
	}
	private void imagemPokedex(){
		JLabel imagemPokedex = new JLabel();
		imagemPokedex.setHorizontalAlignment(SwingConstants.CENTER);
		imagemPokedex.setIcon(new ImageIcon("D:\\Biblioteca\\IMAGENS DO PROJETO\\POKEDEX (1).png"));
		imagemPokedex.setBounds(0, 0, 554, 450);
		miniJanela.getContentPane().add(imagemPokedex);
	}
	private void botaoPokedex(){//VOLTA PARA A JANELA 3
		JLabel botaoPokedex = new JLabel("BACK");
		botaoPokedex.setFont(new Font("Cooper Black", Font.PLAIN, 15));
		botaoPokedex.setHorizontalAlignment(SwingConstants.CENTER);
		botaoPokedex.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				botaoPokedex.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent e) {
				botaoPokedex.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		botaoPokedex.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				//FECHA A JANELA DA MINIPOKEDEX
				miniJanela.dispose();
				Janela3 janela3 = new Janela3();
				janela3.setarJanela3();
			}
		});
		botaoPokedex.setBounds(72, 372, 66, 29);
		miniJanela.getContentPane().add(botaoPokedex);
	}
	public void setMeuPokemon(MeuPokemon meuPokemon) {
		this.meuPokemon = meuPokemon;
	}
	private void mostrarAtributos(MeuPokemon infoDoPokemon) {
		JTextArea infoPokemon = new JTextArea();
		infoPokemon.setLineWrap(true);
		infoPokemon.setWrapStyleWord(true);
		infoPokemon.setForeground(Color.YELLOW);
		infoPokemon.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 9));
		infoPokemon.setText(
				"Nome: " + infoDoPokemon.getNome() + "\n" +
						"Ataque: " + infoDoPokemon.getAtaque() + "\n" +
						"Defesa: " + infoDoPokemon.getDefesa() + "\n" +
						"Altura: " + infoDoPokemon.getAltura() + "m\n" +
						"Peso: " + infoDoPokemon.getPeso() + "kg\n" +
						"Vivo: " + infoDoPokemon.isVivo() + "\n" +
						"Vitórias: " + infoDoPokemon.getQuantVitorias() + "\n"
		);
		infoPokemon.setBounds(96, 150, 170, 100);
		infoPokemon.setEditable(false);

		// Deixar transparente
		infoPokemon.setOpaque(false);
		infoPokemon.setBackground(new Color(0, 0, 0, 0));

		miniJanela.getContentPane().add(infoPokemon);
	}
}