//remember to import the ToDoList class
import org.junit.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner; 

public class Test {

	String topic;
	List<Task> tasks = new ArrayList<>();
	
	public static void main(String[] args) {
		Test t = new Test();
		//this calls a method that runs all of the tests you will implement
		t.testCreateTask(); 
		return;
	}
	
	public void should_assign_task_to_employee() {
		//List<Task> tasks = new ArrayList<>(); 
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter task name ");
		String name = sc.nextLine();
		
		for(int i = 0; i < tasks.size(); i++)
		{
			if (tasks.contains(name)){
				this.tasks.get(i);
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Please enter employee name ");
				String employee = sc1.nextLine();
				this.tasks.lastIndexOf(employee);
				return;
		}
	} 
}
			
	public void should_assign_deadline_to_task() {
		//List<Task> tasks = new ArrayList<>();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("What task do you want to assign a deadline to?");
		String taskAssigny = sc2.nextLine();
		
		if (tasks.contains(taskAssigny)) {
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Please enter the date of the deadline in dd/MM/yyyy"
					+ " format?");
			String deadlineDate = sc3.nextLine(); 
			
			Date dl = new SimpleDateFormat("dd/MM/yyyy").parse(deadlineDate);
			//*long date = dl.parse(deadlineDate);
			if (dl.compareTo(Date deadlineDate))) {
				
			Task d = new Task(taskAssigny);
			ArrayList l = new ArrayList();
			d.getName(); 
			d.setDeadLine(dl); 
			l.add(d);
			return;
			}
		}
	} 
	
	public void should_create_task() {
		

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
	
	

	public void should_create_task_in_todolist() {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter new task name?");
		String newTask_n = sc2.nextLine();
		
		if (tasks.contains(newTask_n)) {
		System.out.println("Task is already on Todo List!");
	} else {
		tasks.add(0, newTask_n); 
		return;
	} 
		
	public void should_mark_task_done_on_todolist() {
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Enter new task name?");
		String task = sc4.nextLine(); 
		System.out.println("Is this task done"); 
		String answer = sc4.nextLine(); 
		
		if (answer == "yes || Yes || YES " && tasks.contains(task)) {
			Integer.toHexString(System.identityHashCode(tasks)); 
			
			Task d = new Task(); 
			d.isDone();
			return;
		}
	} 
	
	public void should_remove_task_from_todolist() {
		Scanner sc5 = new Scanner(System.in);
		System.out.println("What task do you want to delete?");
		String deletedTask = sc5.nextLine(); 
		
		ArrayList r = new ArrayList(); 
		r.remove(deletedTask);
		return;
}
	public void should_rename_task() {
		Scanner sc5 = new Scanner(System.in);
		System.out.println("What task do you want to rename?");
		String deletedTask = sc5.nextLine(); 
		System.out.println("What is the new name?");
		String newtaskName = sc5.nextLine(); 
		
		if (tasks.contains(deletedTask)) {
			String temp = deletedTask; 
			deletedTask = newtaskName; 
			newtaskName = temp; 
			return;
		}
	}
	
	public void should_assign_deadline_to_task() {
		Scanner sc6 = new Scanner(System.in);
		System.out.println(" What task do you want to assign a deadline to? ");
		String deletedTask = sc6.nextLine();
		System.out.println("Please enter your date in the format dd/MM/yyyy"); 
		Scanner scanner = new Scanner(System.in);
		Date date = sc6.nextLine();
		try {
			date = new SimpleDateFormat("dd/mm/yyyy").parse(scanner.nextLine());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
		
		String name = sc.nextLine(); 
		Task namef = new Name();
		namef = name;
		
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Please return employees name ")
		
		public class TaskTodo {
			
			private String name;
			private String emplyname;
			
			
		}
		
		
	}

	//Here is an example of the test for adding a task.  
	private void testCreateTask() {

		System.out.println("Adding elements to the list");
		Task. ("String 1");
		ToDoList.createTask("String 2");
		ToDoList.createTask("String 3");

		if (ToDoList.tasks.size() != 3) {
			System.out.println("Create Task test is success!!");
		} else {
			System.out.println("Create Task test is fail!!");
		}

	}

	//implement methods to test all of the methods in ToDoList class
	//implement a method called testAll to run each method in your Test class
}
