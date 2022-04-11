package homework.nine;

public class MovablePoint implements Movable {
	private int x;
	private int y;

	public MovablePoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void moveUp() {
		y = y - 1;
	}

	@Override
	public void moveDown() {
		y = y + 1;
	}

	@Override
	public void moveLeft() {
		x = x - 1;
	}

	@Override
	public void moveRight() {
		x = x + 1;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + "]";
	}

}
