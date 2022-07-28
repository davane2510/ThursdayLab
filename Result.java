abstract class Marks {
	abstract float getPercentage();
}

class A extends Marks {
	private int physics;
	private int chemistry;
	private int mathematics;

	public A(int physics, int chemistry, int mathematics) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.mathematics = mathematics;
	}

	float getPercentage() {
		float result = (float)(physics + chemistry + mathematics)/400*100;
		return result;
	}

}

class B extends Marks {
	private int physics;
	private int chemistry;
	private int mathematics;
	private int biology;

	public B(int physics, int chemistry, int mathematics, int biology) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.mathematics = mathematics;
		this.biology = biology;
	}

	float getPercentage() {
		float result = (float)(physics + chemistry + mathematics + biology)/500*100;
		return result;
	}

}
class Result {
	public static void main(String[] args) {
		A a = new A(45,35,65);
		B b = new B(55,85,66, 96);

	System.out.println("Student A Result");
		System.out.println("Total Percentage: " + String.format("%.2f", a.getPercentage()) + "%");
		
		
		System.out.println("Student B Result");
		System.out.println("Total Percentage: " + String.format("%.2f", b.getPercentage()) + "%");

	}

}