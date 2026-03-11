public class rough1{
	public static void main(string[] args){
		int entryhour=9;
		int exithour=15;
		boolean isweekand=true;
		if exithour<=entryhour and entryhour<0 and exithour>24{
		System.out.println("INVALID ENTRY");
		return;}
		int duration=exithour-entryhour;
		double base_charge=duration*20;
		if duration>8{
			base_charge=200;
		}
		else {
			base_charge=duration*20;
		}
		if isweekand{
			base_charge=duration*1.1;
		}
		System.out.println("Total parking fee "+base_charge);
	}
}
	
		
		