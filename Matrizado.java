 import java.util.Scanner;
 class Semestrando{
protected int tamanho;
protected int tamanha;
protected String professore;
protected String Alunoe;
protected String Disciplinae;
protected int nte1;
protected int nte2;
protected int nte3;
protected float medianae;
protected int tam;
protected int tem;
public void setTam(int tam){
	this.tam = tam;
	}
public int getTam(){
	return tam;
	}
public void setTem(int tem){
	this.tem = tem;
	}
public int getTem(){
	return tem;
	}
public void setProfessore(String professore){
	this.professore = professore;
	}
public String getProfessore(){
	return professore;
	}
public void setAlunoe(String Alunoe){
	this.Alunoe = Alunoe;
	}
public String getAlunoe(){
	return Alunoe;
	}
public void setDisciplinae(String Disciplinae){
	this.Disciplinae = Disciplinae;
	}
public String getDisciplinae(){
	return Disciplinae;
	}
public void setNte1(int nte1){
	this.nte1 = nte1;
	}
public int getNte1(){
	return nte1;
	}
public void setNte2(int nte2){
	this.nte2 = nte2;
	}
public int getNte2(){
	return nte2;
	}
public void setNte3(int nte3){
	this.nte3 = nte3;
	}
public int getNte3(){
	return nte3;
	}
public void setMedianae(float medianae){
	this.medianae = (nte1+nte2+nte3)/3;
	
}
public float getMedianae(){
	
   medianae = (nte1+nte2+nte3)/3;
   return medianae;

}
/*
public void apagaTudo(){
	Alunoe = null;
	professore = null;
	Disciplinae = null;
	nte1 = 0;
	nte2 = 0;
	nte3 = 0;
	}
	*/
}

class Estudante extends Semestrando{
	Scanner T = new Scanner(System.in);
public void insertStudenteDates(){
	System.out.print("Nome do aluno_____________________________________: ");
	String Alunoe = T.nextLine();
	setAlunoe(Alunoe);
	System.out.println();
}

public void showStudentDates(){
	System.out.println();
	System.out.println("Nome do aluno................................................:"+this.Alunoe);
										}
}

class Disciplinando extends Semestrando{
	Scanner T = new Scanner(System.in);
public void insertProfeDates(){
	System.out.print("Professor(a)______________________________________:");
	String professore = T.nextLine();
	setProfessore(professore);
	}
public void showProfeDates(){
	System.out.println("Nome do(a) professor(a)....................: "+this.professore);
	System.out.println("Disciplina do(a) professor(a)..............: "+this.Disciplinae);
	                                       System.out.println();
	}
public void insertDisciplinDates(){
	System.out.print("Disciplina________________________________________: ");
	String Disciplinae = T.nextLine();
	setDisciplinae(Disciplinae);
	System.out.println();
	System.out.print("Primeira nota da disciplina (em inteiro)__________: ");
	int nte1 = T.nextInt();
	while(nte1 > 10){
		System.out.print("Nota invalida, digite novamente primeira nota (em inteiro):");
		nte1 = T.nextInt();
		}
	setNte1(nte1);
	T.nextLine();
	System.out.print("Segunda nota da disciplina (em inteiro)___________:  ");
	int nte2 = T.nextInt();
	while(nte2 > 10){
		System.out.print("Nota invalida, digite novamente segunda nota (em inteiro):");
		nte2 = T.nextInt();
		}
	setNte2(nte2);
	T.nextLine();
	System.out.print("Terceira nota da disciplina (em inteiro)___________: ");
	int nte3 = T.nextInt();
	while(nte3 > 10){
		System.out.print("Nota invalida, digite novamente terceira nota (em inteiro):");
		nte3 = T.nextInt();
		}
	setNte3(nte3);
	T.nextLine();
	System.out.println();
}
public void showDisciplinDates(){
	System.out.print("Notas na disciplina "+this.Disciplinae+":  ");
	System.out.println("["+this.nte1+"]"+","+"["+this.nte2+"]"+","+"["+this.nte3+"]");
	System.out.print("Media na disciplina "+this.Disciplinae+":  ");
	System.out.println("["+getMedianae()+"]");
System.out.print("Situacao na disciplina "+this.Disciplinae+".:  ");
if(getMedianae() <6 ){
System.out.println("REPROVADO");
}else if(getMedianae() >= 6 && getMedianae() <7){
System.out.println("PROVA FINAL");
    }else if(getMedianae() >= 7 ){
System.out.println("APROVADO");
         } 
         System.out.println();
	 }
	
	private String[][] TABL = new String[14][20];
public void lendoTabl(){
	for(int i=0;i<14;i++){
		for(int j=0;j<20;j++){
			TABL[i][j]=" ";
			TABL[12][j]="-";
			TABL[i][3]="|";
			}
		}
	}

public void relendoTabl(){
	
	for(int i=0;i<14;i++){
		for(int j=0;j<20;j++){
			TABL[i][j]=" ";
			TABL[12][j]="-";
			TABL[i][3]="|";
			TABL[12-nte1][7]   = "+";
			TABL[12-nte2][12]  = "+";
			TABL[12-nte3][17]  = "+";
			if(i> (12-nte1)){
			TABL[i][7]  = "|";
		     }
		 if(j<=7 && j>=3){
			TABL[(12-nte1)][j] = "-";
		     }
		     if(i> (12-nte2)){
			TABL[i][12]  = "|";
		     }
		  if(j<=12 && j>=3){
			TABL[(12-nte2)][j] = "-";
		     }
		     if(i> (12-nte3)){
			TABL[i][17]  = "|";
		     }
		  if(j<=17 && j>=3){
			TABL[(12-nte3)][j] = "-";
		     }
		    TABL[13][6]   = "N";
			TABL[13][7]   = "1";
			TABL[13][11]  = "N";
			TABL[13][12]  = "2";
			TABL[13][16]  = "N";
			TABL[13][17]  = "3";
			TABL[12-nte1][2]  = Integer.toString(nte1);
			TABL[12-nte2][2]  = Integer.toString(nte2);
			TABL[12-nte3][2]  = Integer.toString(nte3);
			}
		}
	}	
public void escrevendoTabl(){
	for(int i=0;i<14;i++){
		for(int j=0;j<20;j++){
			System.out.print(TABL[i][j]);
			}
			System.out.println();
		}
	}
	
}

public class Matrizado {
	
	public static void main (String args[]) {
		Scanner T = new Scanner(System.in);
		System.out.println("Quantidade de alunos:");
		int tam = T.nextInt();
		T.nextLine();
		System.out.println("Quantidade de disciplinas por aluno:");
		int tem = T.nextInt();
		T.nextLine();
		Estudante[] est = new Estudante[tam];
		Disciplinando[] desc = new Disciplinando[tem];
		for(int i=0;i<est.length;i++){
		  
			est[i] = new Estudante();
			}
			
		    for(int j=0;j<desc.length;j++){
			
			desc[j]= new Disciplinando();
			}
	
		for(int i=0;i<est.length;i++){
			System.out.println("Aluno posicao: "+(i+1));
			est[i].insertStudenteDates();
			 for(int j=0; j< desc.length;j++){
			 System.out.println("inserindo dados da disciplina  "+(j+1));
		          desc[j].insertProfeDates();
		          desc[j].insertDisciplinDates();
	}
	}
		String epc;
		
			System.out.println("Alunos do curso:");
			for(int i=0; i<est.length;i++){
				System.out.println((i+1)+" - "+est[i].getAlunoe());
				}
	System.out.print("Digite seu nome (nao existindo retorna vazio):  ");
	String nomisc = T.nextLine();
	
	 for(int i=0;i<est.length;i++){
		 if(nomisc.equals(est[i].getAlunoe())){ 
	System.out.println("*********************** BEM-VINDO   "+est[i].getAlunoe()+"!!!!!!");
	do{
	System.out.println("Disciplinas disponiveis para "+est[i].getAlunoe()+" :");
	
		System.out.println();
	   for(int j=0; j<desc.length;j++){
			System.out.println((j+1)+" - "+desc[j].getDisciplinae());
		}
		System.out.println("Escolha uma disciplina acima:");
	String descipla = T.nextLine();
	
	
		for(int j =0; j< desc.length;j++){
			
			
	        if(descipla.equals(desc[j].getDisciplinae())){
	
		desc[j].relendoTabl();
		desc[j].escrevendoTabl();
		desc[j].showProfeDates();
		desc[j].showDisciplinDates();
	                 } 
				 }
				 System.out.print("Continuar pesquisa? (s/n).............: ");
				 epc = T.nextLine();
				 System.out.println();
				 }while(epc.equalsIgnoreCase("s"));
            }
		}
		
System.out.println("----------------------------Fim da Consulta----------------------------");
		T.close();
	}
}	
		
         




