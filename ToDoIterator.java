import java.util.Iterator;
/**
 * @author pattersonhowell
 * Base class for an Iterator
 */
public class ToDoIterator  {

	private ToDo[] todos;
	private int position;
	
	/**
	 * Initializing array of todos
	 * @param todos Array of todos
	 */
	public ToDoIterator(ToDo[] todos) {
		this.todos = todos;
	}
	
	/**
	 * Checks to see if there are more items to iterate over
	 * @return True if yes, False if no
	 */
	public boolean hasNext() {
		if(position >= todos.length || todos[position] == null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	/**
	 * Moves to next todo item if possible
	 * @return Next todo item or null if not possible
	 */
	public ToDo next() {
		if(hasNext()) {
			ToDo job = todos[position];
			position = position + 1;
			return job;
		}
		return null;
	}
}
