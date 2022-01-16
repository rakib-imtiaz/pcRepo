import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class TicTacToeGame extends JPanel implements MouseListener, ActionListener {
	private Button resetButton; // reset button
	private Player player1, player2; // the players
	private Box[][] boxes; // the boxes that the Board is made up of
	private char turn; // the symbol of the player who goes next
	private boolean gameOver; // if the game has ended
	private String winner;
	private int numDraws; // the number of draws
	static JFrame frame;

	public TicTacToeGame() {
		setLayout(null);

		resetButton = new Button("RESET");
		resetButton.setBounds(0, 300, 75, 30);
		resetButton.setActionCommand("Reset");
		add(resetButton);

		resetButton.addActionListener(this);
		gameOver = false;
		winner = "";

		// create the players

		String player1Name = JOptionPane.showInputDialog(null, "Player 1 Name : ");
		String player1sign = JOptionPane.showInputDialog(null, "x or o ? ", "x");

		String player2Name = JOptionPane.showInputDialog(null, "Player 2 Name : ", "Your name");
		String player2sign = JOptionPane.showInputDialog(null, "x or o ? ", "o");

		char sign1[] = player1sign.toCharArray();
		char sign2[] = player2sign.toCharArray();
		player1 = new Player(sign1[0], player1Name);
		player2 = new Player(sign2[0], player2Name);

		// create the 2 dimensional grid of boxes
		boxes = new Box[3][3];
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				boxes[r][c] = new Box();
			}
		}

		// decide who goes first
		if (Math.random() > .5) {
			turn = player1.getSymbol();
		} else {
			turn = player2.getSymbol();
		}

	}

	////////////////////////////////////////////////////
	// Title: reset
	// Input: nothing
	// Returns: nothing
	// Does: Clears the board and sets it up for a new game

	public void reset() {

		// set gameover false

		for (int r = 0; r < 3; r++) {

			for (int c = 0; c < 3; c++) {
				boxes[r][c].erase();
			}
		}
		gameOver = false;
		repaint();
		winner = " ";

		// erase each box

	}

	////////////////////////////////////////////////////
	// Title: Play
	// Input: coordinates of where the player pressed the button
	// Returns: nothing
	// Does: Finds which box if any the mouse was clicked on
	// Sets that box if it is empty
	// Checks whether anyone won

	public void play(int x, int y) {

		if (gameOver) {
			return;
		}

		// convert x & y value to row and column value
		int row = 0, col = 0;

		if (x > 0 && x < 100) {
			col = 0;
		} else if (x > 100 && x < 200) {
			col = 1;
		} else if (x > 200 && x < 300) {
			col = 2;
		}

		if (y > 0 && y < 100) {
			row = 0;
		}
		if (y > 100 && y < 200) {
			row = 1;
		}

		if (y > 200 && y < 300) {
			row = 2;
		}

		// fill in corresponding box

		if (turn == player1.getSymbol()) {
			boxes[row][col].fillIn(player1.getSymbol());
			turn = player2.getSymbol();
		} else {
			boxes[row][col].fillIn(player2.getSymbol());
			turn = player1.getSymbol();
		}

		// call all the check win methods below
		checkRowWin();
		checkColWin();
		checkDiagWin();
		checkDraw();

		repaint();
	}

	////////////////////////////////////////////////////
	// Title: checkRowWin
	// Input: nothing
	// Returns: Whether someone won in a row
	// Does: Checks whether 3 of the same symbol is lined up in a row
	// Increments the player's wins if someone won
	// Ends the game and returns whether someone won

	public boolean checkRowWin() {

		if (!boxes[0][0].isEmpty() && boxes[0][0].getSymbol() == boxes[0][1].getSymbol()
				&& boxes[0][1].getSymbol() == boxes[0][2].getSymbol()) {

			if (boxes[0][0].getSymbol() == player1.getSymbol())

			{
				player1.addWin();
				winner = player1.getName();
			} else {
				player2.addWin();
				winner = player2.getName();
			}
			gameOver = true;
		} else if (!boxes[1][0].isEmpty() && boxes[01][0].getSymbol() == boxes[1][1].getSymbol()
				&& boxes[1][1].getSymbol() == boxes[1][2].getSymbol()) {

			if (boxes[1][0].getSymbol() == player1.getSymbol())

			{
				player1.addWin();
				winner = player1.getName();
			} else {
				player2.addWin();
				winner = player2.getName();
			}
			gameOver = true;
		}

		else if (!boxes[2][0].isEmpty() && boxes[2][0].getSymbol() == boxes[2][1].getSymbol()
				&& boxes[2][1].getSymbol() == boxes[2][2].getSymbol()) {

			if (boxes[2][0].getSymbol() == player1.getSymbol())

			{
				player1.addWin();
				winner = player1.getName();
			} else {
				player2.addWin();
				winner = player2.getName();
			}
			gameOver = true;
		}

		return false;

	}

	////////////////////////////////////////////////////
	// Title: checkColWin
	// Input: nothing
	// Returns: Whether someone won in a column
	// Does: Checks whether 3 of the same symbol is lined up in a column
	// Increments the player's wins if someone won
	// Ends the game and returns whether someone won
	public boolean checkColWin() {

		if (!boxes[0][0].isEmpty() && boxes[0][0].getSymbol() == boxes[1][0].getSymbol()
				&& boxes[1][0].getSymbol() == boxes[2][0].getSymbol()) {

			if (boxes[0][0].getSymbol() == player1.getSymbol())

			{
				player1.addWin();
				winner = player1.getName();
			} else {
				player2.addWin();
				winner = player2.getName();
			}
			gameOver = true;
		} else if (!boxes[0][1].isEmpty() && boxes[0][1].getSymbol() == boxes[1][1].getSymbol()
				&& boxes[1][1].getSymbol() == boxes[2][1].getSymbol()) {

			if (boxes[0][1].getSymbol() == player1.getSymbol())

			{
				player1.addWin();
				winner = player1.getName();
			} else {
				player2.addWin();
				winner = player2.getName();
			}
			gameOver = true;
		}

		else if (!boxes[0][2].isEmpty() && boxes[0][2].getSymbol() == boxes[1][2].getSymbol()
				&& boxes[1][2].getSymbol() == boxes[2][2].getSymbol()) {

			if (boxes[0][2].getSymbol() == player1.getSymbol())

			{
				player1.addWin();
				winner = player1.getName();
			} else {
				player2.addWin();
				winner = player2.getName();
			}
			gameOver = true;
		}

		return false;

	}

	////////////////////////////////////////////////////
	// Title: checkDiagWin
	// Input: nothing
	// Returns: Whether someone won in a diagnal
	// Does: Checks whether 3 of the same symbol is lined up in a diagnal
	// Increments the player's wins if someone won
	// Ends the game and returns whether someone won
	public boolean checkDiagWin() {

		if (!boxes[0][0].isEmpty() && boxes[0][0].getSymbol() == boxes[1][1].getSymbol()
				&& boxes[1][1].getSymbol() == boxes[2][2].getSymbol()) {

			if (boxes[0][0].getSymbol() == player1.getSymbol())

			{
				player1.addWin();
				winner = player1.getName();
			} else {
				player2.addWin();
				winner = player2.getName();
			}
			gameOver = true;
		} else if (!boxes[0][2].isEmpty() && boxes[0][2].getSymbol() == boxes[1][1].getSymbol()
				&& boxes[1][1].getSymbol() == boxes[2][0].getSymbol()) {

			if (boxes[0][2].getSymbol() == player1.getSymbol())

			{
				player1.addWin();
				winner = player1.getName();
			} else {
				player2.addWin();
				winner = player2.getName();
			}
			gameOver = true;
		}

		return false;

	}

	////////////////////////////////////////////////////
	// Title: checkDraw
	// Input: nothing
	// Returns: whether the game is a draw
	// Does: Looks for whether there are any spaces left to play
	// Ends the game and increments draw if there is one
	// And returns wether the game is a draw
	public boolean checkDraw() {
		boolean draw = true;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (boxes[i][j].isEmpty()) {
					draw = false;
					break;
				} else {
					continue;
				}

			}

		}

		if (draw) {
			numDraws++;

			gameOver = true;
			winner = "NO WINNER";

		}

		return false;

	}

	// Ignore the code after this point
	////////////////////////////////////////////////////
	// Title: paint
	// Input: Graphics object
	// Returns: nothing
	// Does: Paints the board to the screen

	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 600, 600);
		g.setColor(Color.YELLOW);
		g.fillRect(0, 300, 600, 600);
		g.setColor(Color.BLACK);
		((Graphics2D) g).setStroke(new BasicStroke(4));
		g.drawLine(100, 0, 100, 300);
		g.drawLine(200, 0, 200, 300);
		g.drawLine(0, 100, 300, 100);
		g.drawLine(0, 200, 300, 200);

		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				Box next = boxes[r][c];

				int x = c * 100 + 10;
				int y = r * 100 + 10;

				if (!next.isEmpty()) {
					if (next.getSymbol() == 'x') {
						g.drawLine(x, y, x + 80, y + 80);
						g.drawLine(x + 80, y, x, y + 80);
					} else if (next.getSymbol() == 'o') {
						g.drawOval(x, y, 80, 80);
					}
				}

			}
		}

		String gameStatus;
		if (!gameOver) {
			gameStatus = "Game In Progress";
		}

		else {
			gameStatus = "Game Ended - Result: " + winner;
		}
		String tally1 = "Player 1 Wins (" + player1.getName() + "): " + player1.getWins();
		String tally2 = "Player 2 Wins (" + player2.getName() + "): " + player2.getWins();

		String draw = "Draw  : " + numDraws;
		String currentTurn = "Current Turn: " + turn;

		g.drawString(gameStatus, 100, 315);
		g.drawString(tally1, 100, 330);
		g.drawString(tally2, 100, 345);
		g.drawString(currentTurn, 100, 360);
		g.drawString(draw, 100, 380);

	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
		int x = e.getX() - 4;
		int y = e.getY() - 30;
		System.out.println("X: " + x + '\t' + "Y: " + y);
		if (x < 300 && y < 300) {
			play(x, y);
		}
	}

	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();

		if ("Reset".equals(command)) {
			reset();
		}
	}

	static void initalise() {
		frame = new JFrame("Tic Tac Toe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		// frame.setSize(318, 430);
		frame.setLocation(0, 0);
		frame.setBounds(525, 170, 318, 430);

		TicTacToeGame board = new TicTacToeGame();
		frame.addMouseListener(board);
		frame.getContentPane().add(board);
		frame.setVisible(true);
	}

	public static void main(String[] arg) {
		initalise();

	}

}
