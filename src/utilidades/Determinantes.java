package utilidades;

public class Determinantes {

	public static double segundo_orden(int[][] matriz) {
		double res = matriz[0][0]*matriz[1][1] - matriz[1][0]*matriz[0][1];
		return res;
	}
	
}
