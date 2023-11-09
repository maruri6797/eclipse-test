package classmethod.human;

public class Task {
	private int date;
	private String content;
	private boolean done = false;
	
	public Task(int date, String content) {
		this.date = date;
		this.content = content;
	}
	
	public void done() {
		System.out.println("タスク「" + content + "」を完了します。");
		done = true;
	}
	
	public void print() {
		if (done) {
			System.out.println(date + "のタスク「" + content + "」は完了しています。");
		} else {
			System.out.println(date + "のタスク「" + content + "」は未完了です。");
		}
	}
}
