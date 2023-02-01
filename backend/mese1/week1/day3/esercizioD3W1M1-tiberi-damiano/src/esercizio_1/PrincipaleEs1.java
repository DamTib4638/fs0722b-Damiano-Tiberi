package esercizio_1;

public class PrincipaleEs1 {
	public static void main(String[] args) {
		String parola = "as";
		System.out.println(stringaPariDispari(parola));
		
		int annoTest = 33;
		System.out.println(annoBisestile(annoTest));
	}
	public static boolean stringaPariDispari(String str) {
		return (str.length()%2==0) ? true : false;
//		if(str.length()%2==0) {
//			return true;
//		}
//		return false;
	}
	public static boolean annoBisestile(int anno) {
		// questo metodo non ha senso. Se un numero deve essere divisibile per 400, è per forza divisibile per 100.
		// Un numero divisibile per 400 è sicuro divisibile per 100 e per 4, quindi basta il controllo sulla divisibilità per 4 e vengono presi gli stessi numeri.

		return ( anno%4==0 || (anno%100==0 && anno%400==0) ) ? true : false;
//		if (anno%4==0 || (anno%100==0 && anno%400==0)) {
//			return true;
//		}
//		return false;
	}
}
