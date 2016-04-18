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
		//descobrir quantas turmas
		while(turmas[i] != null){
			System.out.println(turmas[i].diaSemana);
			if(turmas[i].local == l){
				if(turmas[i].diaSemana.equals("seg")){
					System.out.println("equals caralho");
					while(hora<=22){
						if(turmas[i].inicio == hora){
							at[j][k] = 1;
						}
						hora++;
						k++;
					}
				}
			}
			else{
				at[j][k] = 0;
			}
			j++;
			k = 0;
			i++;
			hora = 8;
		}
		
//		for(int i = 0; i < 50; i++){
//			if(turmas[i].local == l){
//				if(turmas[0].diaSemana == "Seg"){
//					if(turmas[0].inicio == hora){
//						at[j][k] = " x ";
//					}
//				}
//			}
//			else{
//				at[j][k] = "   ";
//			}
//			j++;
//			k++;
//		}
		System.out.println("     | Dom | Seg | Ter | Qua | Qui | Sex | Sab |");
//		for(j=0;j<6;j++){
//			for(k=0;k<15;k++){
//				System.out.print(""+j+" "+k+" | ");
//			}
//			System.out.println("");
//		}
		
		int h = 8;
		for(j=0;j<15;j++){
			for(k=0;k<6;k++){
				if(k==0) System.out.print(h+"h   | fec |");
				if(at[j][k] == 1) System.out.print(" res |");
				else System.out.print("     |");
//				if(at[j][k] == 1) System.out.print(j+" "+k+"|");
//				else System.out.print(j+" "+k+"|");
				
			}
			System.out.println("");
			h++;
		}
			
//		System.out.println("8h    | Fec |");
//		System.out.println("9h    | Fec |");
//		System.out.println("10h   | Fec |");
//		System.out.println("11h   | Fec |");
//		System.out.println("12h   | Fec |");
//		System.out.println("13h   | Fec |");
//		System.out.println("14h   | Fec |");
//		System.out.println("15h   | Fec |");
//		System.out.println("16h   | Fec |");
//		System.out.println("17h   | Fec |");
//		System.out.println("18h   | Fec |");
//		System.out.println("19h   | Fec |");
//		System.out.println("20h   | Fec |");
//		System.out.println("21h   | Fec |");
//		System.out.println("22h   | Fec |");
	}
	
}
