import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Task {

	//variable name suggestions
	private String name;
	private String sDescription;
	private Date deadLine;
	private String employee;
	private boolean isDone;
	private String tasks;  
	static List<Task> todoTask = new ArrayList<Task>();
	int sId = todoTask.size();

	public Task(String description) {
		sDescription = description; 
	}
	
	public String getdescription() {
		return sDescription;
	}

	public boolean isDone() {
		return isDone;
	}
	
	public static List<Task> all() {
		return todoTask;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void clear() {
		todoTask.clear();
	}
	
	public int getId() {
		return sId;
	}
	
	public static Task find(int id) {
		return todoTask.get(id - 1);
	}
	
	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	} 
	
	public String getEmployee() {
		return employee;
	} 
	
	public void setEmployee(String employee) {
		this.employee = employee;
	} 
	
	
		
	

	//create get and set methods for the DeadLine and Employee 
	//similar to how get and set Name are created
	//pay attention to how the datatype of the variables are declared 
 

	@Override
	public String toString() {
		return "Task name = " + sDescription + " , employee = " + employee + " , deadline = " + deadLine + ", Done = " + isDone;
	}
 
	
	public void replace(String oldName, String newName) {
		this.tasks.replaceAll(oldName, newName);
	}

	

	
		// TODO Auto-generated method stub
		
	}

			


	