package devinerValeurRandom;

public class Deviner {
	private int nombreMyster;
	public Deviner()
	{
		this.nombreMyster=nombreMyster();
	}
	public boolean devineNombre(int nombre){
		
		if(nombre==this.nombreMyster)
			return true;
		else
		return false;
		
		
	}
	public int getnombreMyster()
	{
		return this.nombreMyster;
	}
	private int  nombreMyster()
	{
		return  (int)(Math.random()*10);
	}

}
