package q2.senha;

import java.util.Scanner;

public class Senha_Q2 {
	
public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Entrada:");
	String senha = scan.next();
	
	String validaSenha = validarSenha(senha);
	 System.out.println("Saída:");
	System.out.println(validaSenha);
	
	scan.close();
}
public static String validarSenha(String senha)
{
 int contador = 6;

if (senha.length() < 5 ) 
{
contador--;
}
if (senha.length() < 6 ) 
{
contador--;
}
 String numbers = "(.*[0-9].*)"; 
 if (!senha.matches(numbers ))
{
contador--;
}
 String lowerCaseChars = "(.*[a-z].*)"; 
 if (!senha.matches(lowerCaseChars ))
 {
 contador--;
}
 String upperCaseChars = "(.*[A-Z].*)"; 
 if (!senha.matches(upperCaseChars ))
{
 contador--;
}
 String specialChars = "(.*[!,@,#,$,%,^,&,*,(,),-,+].*$)"; 
 if (!senha.matches(specialChars ))
{
 contador--;
}
return Integer.toString(contador);

} 
}
