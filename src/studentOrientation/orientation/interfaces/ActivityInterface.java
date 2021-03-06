//---------------------------------------------------------------------
package studentOrientation.orientation.interfaces;
//---------------------------------------------------------------------
/*
 *	This interface defines the basic methods
 *	 needed for an activity to exist
 */
public interface ActivityInterface
{
	//Method signature declarations
	public String getName();
	public int getTime();
	public double getCost();
	public int getEffort();

	public void setName(String name);
	public void setTime(int time);
	public void setCost (double cost);
	public void setEffort(int effort);
}
