package pra01;

public class Cs03 implements Cs04,Cs05 {
	public static void main(String[] args) {
		Cs03 e = new Cs03();
		e.down();
		e.ghar();
		e.nimbu();
		e.shrbat();
		e.UP();
		e.watchman();
	}

	@Override
	public void ghar() {
		System.out.println("home");
		
	}

	@Override
	public void nimbu() {
		System.out.println("Pani");
		
	}

	@Override
	public void shrbat() {
		System.out.println("Hai sharbat to mangao");
		
	}

	@Override
	public void UP() {
		System.out.println("UPtodown");
		
	}

	@Override
	public void down() {
		System.out.println("Downtoup");
		
	}

	@Override
	public void watchman() {
		System.out.println("Choukidar");
		
	}

}

