import java.util.Scanner;
import com.generation.Tacos;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tacos taco1 = new Tacos("Masa azul","Suadero",2,"Mediana",30);
		/*
		 * taco1.tipodeTortilla = "Masa azul"; taco1.tipodeGuisado = "Suadero";
		 * taco1.numerodeTortilla = 2; taco1.tamaniodeTortilla = "Mediana"; taco1.precio
		 * = 30;
		 */
		taco1.subirPrecio(5.5f);
		
		Tacos taco2 = new Tacos("Harina","Bisteck",1,"Grande",25.5f);
		/*
		 * taco2.tipodeTortilla = "Harina"; taco2.tipodeGuisado = "Bisteck";
		 * taco2.numerodeTortilla = 1; taco2.tamaniodeTortilla = "Grande"; taco2.precio
		 * = 25.5f;
		 */
		Tacos taco3 = new Tacos("Maiz");
		System.out.println(taco1.toString());
		System.out.println(taco2.toString());
		System.out.println(taco3);	//Se llama toString() por default
		sc.close();
	}

}
