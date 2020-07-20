package de.topobyte.test;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestResources
{

	/**
	 * This works using `./gradlew test` but fails when run in Eclipse.
	 */
	@Test
	public void test() throws IOException
	{
		List<URL> main = Resources.getAll("main.txt");
		Assert.assertEquals(2, main.size());
		List<URL> testing = Resources.getAll("testing.txt");
		Assert.assertEquals(1, testing.size());
	}

}
