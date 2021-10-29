package somya_sir;

class Rect {
	int l, b;
	Rect(int l, int b) {
		this.l = l;
		this.b = b;
	}
	int area() {
		return l*b;
	}
}

class Box extends Rect {
	int h;
	Box(int l, int b, int h) {
		super(l,b);
		this.h = h;
	}
	int volume() {
		return super.area()*h;
	}
}

public class Q5_Area_Volume {	
	public static void main(String[] args) {
		Rect r = new Rect(10, 20);
		System.out.println(r.area());
	}
}