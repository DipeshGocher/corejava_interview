package co.rays.streamApi;

import java.util.stream.Stream;

public class StreamToArray {
	
	public static void main(String[] args) {
		
		Stream<String> stringStream = Stream.of("c", "b", "a");
		
		String[] stringArray = stringStream.toArray(e -> new String[e]);
		
		
		for(String s : stringArray) {
			
			System.out.println(s);
		}
		
	//	 System.out.println(stringArray[1]);
	}

}
