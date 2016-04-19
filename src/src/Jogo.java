package src;
public class Jogo {

	public static void main(String[] args) {
		Turma turmas[] = new Turma[50];
		
		Usuario fulano = new Usuario();
		fulano.id = 10;
		fulano.nome = "Fulano";
		
		
		Atividade volei = new Atividade();
		volei.nome = "Vôlei";
		volei.modalidade = "Físico";
		
		Local l = new Local();
		l.id = 1;
		l.modalidade = "Físico";
		
		Turma t = new Turma();
		turmas = t.criarTurma(turmas, 1, 5, 10, "seg", 10, 12, volei, l);
		turmas = t.criarTurma(turmas, 2, 5, 20, "qui", 18, 20, volei, l);
		
		t.matricula(turmas[0], fulano);
		System.out.println(turmas[0].usuario[0].nome);
		
		System.out.println("Calendário");
		Calendario c = new Calendario();
		c.calendario(turmas, l);
	}

}