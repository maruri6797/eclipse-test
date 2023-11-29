package practice;

public class Chapter18_3 {
	public static void main(String[] args) {
		String zip = "\\d{3}-\\d{4}";
		String zip1 = "100-0001";
		String zip2 = "1000-001";
		System.out.println(zip1 + "=" + zip1.matches(zip));
		System.out.println(zip2 + "=" + zip2.matches(zip));
		
		String tel = "0[789]0-\\d{4}-\\d{4}";
		String tel1 = "090-1111-1111";
		String tel2 = "080-122-22222";
		String tel3 = "040-4322-2222";
		System.out.println(tel1 + "=" + tel1.matches(tel));
		System.out.println(tel2 + "=" + tel2.matches(tel));
		System.out.println(tel3 + "=" + tel3.matches(tel));
		
		String time = "([01]\\d|2[0123]):[0-5]\\d";
		String time1 = "23:59";
		String time2 = "23-59";
		String time3 = "24:00";
		System.out.println(time1 + "=" + time1.matches(time));
		System.out.println(time2 + "=" + time2.matches(time));
		System.out.println(time3 + "=" + time3.matches(time));
	}
}
