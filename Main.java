/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    final static String delimitador = "%";
    
	public static void main(String[] args) {
	    
        String userInforme = "lnsdlkclkdk";
		System.out.println("tamanho da string ==>" + getSizeString(userInforme.concat(delimitador)));	
	
    }

	public static int getSizeString(String s) {
		int i = 0;
		if (s == null)
			return i;
			
		do {
			s.charAt(i);
			i++;
		}
		while (!String.valueOf(s.charAt(i)).equals(delimitador));
		return i; 
	}

}