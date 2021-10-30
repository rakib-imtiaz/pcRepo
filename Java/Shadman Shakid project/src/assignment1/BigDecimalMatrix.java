package assignment1;

import java.math.BigDecimal;
import java.util.Arrays;

public class BigDecimalMatrix {
	private int numberOfRows;
	private int numberOfColumns;
	private BigDecimal[][] matrix;

	public BigDecimalMatrix(int numberOfRows, int numberOfColumns, BigDecimal[][] matrix) {
		super();
		this.numberOfRows = numberOfRows;
		this.numberOfColumns = numberOfColumns;
		this.matrix = matrix;
		this.matrix = new BigDecimal[numberOfRows][numberOfColumns];

	}

	public BigDecimalMatrix(BigDecimal[][] matrix) {

		this.numberOfRows = matrix.length;
		this.numberOfColumns = matrix[0].length;

		this.matrix = new BigDecimal[numberOfRows][numberOfColumns];

		this.matrix = matrix;

	}

	public int getNumberOfRows() {
		return numberOfRows;
	}

	public int getNumberOfColumns() {
		return numberOfColumns;
	}

	public BigDecimal[][] getMatrix() {

		return matrix;
	}

	public BigDecimalMatrix add(BigDecimalMatrix matrix) {
		BigDecimal[][] bigsum = new BigDecimal[numberOfRows][numberOfColumns];

		for (int i = 0; i < numberOfRows; i++) {

			for (int j = 0; j < numberOfColumns; j++) {

				bigsum[i][j] = this.matrix[i][j].add(matrix.matrix[i][j]);
			}

		}

		BigDecimalMatrix obj = new BigDecimalMatrix(bigsum);

		return obj;

	}

	public BigDecimalMatrix subtract(BigDecimalMatrix matrix) {
		BigDecimal[][] bigsum = new BigDecimal[numberOfRows][numberOfColumns];

		for (int i = 0; i < numberOfRows; i++) {

			for (int j = 0; j < numberOfColumns; j++) {

				bigsum[i][j] = this.matrix[i][j].subtract(matrix.matrix[i][j]);
			}

		}

		BigDecimalMatrix obj = new BigDecimalMatrix(bigsum);

		return obj;

	}

	public BigDecimalMatrix multiply(int number) {

		BigDecimal[][] bigsum = new BigDecimal[numberOfRows][numberOfColumns];

		for (int i = 0; i < numberOfRows; i++) {

			for (int j = 0; j < numberOfColumns; j++) {

				bigsum[i][j] = this.matrix[i][j].multiply(new BigDecimal(number));
			}

		}

		BigDecimalMatrix obj = new BigDecimalMatrix(bigsum);

		return obj;

	}

	public BigDecimalMatrix divide(int number) {
		BigDecimal[][] bigsum = new BigDecimal[numberOfRows][numberOfColumns];

		for (int i = 0; i < numberOfRows; i++) {

			for (int j = 0; j < numberOfColumns; j++) {

				bigsum[i][j] = this.matrix[i][j].divide(new BigDecimal(number));
			}

		}

		BigDecimalMatrix obj = new BigDecimalMatrix(bigsum);

		return obj;

	}

	public BigDecimalMatrix pow(int number) {

		BigDecimal[][] bigsum = new BigDecimal[numberOfRows][numberOfColumns];

		for (int i = 0; i < numberOfRows; i++) {

			for (int j = 0; j < numberOfColumns; j++) {

				bigsum[i][j] = this.matrix[i][j].pow(number);
			}

		}

		BigDecimalMatrix obj = new BigDecimalMatrix(bigsum);

		return obj;

	}

	public BigDecimal primaryDigonal(BigDecimalMatrix matrix) {

		BigDecimal bigsum=BigDecimal.ZERO; 

		for (int i = 0; i < numberOfRows; i++) {

			for (int j = 0; j < numberOfColumns; j++) {
				if (i == j)
					bigsum = bigsum.add(this.matrix[i][j].add(matrix.matrix[i][j]));
			}

		}


		return bigsum;

	}

	public BigDecimal secondaryDigonal(BigDecimalMatrix matrix) {

		BigDecimal bigsum=BigDecimal.ZERO; 

		for (int i = 0; i < numberOfRows; i++) {

			for (int j = 0; j < numberOfColumns; j++) {
				if ((i + j) == (numberOfRows - 1))
					bigsum = bigsum.add(this.matrix[i][j].add(matrix.matrix[i][j]));
			}

		}


		return bigsum;

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < this.getNumberOfRows() ; i++) {

			for (int j = 0; j < this.getNumberOfColumns() ; j++) {

				builder.append(matrix[i][j] + " ");
			}
			builder.append("\n");

		}

		String output = new String(builder);
		return output;
	}

}
