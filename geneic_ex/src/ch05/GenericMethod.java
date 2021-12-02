package ch05;

class Point<X, Y> {

	private X x;
	private Y y;

	public Point(X x, Y y) {
		this.x = x;
		this.y = y;
	}

	public X getX() {
		return x;
	}

	public Y getY() {
		return y;
	}

}

public class GenericMethod {

	// 함수만들기 1.
	public static <X, Y> int makeRectangle1(Point<X, Y> p1, Point<X, Y> p2) {

		// 사각형 넓이 구하는 공식 (가로 *세로)
		int left = (Integer) p1.getX();
		int right = (Integer) p2.getX();

		int top = (Integer) p1.getY();
		int bottom = (Integer) p2.getY();

		int width = right - left;
		int height = bottom - top;
		return width * height;
	}

	// 함수 만들기2
	public static <X, Y> double makeRectangle2(Point<X, Y> p1, Point<X, Y> p2) {
		double left = ((Number) p1.getX()).doubleValue();
		double right = ((Number) p2.getX()).doubleValue();
		double top = ((Number) p1.getY()).doubleValue();
		double bottom = ((Number) p2.getY()).doubleValue();
		double width = right - left;
		double height = bottom - top;
		return width * height;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point<Integer, Integer> p1 = new Point<Integer, Integer>(0, 0);
		Point<Integer, Integer> p2 = new Point<>(20, 10);

		int size = makeRectangle1(p1, p2);
		System.out.println("size:" + size);

		System.out.println("==================");

		Point<Integer, Double> p3 = new Point<Integer, Double>(0, 0, 0);
		Point<Integer, Double> p4 = new Point<>(20, 10);

	}

}
