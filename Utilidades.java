
public class Utilidades {
	public static boolean validarData(String data) {
		//Padrão: 00/00/0000
		
		String[] dataAberta = data.split("/");
				
		if (dataAberta.length != 3)
			return false;
		
		try {
			if (Integer.parseInt(dataAberta[0]) < 1 | Integer.parseInt(dataAberta[0]) > 31)
				return false;
			
			if (Integer.parseInt(dataAberta[1]) < 1 | Integer.parseInt(dataAberta[1]) > 12)
				return false;
		} catch (Exception e) {
			//Falha ao converter.
			return false;
		}
		
		if (dataAberta[2].length() != 4)
			return false;
		
		return true;
	}
	
	public static boolean validarCPF(String CPF) {
        String rawCPF = CPF.replaceAll("\\.", "").replaceAll("\\-", "");

        if (rawCPF.length() != 11)
            return false;

        String arrayCPF[] = rawCPF.split("");

        if (allSameLetter(rawCPF))
            return false;

        int soma = 0;

        for (int i = 0, j = 10; i < 9; i++, j--)
            soma += Integer.parseInt(arrayCPF[i])*j;

        int primeiroDigito = (soma*10)%11;

        if (!arrayCPF[9].equals(primeiroDigito+""))
            return false;

        soma = 0;

        for (int i = 0, j = 11; i < 10; i++, j--)
            if (i == 9)
                soma += primeiroDigito*j;
            else
                soma += Integer.parseInt(arrayCPF[i])*j;

        int segundoDigito = (soma*10)%11;

        if (!arrayCPF[10].equals(segundoDigito+""))
            return false;
        
        return true;
    }
	
	public static boolean allSameLetter(String str) {
        char c1 = str.charAt(0);
        for(int i=1;i<str.length();i++) {
            char temp = str.charAt(i);
            if(c1 != temp) {
                //if chars does NOT match,
                //just return false from here itself,
                //there is no need to verify other chars
                return false;
            }
        }
        //As it did NOT return from above if (inside for)
        //it means, all chars matched, so return true
        return true;
    }
}
