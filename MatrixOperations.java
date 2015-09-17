package data;

public class MatrixOperations {
	
	public static Matrix addMatricies(Matrix a, Matrix b) {
		Matrix result = new Matrix(a.getRows(), a.getCols());
		if (a.getRows() == b.getRows() && a.getCols() == b.getCols()) {
			int rows = a.getRows();
			int cols = a.getCols();
									
			for (int r = 0; r < rows; r++) {
				for (int c = 0; c < cols; c++) {
					double sum = a.getItem(r, c) + b.getItem(r, c);
					result.setItem(r, c, sum);
				}
			}
		} else {
			System.out.println("This operation is undefined!");
			return null;
		}
		return result;
	}
	
	public static Matrix multiplyMatricies(Matrix a, Matrix b) {
		Matrix result = new Matrix(a.getRows(), b.getCols());
		
		if (a.getCols() != b.getRows()) {
			System.out.println("This operation is undefined!");
			return null;
		} else {
		
			int index = a.getCols();
			int sum = 0;
		
			for (int r = 0; r < result.getRows(); r++) {
				for (int c = 0; c < result.getCols(); c++) {
					sum = 0;
					for (int i = 0; i < index; i++) {
						sum += a.getItem(r, i) * b.getItem(i, c);
					}
					result.setItem(r, c, sum);
				}
			}
		}
		return result;
	}
	
	public static Matrix rref(Matrix a) {
		return null;
	}
	
	public static Matrix inverse(Matrix a) {
		return null;
	}
	
	
}