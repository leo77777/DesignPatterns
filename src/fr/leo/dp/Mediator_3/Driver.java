package fr.leo.dp.Mediator_3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.leo.dp.Mediator_1.MyJButton;

public class Driver {

	public static void main(String[] args) {
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout());
		
		MediateurImpl2 mediateur1 = new MediateurImpl2();
		CollegueJButtonImpl1 c1 = new CollegueJButtonImpl1("A", mediateur1);
		CollegueJButtonImpl1 c2 = new CollegueJButtonImpl1("B", mediateur1);
		CollegueJButtonImpl1 c3 = new CollegueJButtonImpl1("C", mediateur1);
		CollegueJButtonImpl1 c4 = new CollegueJButtonImpl1("D", mediateur1);

		JTextField texte1 = new JTextField("Quelle couleur ?");
		JTextField texte2 = new JTextField("Voila le texte");
		JButton jb1 = new JButton("Historique");
		
		texte1.setSize(30, 10);
		texte2.setSize(30, 10);
		jb1.setSize(50, 20);
		c1.setSize(50, 20);
		c2.setSize(50, 20);
		c3.setSize(50, 20);
		c4.setSize(50, 20);
		
		c1.setText("Rouge");
		c2.setText("Vert");
		c3.setText("Jaune");
		c4.setText("Bleu");

		jp1.add(c1);
		jp1.add(c2);
		jp1.add(c3);
		jp1.add(c4);
		jp1.add(jb1);
		jp1.add(texte1);
		jp1.add(texte2);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mediateur1.analyserConversation();
			}
		});		
		
		texte1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c1.envoyerMessage(new Message(texte1.getText(), c1, c2, new Date()));
				c1.envoyerMessage(new Message(texte1.getText(), c1, c3, new Date()));
				c1.envoyerMessage(new Message(texte1.getText(), c1, c4, new Date()));
				c1.envoyerMessage(new Message(texte1.getText(), c1, c1, new Date()));
			}
		});

		c1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c1.envoyerMessage(new Message("rouge", c1, c2, new Date()));
				c1.envoyerMessage(new Message("rouge", c1, c3, new Date()));
				c1.envoyerMessage(new Message("rouge", c1, c4, new Date()));
			}
		});

		c2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c2.envoyerMessage(new Message("vert", c2, c1, new Date()));
				c2.envoyerMessage(new Message("vert", c2, c3, new Date()));
				c2.envoyerMessage(new Message("vert", c2, c4, new Date()));
			}
		});

		c3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c3.envoyerMessage(new Message("yellow", c3, c1, new Date()));
				c3.envoyerMessage(new Message("yellow", c3, c2, new Date()));
				c3.envoyerMessage(new Message("yellow", c3, c4, new Date()));
			}
		});
		
		MyJButton jb12 = new MyJButton();
		for (int i = 0; i < 10; i++) {
			jp1.add(jb12.cloner());
		}		
		
		JFrame fenetre = new JFrame();
		fenetre.setLayout(new FlowLayout());
		fenetre.add(jp1, BorderLayout.NORTH);
		fenetre.setSize(1400, 300);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
	}
}
