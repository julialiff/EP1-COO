package src;
public class Calendario {
	public void calendario(Turma[] turmas, Local l){
		System.out.println(l.modalidade);
		System.out.println(turmas[0]);
		int j = 0 ;
		int k = 0;
		int i = 0;
		int[][] at = new int[15][6]; 
		int hora = 8;
		
		while(turmas[i] != null){
			System.out.println(turmas[i].diaSemana);
			if(turmas[i].local == l){
				if(turmas[i].diaSemana.equals("seg")){
					j = 0;
				}
				else if(turmas[i].diaSemana.equals("ter")){
					j = 1;
				}
				else if(turmas[i].diaSemana.equals("qua")){
					j = 2;
				}
				else if(turmas[i].diaSemana.equals("qui")){
					j = 3;
				}
				else if(turmas[i].diaSemana.equals("sex")){
					j = 4;
				}
				else if(turmas[i].diaSemana.equals("sab")){
					j = 5;
				}
				while(hora <= 22){
					System.out.println(turmas[i].inicio + " == " + hora);
					System.out.println("k j: "+k+" "+j);
					if(turmas[i].inicio == hora){
						at[k][j] = 1;
					}
					hora++;
					k++;
				}
			}
			else{
				at[j][k] = 0;
				k++;
			}
			j++;
			k = 0;
			i++;
			hora = 8;
		}
		
		System.out.println("     | Dom | Seg | Ter | Qua | Qui | Sex | Sab |");
		int h = 8;
		for(j=0;j<15;j++){
			for(k=0;k<6;k++){
				if(k==0) System.out.print(h+"h   | fec |");
				if(at[j][k] == 1) System.out.print(" res |");
				else System.out.print("     |");
		}
			System.out.println("");
			h++;
		}
	}
	
}
