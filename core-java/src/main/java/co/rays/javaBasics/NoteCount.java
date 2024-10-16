package co.rays.javaBasics;

public class NoteCount {
	
public static void main(String[] args) {
	
	int [] notes = { 2000, 500, 200, 100, 50, 20, 10 };
	
	int count = 0;
	int rupee = 4500;
	
	for(int i = 0; i<notes.length; i++) {
		
		count = rupee / notes[i];
		
		if(count>0) {
			System.out.println(notes[i] + "=" + count);
		}
	 	 rupee = rupee % notes[i];
}
}
}
