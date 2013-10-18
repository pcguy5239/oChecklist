//---------------------------------------------------------------------
package studentOrientation.orientation.activities.bookstore;
//---------------------------------------------------------------------
public class UnivBookstore extends AbstractBookstore
{
	/**
	*	Class constructor
	**/
	public UnivBookstore(int debugVal)
	{
		this.name = "University Bookstore";
		this.time = 8;
		this.effort = 97;

		calculate(0.00);

		if(debugVal == 2)
		{
			System.out.println(name +
				" constructor called");
		}
	}
	
	/**
	*	This is the overridden toString method for this class
	*	@return Returns the class details as a string
	**/
	@Override
	public String toString() 
	{
		return name+"- Time: "+time+" Cost: "+ cost 
			+" Calories: "+effort;
	}
}
//---------------------------------------------------------------------    
