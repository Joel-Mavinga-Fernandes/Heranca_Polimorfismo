package heranca_polimorfismo0;

public class animais {

	public static void main(String[] args) {
		
		cachorro cac = new cachorro();
		cavalo cav = new cavalo();
		preguica preg = new preguica();
		
		
		cac.setNome("Bob");
		cac.setIdade(12);
		cav.setCorre("corre");
		cac.setSon("ladra");
		
		cav.setNome("Paul");
		cav.setIdade(4);
		cav.setCorre("Corre");
		cav.setSon("relinchar");
		
		preg.setNome("zora");
		preg.setIdade(2);
		preg.setCorre("sobe arvores");
		preg.setSon("haaah");
		
		System.out.println("Dados do Cachorro: ");
		System.out.println("Nome: " + cac.getNome());
		System.out.println("Idade: " + cac.getIdade());
		System.out.println("O som emitido pelo cachorro é: " + cac.getSon());
		System.out.println("O cachorro: " + cac.getCorre());
		System.out.println();
		System.out.println("Dados do Cavalo: ");
		System.out.println("Nome: " + cav.getNome());
		System.out.println("Idade: " + cav.getIdade());
		System.out.println("O som emitido pelo cavalo: " + cav.getSon());
		System.out.println("O Cavalo: " + cav.getCorre());
		System.out.println();
		System.out.println("Dados do Animal Preguiça: ");
		System.out.println("Nome: " + preg.getNome());
		System.out.println("Idade: " + preg.getIdade());
		System.out.println("O som emitido pelo preguiça: " + preg.getSon());
		System.out.println("O animal preguiça: " + preg.getCorre());
		
		
	}

}
