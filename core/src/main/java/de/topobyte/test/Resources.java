package de.topobyte.test;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Resources
{

	public static List<URL> getAll(String name) throws IOException
	{
		List<URL> list = new ArrayList<>();
		Enumeration<URL> urls = Thread.currentThread().getContextClassLoader()
				.getResources(name);
		while (urls.hasMoreElements()) {
			URL url = urls.nextElement();
			list.add(url);
		}
		return list;
	}

}
