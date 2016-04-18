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
		System.out.println(l.modalidade);
		
		Turma t = new Turma();
		turmas = t.criarTurma(turmas, 1, 5, "seg", 10, 12, volei, l);
		turmas = t.criarTurma(turmas, 2, 5, "seg", 12, 14, volei, l);
		System.out.println(turmas);
		System.out.println(turmas[0]);
		System.out.println(turmas[0].qtd);
		
		t.matricula(turmas[0], fulano);
		System.out.println(turmas[0].usuario[0].nome);
		
		
	}

}