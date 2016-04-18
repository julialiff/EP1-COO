package src;

public class Turma {
	int id;
	int duracao;
	String diaSemana;
	int inicio;
	int fim;
	int qtd;
	Atividade atividade;
	Usuario usuario[] = new Usuario[10];
	Local local;
	
	public Turma[] criarTurma(Turma[] turmas, int id, int duracao, String diaSemana, int inicio, int fim, Atividade atividade, Local local){
		if(turmas[0] == null){
			Turma t = new Turma();
			t.id = id;
			t.duracao = duracao;
			t.diaSemana = diaSemana;
			t.inicio = inicio;
			t.fim = fim;
			t.qtd = 0;
			t.atividade = atividade; 
			t.local = local;
			turmas[0] = t;
			return turmas;
		}
		else{
			int i = 0;
			while(turmas[i] != null){
				i++;
			}
			Turma t = new Turma();
			t.id = id;
			t.duracao   = duracao;
			t.diaSemana = diaSemana;
			t.inicio    = inicio;
			t.fim       = fim;
			t.qtd       = 0;
			t.atividade = atividade; 
			t.local     = local;
			for(int j=0; j<i; j++){
				if(turmas[j].diaSemana == t.diaSemana){
					if(turmas[j].local == t.local){
						if(turmas[j].inicio == t.inicio){ //melhorar teste pra mesmo horario
							return turmas;
						}
					}
				}
			}
			turmas[i]   = t;
			return turmas;
		}
	};
	
	public boolean matricula(Turma turma, Usuario usuario){
		if(turma.qtd == 10){
			return false;
		}
		turma.usuario[qtd] = usuario;
		turma.qtd++;
		return true;
	}
}
