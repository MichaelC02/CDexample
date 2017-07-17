package marolt.it.service;

import org.junit.Assert;
import org.junit.Test;

import marolt.it.services.CDService;

public class ServiceTest {

	CDService service = new CDService();
	
	@SuppressWarnings("deprecation")
	@Test
	public void multiplyTest(){
		Assert.assertEquals(4, service.multiply(2,2));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void percent2DoubleTest(){
		Assert.assertEquals(0.1, service.percent2Double(10.0));
	}
}

