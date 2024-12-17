package co.rays.streamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestWinner {

	public static void main(String[] args) {

		List<ContestWinner> l = new ArrayList<ContestWinner>();

		l.add(new ContestWinner("dipesh", "8209224481"));
		l.add(new ContestWinner("gocher", "9209224481"));
		l.add(new ContestWinner("Nikita", "6350039505"));
		l.add(new ContestWinner("Katariya", "9461009023"));

		l.stream().map(e ->
		e.getName() + " " + e.getPhoneNo()).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), c ->{
			
			Collections.shuffle(c);
			
			return c.stream();
		})).limit(2).forEach(c ->
		System.out.println(c));
	}

}
