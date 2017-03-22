package Medias;
import java.util.Scanner;
public class MediasNota {
	
	public static void main ( String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		float nota1 = scan.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float nota2 = scan.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		float nota3 = scan.nextFloat();
		
		float media = (nota1+nota2+nota3)/3;
		
		if (media<6){
			System.out.println("Aluno reprovado com nota: "+media);
		}
		else{
			System.out.println("Aluno aprovado com nota: "+media);
		}
}

}
