package fr.leo.dp.Command_4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Driver {

	public static void main(String[] args) {

		RecepteurImpl1 r21 = new RecepteurImpl1();
		Invocateur i2 = new Invocateur();
		i2.addNewCommand("prem", new CommandA(r21));
		i2.addNewCommand("deus", new CommandB(r21));

		i2.invoquer("prem");
		i2.invoquer("deus");

		System.out.println("***************");

		RecepteurImpl1 recep1 = new RecepteurImpl1();
		RecepteurImpl2 recep2 = new RecepteurImpl2();
		RecepteurImpl3 recep3 = new RecepteurImpl3();

		Command cmd1 = new CommandA(recep1);
		Command cmd2 = new CommandB(recep1);
		Command cmd3 = new CommandC(recep2);
		Command cmdLireFichier = new CommandLireFichier(recep3, "monFichier");
		Command cmdAllumerPhareVoiture = new CommandAllumerPhareVoiture(recep3);

		Invocateur telecommande = new Invocateur();

		telecommande.addNewCommand("A", cmd1);
		telecommande.addNewCommand("B", cmd2);
		telecommande.addNewCommand("C", cmd3);
		telecommande.addNewCommand("LireFichier", cmdLireFichier);
		telecommande.addNewCommand("AllumerPhareVoiure", cmdAllumerPhareVoiture);
		telecommande.addNewCommand("BoutonAllumerPhareVoiure", cmdAllumerPhareVoiture);

		telecommande.invoquer("A");
		telecommande.invoquer("B");
		telecommande.invoquer("C");
		telecommande.invoquer("D"); // telecommande non programmée
		telecommande.invoquer("A");
		telecommande.invoquer("LireFichier");
		telecommande.invoquer("AllumerPhareVoiure");
		telecommande.invoquer("BoutonAllumerPhareVoiure");

		System.out.println("");
		System.out.println("... voici maintenant les commandes de l'interface graphiques");
		System.out.println("");
		
		JButton bouton1 = new JButton("Allumer les phares");
		bouton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				telecommande.invoquer("AllumerPhareVoiure");
			}
		});

		JButton bouton2 = new JButton("LireFichier");
		bouton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				telecommande.invoquer("LireFichier");
			}
		});
		JPanel jp1 = new JPanel();
		jp1.add(bouton1);
		jp1.add(bouton2);
		JFrame fenetre = new JFrame();
		fenetre.setLayout(new FlowLayout());
		fenetre.add(jp1, BorderLayout.NORTH);
		fenetre.setSize(400, 300);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);

	}
}
