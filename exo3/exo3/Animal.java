
abstract class Animal implements Domestique {
	
	public String crier ;
	public String getCrier()
	{
		return crier ;
	}
	public void setCrier (String crie)
	{
		this.crier = crie;
	}
	public String manger ;
	
	public String getManger()
	{
		return manger ;
	}
	public void setManger (String mange)
	{
		this.manger = mange;
	}
	public String seReproduire ;
	public String getSeReproduire()
	{
		return seReproduire ;
	}
	
	
	
	public void setReproduire (String reproduit)
	{
		this.seReproduire = reproduit;
	}
	public string utilite()
	{
		return utilite ;
	}

}
