package practice;

import practice.CapsuleTask;

public class Chapter14 {
	public static void main(String[] args) {
		CapsuleTask task = new CapsuleTask("牛乳を買う", 20211021);
		System.out.println("タスク内容は" + task.getContent() + "です。");
		System.out.println("期限は" + task.getDate() + "です。");
		System.out.println("状態は" + task.getStatus() + "です。");
		task.setStatus("完了");
		System.out.println("状態は" + task.getStatus() + "になりました。");
	}
}
