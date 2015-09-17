package data;

public class Matrix {
	
	private int rows;
	private int cols;
	private double[][] matrix;
	
	public Matrix(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		this.matrix = new double[rows][cols];
		prefillMatrix();
	}
	
	public void prefillMatrix() {
		for (int r = 0; r < this.getRows(); r++) {
			for (int c = 0; c < this.getCols(); c++) {
				this.matrix[r][c] = 0;
			}
		}
	}
	
	public String toString() {
		String lineMatrix = "[";
		for (double[] row : matrix) {
			lineMatrix += "[";
			for (int n = 0; n < row.length; n++) {
				if (n < row.length - 1) {
					lineMatrix += (row[n] + ","); 
				} else {
					lineMatrix += row[n];
				}
			}
			lineMatrix += "]";
		}
		lineMatrix += "]";
		
		return lineMatrix;
	}
	
	public void arrayToMatrix(double[] matrixArray) {
		int index = 0;
		
		if ((this.getCols() * this.getRows()) != matrixArray.length) {
			System.out.println("The dimensions do not match!");
			System.exit(1);
		}
				
		for (int r = 0; r < this.getRows(); r++) {
			for (int c = 0; c < this.getCols(); c++) {
				if (index == matrixArray.length) {
					System.out.println("Index exceeds the array length; there is a problem.");
					System.exit(1);
				}
				this.matrix[r][c] = matrixArray[index];
				index++;
			}
		}
	}

	public int getRows() {
		return rows;
	}

	public int getCols() {
		return cols;
	}
	
	public double getItem(int row, int col) {
		return matrix[row][col];
	}
	
	public void setItem(int row, int col, double num) {
		this.matrix[row][col] = num;
	}
	
}
