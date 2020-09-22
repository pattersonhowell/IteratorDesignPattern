import java.util.ArrayList;
/**
 * @author pattersonhowell
 * Base class for a contractor's todo list
 */
public class ContractorToDoList {
	private static final int MAX = 2; //max size of array
	private double projCost; //holds the totalCost

	private String address;
	private ToDo[] todos;
	private int count;
	
	/**
	 * Creates array of size 2 and sets the address of the house this is for
	 * @param address Location of the house this todo list is for
	 */
	public ContractorToDoList(String address) {
		todos = new ToDo[MAX];
		this.address = address;
	}
	
	/**
	 * Adding things (jobs) to do to array of todos
	 * @param title General topic of what job needs to be done
	 * @param description Describes the details of the job
	 * @param price Cost of this job
	 * @param contact Name of person to contact about this job
	 * @param supplies List of supplies needed to complete this job
	 */
	public void addToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		ToDo task = new ToDo(title, description, price, contact, supplies);
		if(count >= todos.length) {
			todos = growArray(todos);
			todos[count] = task;
		}
		else {
			todos[count] = task;
			count = count + 1;
		}
	}
	
	/**
	 * Creating an iterator to use
	 * @return a new ToDoIterator
	 */
	public ToDoIterator createIterator() {
		return new ToDoIterator(todos);
	}
	
	/**
	 * Getting the address of house
	 * @return The address of house
	 */
	public String getAddress() {
		return this.address;
	}
	
	/**
	 * Getting the total cost of completing all todo jobs in list
	 * @return The total cost of completing all todo jobs in list
	 */
	public double getTotalCost() {
		for(int i = 0; i < todos.length; i++) {
			if(todos[i] != null) {
				projCost += todos[i].getPrice();
			}
		}
		return projCost;
	}
	
	/**
	 * Growing array to twice the size of original array with the same data
	 * @param todos Original array
	 * @return Array of double the original size with the same data
	 */
	private ToDo[] growArray(ToDo[] todos) {
		ToDo[] newToDoList = new ToDo[todos.length * 2];
		for(int i = 0; i < todos.length; i++) {
			newToDoList[i] = todos[i];
		}
		todos = newToDoList;
		return todos;
	}
	
}

