package test;

import org.junit.Test;
import org.junit.Assert;
import warmest.Warmest;

public class WarmestDataStructureTest {

	@Test
	public void addItemAndReturnItsVal() {
		Warmest<Integer,String> warmest = new Warmest<>();
		warmest.put(1,"hello");
		String expected = "hello";
		Assert.assertTrue(warmest.get(1).equals(expected));
	}
	
	@Test
	public void returnsCorrectWarmest() {
		Warmest<Integer,String> warmest = new Warmest<>();
		warmest.put(1,"hello");
		warmest.put(2, "warmest");
		String expected = "warmest";
		Assert.assertTrue(warmest.getWarmest().equals(expected));
	}
	
	@Test
	public void returnsCorrectWarmest2() {
		Warmest<Integer,String> warmest = new Warmest<>();
		warmest.put(1,"hello");
		warmest.put(2, "warmest");
		warmest.get(1);
		String expected = "hello";
		Assert.assertTrue(warmest.getWarmest().equals(expected));
	}
	
	@Test
	public void removeAndWarmestWork() {
		Warmest<Integer,String> warmest = new Warmest<>();
		warmest.put(2, "warmest");
		warmest.put(1,"hello");
		warmest.remove(1);
		String expected = "warmest";
		Assert.assertTrue(warmest.getWarmest().equals(expected));
	}
	
	@Test
	public void removeWorks() {
		Warmest<Integer,String> warmest = new Warmest<>();
		warmest.put(1,"hello");	
		String expected = "hello";
		Assert.assertTrue(warmest.remove(1).equals(expected));
	}
	
	

}
