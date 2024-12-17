package co.rays.collection;

public class Teacher implements Comparable<Teacher> {

	private int id;
	private String name;

	public Teacher(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public int compareTo(Teacher o) {

		if (this.id == o.id) {

			return this.name.compareTo(o.name);
		} else {

			return this.id - o.id;
		}

	}

	@Override
	public String toString() {

		return id + " " + name;
	}

}
