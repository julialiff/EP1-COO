package src;
public class Jogo {

	public static void main(String[] args) {
		Turma turmas[] = new Turma[50];
		
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
		l.modalidade = "Físico";
		System.out.println(l.tipo);
		
		Turma t = new Turma();
		turmas = t.criarTurma(turmas, 1, 5, "seg", 10, 12, volei, l);
		turmas = t.criarTurma(turmas, 2, 5, "seg", 12, 14, volei, l);
		System.out.println(turmas);
		System.out.println(turmas[0]);
		System.out.println(turmas[0].diaSemana);
		System.out.println(turmas[1].diaSemana);
		
//		Turma t = new Turma();
//		t.duracao = 2;
//		t.inicio = 10;
//		t.fim = 12;
//		t.qtd = 1;
//		t.atividade = volei;
//		t.usuario[0] = fulano;
//		t.usuario = new Usuario[1];
//		t.usuario[0] = fulano;
//		t.local = l;
//		System.out.println();
//		System.out.println(t.usuario[0].nome);
	}

}