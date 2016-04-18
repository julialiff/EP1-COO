package src;
public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario fulano = new Usuario();
		fulano.id = 10;
		fulano.nome = "Fulano";
		System.out.println(fulano.nome);
		
		Atividade volei = new Atividade();
		volei.nome = "Vôlei";
		volei.modalidade = "Físico";
		System.out.println(volei.nome);
		
		Local l = new Local();
		l.id = 1;
		l.tipo = "Físico";
		System.out.println(l.tipo);
		
		Turma t = new Turma();
		t.duracao = 2;
		t.inicio = "10h";
		t.fim = "12h";
		t.qtd = 1;
		t.atividade = volei;
		//t.usuario[0] = fulano;
		//t.usuario = new Usuario[1];
		//t.usuario[0] = fulano;
		t.local = l;
		System.out.println();
		System.out.println(t.atividade.nome);
	}

}