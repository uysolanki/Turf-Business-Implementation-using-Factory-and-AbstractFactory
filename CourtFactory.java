package day12.hotfut;

public class CourtFactory {

		static Court c;
		
		static Court getCourt(String sportName)
		{
			switch(sportName)
			{
			case "Cricket" : 
				c=new CricketCourt();
				break;
			case "Football" : 
				c=new FootballCourt();
				break;
			case "Tennis" : 
				c=new TennisCourt();
				break;
				
			}
			return c;
		}
}
