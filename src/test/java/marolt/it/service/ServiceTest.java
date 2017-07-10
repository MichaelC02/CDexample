package marolt.it.service;

import org.junit.Assert;
import org.junit.Test;

import marolt.it.services.CDService;

public class ServiceTest {

	@Test
	public void calculateTest(){
		CDService service = new CDService();
		
		Assert.assertEquals(4, service.calculate4());
	}

}
