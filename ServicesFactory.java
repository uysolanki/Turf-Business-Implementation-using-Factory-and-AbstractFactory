package day12.hotfut;

public class ServicesFactory {
		static KitServices s;
		
		static KitServices getService(String serviceName)
		{
			switch(serviceName)
			{
			case "cricketkit":
				s=new CricketKit();
				break;
			case "footballkit":
				s=new FootballKit();
				break;
			case "tenniskit":
				s=new TennisKit();
				break;
			}
			return s;
		}
}
