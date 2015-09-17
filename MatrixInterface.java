package data;

public class MatrixInterface {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		Matrix m = new Matrix(3, 2);
		Matrix n = new Matrix(2, 2);
		double[] mArray = {4,-3,-3,5,0,1};
		double[] nArray = {1,4,3,-2};
		
		m.arrayToMatrix(mArray);
		n.arrayToMatrix(nArray);
		
		System.out.println(MatrixOperations.addMatricies(m, n));
		System.out.println(MatrixOperations.multiplyMatricies(m, n));
	}
}