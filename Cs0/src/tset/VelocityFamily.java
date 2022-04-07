package tset;

public class VelocityFamily implements Son,Daughter {

	public static void main(String[] args) {
    
	VelocityFamily A1 = new VelocityFamily();	
		A1.Car();
		A1.Goddess();
		A1.Gold();A1.Google();
		A1.Home();
		A1.Painting();
		A1.Rocket();A1.Rasta();
		A1.Property();
		A1.Rasta();
	}

	@Override
	public void Gold() {
		
		System.out.println("Sona hai sona");
		
	}

	@Override
	public void Property() {
		
		System.out.println("Hamari hai");
	}

	@Override
	public void Home() {
		System.out.println("Hamara bangla");
		
	}

	@Override
	public void Car() {
		System.out.println("Fatichar car");
		
	}

	@Override
	public void Painting() {
		System.out.println("Pisako chi panting");
		
	}

	@Override
	public void Rocket() {
System.out.println("Chand ki sair");
		
	}

	@Override
	public void Goddess() {
		System.out.println("durga mata");
		
	}

	@Override
	public void Google() {
		System.out.println("Chalo serch kare");
		
	}

	@Override
	public void Tampo() {
		System.out.println("407");
		
	}

	@Override
	public void Rasta() {
		System.out.println("Apla highway");
		
	}

}
