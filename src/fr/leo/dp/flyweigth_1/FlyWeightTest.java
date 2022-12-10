package fr.leo.dp.flyweigth_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlyWeightTest extends JFrame {

	private static final long serialVersionUID = 1L;

	JButton startDrawing;
	int windowWidth = 500;
	int windowHeight = 500;
	Color[] shapeColor = { Color.orange, Color.red, Color.yellow, Color.blue, Color.pink, Color.cyan, Color.magenta,
			Color.black, Color.gray };

	public FlyWeightTest() {
		this.setSize(windowWidth, windowHeight);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("FlyWeightTest");

		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());

		final JPanel drawingPanel = new JPanel();
		contentPane.add(drawingPanel, BorderLayout.CENTER);

		startDrawing = new JButton("Draw Something");
		contentPane.add(startDrawing, BorderLayout.SOUTH);
		startDrawing.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Graphics g = drawingPanel.getGraphics();
				long startTime = System.currentTimeMillis();
				for (int i = 0; i < 100000; i++) {

					// 1
					// g.setColor(getRandomColor());
					// Thread.sleep(100);
					// g.fillOval(getRandomPosX(), getRandomPosY(),
					// getRandomPosX(), getRandomPosY());

					// 2
					MyRect rect = new MyRect(getRandomColor(), getRandomPosX(), getRandomPosY(), getRandomPosX(),
							getRandomPosY());
					rect.draw(g);

					// 3
					// MyRect rect = RectFactory.getRect(getRandomColor());
					// rect.draw(g, getRandomPosX(), getRandomPosY(),
					// getRandomPosX(), getRandomPosY());
				}
				long endTime = System.currentTimeMillis();
				System.out.println("That took: " + (endTime - startTime));
			}
		});


		this.add(contentPane);
		this.setVisible(true);
	}

	private int getRandomPosY() {
		return (int) (((Math.random() * windowHeight) / 2));
	}

	private int getRandomPosX() {
		return (int) (((Math.random() * windowWidth) / 2));
	}

	private Color getRandomColor() {
		Random numberGenerator = new Random();
		int randInt = numberGenerator.nextInt(9);
		return shapeColor[randInt];
	}

	public static void main(String[] args) {
		new FlyWeightTest();
	}
}
