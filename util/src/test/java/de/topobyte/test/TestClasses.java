package de.topobyte.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestClasses
{

	@Test
	public void test()
	{
		List<Something> things = new ArrayList<>();
		things.add(new CoreMain());
		things.add(new UtilMain());
		things.add(new CoreTest());
		things.add(new UtilTest());
		for (Something thing : things) {
			System.out.println(thing.getSomething());
		}
	}

}
