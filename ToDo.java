import java.util.ArrayList;
/**
 * @author pattersonhowell
 * Base class for any todo job
 */
public class ToDo {
	private String materials = ""; //help format list of supplies
	
	private String title;
	private String description;
	private double price;
	private String contact;
	private ArrayList<String> supplies;
	
	/**
	 * Sets all details of the todo job 
	 * @param title General topic of what job needs to be done
	 * @param description Describes the details of the job
	 * @param price Cost of this job
	 * @param contact Name of person to contact about this job
	 * @param supplies List of supplies needed to complete this job
	 */
	public ToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.contact = contact;
		this.supplies = supplies;
	}
	
	/**
	 * Getting the price of todo
	 * @return Price of todo
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Displays everything about the todo job 
	 */
	public String toString() {
		for(int i = 0; i < supplies.size(); i++) {
			materials += "- " + supplies.get(i) + "\n";
		}
		return "\n***** " + title + " *****\n" + description + "\nBusiness Contact: " + contact + "\nSupply List: \n" + materials + "Price: $" + price;
	}
	
}
