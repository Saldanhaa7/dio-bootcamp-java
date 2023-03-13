public class MinhaClasse {
        //CORPO DA CLASSE
public static void main (String [] args ) {
        //CORPO DO MÉTODO main
    String primeiroNome = "Bruno";
    String segundoNome = "Saldanha";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    
    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
        //CORPO MÉTODO nomeCompleto
        return primeiroNome.concat(" ").concat(segundoNome);
}

}
