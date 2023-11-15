package practice;

public class Chapter16 {
	public static void main(String[] args) {
		Human[] humans = new Human[] {
				new Student(),
				new Programmer(),
				new Driver(),
				new Teacher(),
				new Doctor(),
		};
		
		for (Human h : humans) {
			h.work();
			
			if (h instanceof Programmer) {
				((Programmer)h).study();
			}
		}
	}
}
