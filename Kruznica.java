import java.util.Scanner;

public class Kruznica {

	public static void main(String[] args) {
		double radius, π, povrsina, perimetar;
		Scanner tastatura=new Scanner(System.in);
		System.out.print("Programata presmetuva povrsina na kruznica");
		System.out.print("Vnesete radius na kruznica");
		radius=tastatura.nextDouble();
		System.out.print("Vnesete go π");
		π=tastatura.nextDouble();
		perimetar=2*radius*π;
		povrsina=radius*radius*π;
		System.out.print("Perimetarot e: " + perimetar);
		//System.out.print(perimetar);
		System.out.print("Povrsinata e: " + povrsina);
		//System.out.print(povrsina);
		}

}
