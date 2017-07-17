package marolt.it.service;

import org.junit.Assert;
import org.junit.Test;

import marolt.it.services.CDService;

public class ServiceTest {

	CDService service = new CDService();
	
	@Test
	public void multiplyTest(){
		Assert.assertEquals(4.0, service.multiply(2.0, 2.0), 0);
	}
	
	@Test
	public void multiplyTestFail(){
		Assert.assertNotEquals(5.0, service.multiply(2.0, 2.0), 0);
	}
	
	@Test
	public void percent2DoubleTest(){
		Assert.assertEquals(0.1, service.percent2Double(10.0), 0);
	}
}

