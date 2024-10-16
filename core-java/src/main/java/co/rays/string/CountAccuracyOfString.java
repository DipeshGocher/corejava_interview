package co.rays.string;

public class CountAccuracyOfString {

	public static void main(String[] args) {

		String name = "nama123n";
		
	//	StringBuffer sb = new StringBuffer("naman");
	  //  String name = sb.toString();              // convert Stringbuffer into string

		for(char a ='a'; a<='z'; a++) {
			int count = 0;
			for (int i = 0; i < name.length(); i++) {

				if (a == name.charAt(i)) {

					count++;
				}

			}
			if (count > 0) {
				System.out.println(a + ":" + count);

			}
		}
	}
}
