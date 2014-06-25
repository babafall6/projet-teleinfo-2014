package heritage;

public class etudiant {
	private int idEtudiant;
	private String nomMat;
	
	
	public etudiant(String nomMat,int idEtudiant)
	{
		this.nomMat = nomMat;
		this.idEtudiant = idEtudiant;
	}

	public void faireCours(String nomMat)
	{
		System.out.println("l'etudiant " + " " + idEtudiant + " " + "fait la matiere " + nomMat );	
	}
	
	public void subirEvaluations(String nomMat)
	{
		System.out.println("l'etudiant " + " " + idEtudiant + " " + "subit l'evaluation " + nomMat );	
	}
	
	public int getidEtudiant()
	{
		return idEtudiant;
	}
	
	public void setidEtudiant(int idEtudiant)
	{
		this.idEtudiant = idEtudiant;
	}
	
	public String getnomMat()
	{
		return nomMat;
	}
	
	public void setnomMat(String nomMat)
	{
		this.nomMat = nomMat;
	}	
	
}
