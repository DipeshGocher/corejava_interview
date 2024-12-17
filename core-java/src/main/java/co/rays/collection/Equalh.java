package co.rays.collection;

public class Equalh {

	int id;
	String name;
	int salary;

	public Equalh(int id, String name, int salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int hashCode() {

		String s = this.id + this.name + this.salary;

		return s.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {

			return false;
		}

		if (!(obj instanceof Equalh)) {

			return false;
		}
		Equalh e = (Equalh) obj;

		String st = this.id + this.name + this.salary;
		String st1 = e.id + e.name + e.salary;

		return st.equals(st1);
	}

	@Override
	public String toString() {

		String s = this.id + " " + this.name  + " "+ this.salary;
		return s;
	}
}
