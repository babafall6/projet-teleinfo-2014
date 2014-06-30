import java.util.*;
import java.lang.*;
public class Exercice2 {
	
		public class Etudiant
		{
			private int idEtudiant;
		    //private String matiere;
			//super(idEtudiant);
		    
			public Etudiant (int idEtudiant){
				this.idEtudiant=idEtudiant;
			}
			public int getId(){
				return idEtudiant;
			
			}
			public Etudiant (){}

			public void faireCours(String matiere)
            {
             String mat = matiere;
             System.out.println (" je fais un cour sur: " +mat); 
                          
            }
			public void subirEvaluation (String matiere)
            {
				String mat = matiere;
	             System.out.println (" je fais une evalution sur: " +mat);             
            }				
		}
		
		public class EtudiantBoursier extends Etudiant
		{

			private  double tauxBourse;
			public EtudiantBoursier(int idEtudiant, double tauxBourse)
			{
				super(idEtudiant);
				this.tauxBourse=tauxBourse;
				//
	        }
			
			public void percevoirBourse()
			{								
				System.out.println ("Taux de la bourse:"+tauxBourse);
			}			
		}
		public void main(String[] args) {
			
			Etudiant e = new Etudiant(1);
			EtudiantBoursier eb = new EtudiantBoursier (1, 0.5);
			
		}
			
}
