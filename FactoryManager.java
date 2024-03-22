package day12.hotfut;

public class FactoryManager {
		static Court court;
		static KitServices service;
	public static Court getCourt(int choice) {
		switch(choice)
		{
		case 1 : court=CourtFactory.getCourt("Cricket"); 
				 break;
		case 2 : court=CourtFactory.getCourt("Football");
				 break;
		case 3 : court=CourtFactory.getCourt("Tennis");
				 break;
		case 4 : System.exit(0);
		}
		return court;
	}
	
	public static KitServices getServices(int choice) {
		switch(choice)
		{
		case 1 : service=ServicesFactory.getService("cricketkit"); 
				 break;
		case 2 : service=ServicesFactory.getService("footballkit"); 
				 break;
		case 3 : service=ServicesFactory.getService("tenniskit"); 
				 break;
		case 4 : System.exit(0);
		}
		return service;
	}

}
