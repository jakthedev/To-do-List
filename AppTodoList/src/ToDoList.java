import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ToDoList {

	String topic;
	List<Task> tasks = new ArrayList<>();

	public ToDoList(String topicName) {
		topic = topicName;
	}

	//below, implement the methods provided in the UML diagram
	//I provided the task creation and the task creation methods

	//implement boolean method for assignTask, assignDeadLine
	//display, markAsDone, removeTask and renameTask

	
	/** display displays the topic of the list 
	 * and each task order and description 
	 * @param taskName
	 */
			public void display() {
		if(this.tasks.size()==0) { 
			System.out.println("The To Do List for " + tasks + "has nothing in it!" );
		}else { 
			System.out.println("Here is our Todo List for " + topic); 
			for(int i=0; i<this.tasks.size();i++) {
				System.out.println("Task " + i + " is " + this.tasks.get(i));
			} 
		} 
	}
			
			public void assignTask(String taskName, String employee) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter task name");
				String name = sc.nextLine();
				System.out.println("Please enter employee name");
				String empname = sc.nextLine(); 
				if(name != taskName) { 
					System.out.println("Task Name Not Found");
					}
				if(empname != employee) { 
				    System.out.println("Employee name not Found"); 
				    }else 
				System.out.println("Enter deadline you wish to assign to task & employee"); 
				System.out.println("Please enter your date in the format dd/MM/yyyy");
				Scanner scanner = new Scanner(System.in); 
				Date d = null;
				try {
					d = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
				} catch (ParseException e) {
					e.printStackTrace();
				}
                    Task t = new Task();
					t.setName(name);
					t.setEmployee(empname);
					t.setDeadLine(d);
					tasks.add(t);
					System.out.println("Dead line successfully added."); 
			} 
			public void assignDeadLine(String taskName, Date dueDate) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter task name");
				String name = sc.nextLine(); 
				
				if(name != taskName) { 
					System.out.println("Task Name Not Found");
					}else
				System.out.println("Enter deadline you wish to assign to task & employee"); 
				System.out.println("Please enter your date in the format dd/MM/yyyy"); 
				Scanner scanner = new Scanner(System.in);
				Date date = sc1.nextLine();
				try {
					date = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
				} catch (ParseException e) {
					e.printStackTrace();
				}
                    Task t = new Task();
					t.setName(name);
					t.setDeadLine(dueDate);
					tasks.add(t);
					System.out.println("Dead line has been successfully assigned."); 
			 }
			public void createTask(String newTask) {
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Please enter task name");
		      String name = sc.nextLine();
		      System.out.println("Please enter employee name");
		      String empname = sc.nextLine();
		      System.out.println("Please enter due date");
		      System.out.println("Please enter your date in the format dd/MM/yyyy");
		      Scanner scanner = new Scanner(System.in);
		      Date d = null;
		    try {
			d = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
		    } catch (ParseException e) {
			e.printStackTrace();
		    }
                    Task t = new Task(name);
		            t.setName(name);
		            t.setDeadLine(d);
		            t.setEmployee(empname);
		            tasks.add(t);
		            System.out.println("Task added successfully.");
			} 
			public void markAsDone(String taskName) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter task name");  
				String name = sc.nextLine(); 
				
				Task m = new Task(); 
				String Task(name);
				m.isDone();
				tasks.add(m); 
				System.out.println("Task " + name + " is mark has done");
			}
			
			public void removeTask(String taskName) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter task name");  
				String name = sc.nextLine(); 
				
				this.tasks.remove(taskName);
				System.out.println("This tasks has been successfully removed");
				
			}
			 public void renameTask(String oldName, String newName) {
				 Scanner sc = new Scanner(System.in);
			     System.out.println("Please enter task name");
			     String name = sc.nextLine();
			     System.out.println("Please enter new task name");
			     String replacement = sc.nextLine();
			     String where; 
			     this.tasks.indexOf(name); 
			     name = where; 
			     Integer.parseInt(where);
			     Integer.parseInt(replacement); 
			     this.tasks.set(int where, replacement);
			     System.out.println("Task " + name + " as been renamed to " + newName);
			 }
			
			 pubic void addTask(String newTask) {
				 Scanner sc = new Scanner(System.in);
			     System.out.println("Please enter new task name");
			     String name = sc.nextLine();
			     System.out.println("Please enter new task name"); 
			     
			     Task a = new Task(); 
			     a.
			 }
			
			
			
			
			
			
			
			
			
			
}
