package classmethod.human;

public class Chapter11 {
	public static void main(String[] args) {
		int date = 20211010;
		String content = "牛乳を買う";
		Task task = new Task(date, content);
		task.print();
		
		task.done();
		
		task.print();
	}
}
