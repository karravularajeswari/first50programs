package my.movie;

public class Tolly extends Movies{
	 public String name;
	 public void run()
	 {
		 System.out.println("movie is running");
	 }

	public Tolly(String name,int rating, float budget, int duration)
	{
		super(rating, budget, duration);
		this.name=name;
	}

}
