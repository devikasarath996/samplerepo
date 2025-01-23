package encapsulation;

public class Encapsule {
	public void setter(String name,int age) {
		this.name=name;
		this.age=age;
	}
		private String name;
		private int age;
		public void getter() {
			System.out.println(name);
			System.out.println(age);
		}
}
