package Heranca_polimorfismo;

public class Animais {

	public static void main(String[] args) {
	
		cachorro Cachorro = new cachorro ();
		cavalo cav = new cavalo();
		pregui�a preg = new pregui�a();
		
		Cachorro.setNome("layca");
		Cachorro.setIdade(5);
		Cachorro.setSon("Latir");
		Cachorro.setCorre("Corre");
		
		cav.setNome("bamb");
		cav.setIdade(10);
		cav.setSon("Relinchar");
		cav.setCorre("Trota");
		
		preg.setNome("Brad");
		preg.setIdade(2);
		preg.setSon("hamm");
		preg.setSobeArvores("Sobre nas arvores");
		System.out.println();
		System.out.println("Dados do Cachorro: ");
		System.out.println("Nome: " + Cachorro.getNome());
		System.out.println("Idade: " + Cachorro.getIdade());
		System.out.println("O som emitido pelo cachorro �: " + Cachorro.getSon());
		System.out.println("O cachorro: " + Cachorro.getCorre());
		System.out.println();
		System.out.println("Dados do Cavalo: ");
		System.out.println("Nome: " + cav.getNome());
		System.out.println("Idade: " + cav.getIdade());
		System.out.println("O som emitido pelo cavalo: " + cav.getSon());
		System.out.println("O Cavalo: " + cav.getCorre());
		System.out.println();
		System.out.println("Dados do Animal Pregui�a: ");
		System.out.println("Nome: " + preg.getNome());
		System.out.println("Idade: " + preg.getIdade());
		System.out.println("O som emitido pelo pregui�a: " + preg.getSon());
		System.out.println("O animal pregui�a: " + preg.getCorre());
		
	}

}
