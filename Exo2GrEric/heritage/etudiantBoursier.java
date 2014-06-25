package heritage;

public class etudiantBoursier extends etudiant {
	private float tauxBourse;	
	
	
	public etudiantBoursier(int idEtudiant,String nomMat,float tauxBourse)
	{
		super(nomMat,idEtudiant);		
		this.tauxBourse = tauxBourse;		
	}

	public void percevoirBourse()
	{
		System.out.println("L'etudiant boursier" + " " + this.getidEtudiant() + " " + "percoit le taux de bourse"+ " " + this.tauxBourse + " " + "%");
	}
	
	public float gettauxBourse()
	{
		return tauxBourse;
	}
	
	public void settauxBourse(float tauxBourse)
	{
		this.tauxBourse = tauxBourse;
	}
}
