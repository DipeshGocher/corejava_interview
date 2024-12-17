package co.rays.streamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamStartWithT {
	
	public static void main(String[] args) {

//	List<String> list = Arrays.asList("raj", "raj", "kapil", "Kapil","Kapil");

		String [] arr = {"one", "two", "three", "three", "four"};
		
		
		Arrays.stream(arr).map(e -> e.toUpperCase()).filter(e -> e.startsWith("T")).distinct().sorted()
				.forEach(System.out::println);

//		map(): Pehle sabhi elements ko uppercase mein convert karo.
//		filter(): Sirf un elements ko raho jo "T" se shuru hote hain.
//		distinct(): Duplicates ko hata do.
//		sorted(): Jo bache hue elements hain, unko alphabetically sort karo.
//		forEach(): Har sorted aur filtered element ko print karo.

	
	
	}

}
