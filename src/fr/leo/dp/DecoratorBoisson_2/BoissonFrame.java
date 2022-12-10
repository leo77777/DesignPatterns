package fr.leo.dp.DecoratorBoisson_2;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.leo.dp.DecoratorBoisson.Boisson;
import fr.leo.dp.DecoratorBoisson.Chantilly;
import fr.leo.dp.DecoratorBoisson.Chocolat;
import fr.leo.dp.DecoratorBoisson.Deca;
import fr.leo.dp.DecoratorBoisson.Espresso;
import fr.leo.dp.DecoratorBoisson.Lait;
import fr.leo.dp.DecoratorBoisson.Sumatra;
public class BoissonFrame extends JFrame {
	private static final long serialVersionUID = 3991497217028737341L;
	
	private JButton jButtonEspresso = new JButton("Espresso");
	private JButton jButtonDecca = new JButton("Deca");
	private JButton jButtonSumatra = new JButton("Sumatra");	
	private JButton jButtonIngredientLait = new JButton("Lait");
	private JButton jButtonIngredientChocolat = new JButton("Chocolat");
	private  JButton jButtonIngredientChantilly = new JButton("Chantilly");	
	private JLabel JLabelDescrition = new JLabel("Description: ");
	private JLabel JLabelCout = new JLabel("Cout: ");
	private Boisson boisson = new Espresso();	
	
	public BoissonFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());		
		this.setSize(500,200);
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setLayout(new FlowLayout());
		jPanel1.add(jButtonEspresso);
		jPanel1.add(jButtonDecca);
		jPanel1.add(jButtonSumatra);
		JPanel jPanel2 = new JPanel();
		jPanel2.setLayout(new FlowLayout());		
		jPanel2.add(jButtonIngredientChocolat);
		jPanel2.add(jButtonIngredientLait);
		jPanel2.add(jButtonIngredientChantilly);
;
		
		JPanel jpc = new JPanel();
		jpc.setLayout(new GridLayout(3, 1));
		jpc.add(jPanel1);
		jpc.add(jPanel2);
		this.add(jpc, BorderLayout.NORTH);
		
		JPanel jpCentre = new JPanel();
		jpCentre.setLayout(new FlowLayout());
		jpCentre.add(JLabelDescrition);
		jpCentre.add(JLabelCout);
		this.add(jpCentre, BorderLayout.CENTER);	
		
		this.setVisible(true);
		
		jButtonEspresso.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				boisson = new Espresso();
				display();
			}
		});
		jButtonDecca.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				boisson = new Deca();
				display();
			}
		});
		jButtonSumatra.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				boisson = new Sumatra();
				display();
			}
		});
		
		jButtonIngredientChocolat.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				boisson = new Chocolat(boisson);
				display();
			}
		});
		jButtonIngredientLait.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				boisson = new Lait(boisson);
				display();
			}
		});
		jButtonIngredientChantilly.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				boisson = new Chantilly(boisson);
				display();
			}
		});
	}
	
	public static void main(String[] args) {
		new BoissonFrame();
	}

	protected void display() {
		JLabelDescrition.setText(boisson.getDescription());
		JLabelCout.setText(""+ boisson.cout());
	}
}
