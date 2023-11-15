package polymorphism.human;

public class Employee extends Human {
	private String department;
	
	public Employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}
	
	public String getProfile() {
		String profile = "年齢は" + getAge() + "です。";
		profile += "サラリーマンで、部署は" + this.department + "です。";
		return profile;
	}
}
