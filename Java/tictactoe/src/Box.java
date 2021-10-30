import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Box {
	private boolean empty;
	private char symbol;

	public Box() 
	{
		empty = true;
		symbol = '_';

	}

	public boolean isEmpty() {
		return empty;
	}

	public char getSymbol() {
		return symbol;
	}

	public void fillIn(char aSymbol) {
		symbol = aSymbol;
		empty = false;
	}

	public void erase() {
		empty = true;
		symbol = '_';
	}

}
