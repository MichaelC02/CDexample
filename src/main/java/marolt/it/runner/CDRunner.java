package marolt.it.runner;

import marolt.it.services.CDService;

public class CDRunner {

	public static void main(String[] args) {
		CDService service = new CDService();
		System.out.println(service.calculate4());

	}

}
