
public class ControleSwitch {

	public static void main(String[] args) {
		int a = 0;
		
		switch (a) {
		case 1: 
			System.out.println("Oi.");
			break;
		case 2: 
			System.out.println("Oi, denovo");
			break;
		case 3:
			System.out.println("Oi, pela última vez.");
			break;
		default:
			System.out.println("Sou insistente: oi, denovo.");
		}
		
		System.out.println(a);

	}

}
