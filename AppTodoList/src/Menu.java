import java.text.ParseException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.UnaryOperator; 


public class Menu {

	
	static String topic;
	static List<Task> todoTask = new ArrayList<Task>();
	
	//provide your ToDoList object 
	//declare your ToDoList topic 
	
	public static void main(String[] args) {

		//The run function will start the menu on the output screen
		run();
	}

		//create your run function with the following menu items 
	private static void run() {

		boolean quit = false;
		String mainMenu = "" + "1. Add a topic\n" + "2. Select a topic\n" + "3. Assign Task\n" + "4. Assign deadline\n"
				+ "5. Create a task \n" + "6. Mark as done\n" + "7. Remove task \n" + "8. Rename task\n"
				+ "9. Display\n\n" + "10. Quit\n\n";
		while (!quit) {

			//The Scanner will input the user's choice
			Scanner input = new Scanner(System.in);
			System.out.println(mainMenu);
			int choice = input.nextInt();

			//you can any conditional statement (if/else or switch)
			//each case, will run the function
			switch (choice) {
			case 1:
				addTopic();
				break; 
			case 2: 
				pickTopic(); 
				break; 
			case 3: 
				assignTask();
				break;
			case 4: 
				assignDeadLine();
				break;
			case 5: 
				createaTask();
				break; 
			case 6: 
				markAsDone(); 
				break; 
			case 7: 
				removeTask(); 
				break; 
			case 8: 
				renameTask(); 
				break; 
			case 9: 
				display(); 
				break; 
			case 10: 
				quit(); 
				break;
			
				 //create a case for each menu option
			 
			default:
				System.out.println("Invalid entry try again");

			}
		}
		System.exit(0);

	}
    //implement the method for each case.  I have provided example code
	//for the first option, addTopic.
			
			 
	 		private static void addTopic() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter topic name");
			String name = sc.nextLine();
			
			ToDoList m = new ToDoList(name); 
			m.createTask(name);
			System.out.println(name + " has been added to the list!");
			return; 
			}

			
			private static void pickTopic() {
	 			Scanner sc1 = new Scanner(System.in);
				System.out.println("Please enter topic name");
				String pickName = sc1.nextLine();  
				 
				if (pickName == topic) {
					Task g = new Task(pickName); 
					g.getTask(pickName);
					g.getDeadLine(); 
					g.getEmployee(); 
					task.add(g); 
					
					System.out.println("you have selected " + topic + " !"); 
					System.out.println("Info about " + topic + " :" + g);
					return;
					}
	 		}
	 		
	 		private static void assignTask() {
	 			Scanner sc2 = new Scanner(System.in);
				System.out.println("Please enter topic name");
				String assignName = sc2.nextLine();  
				System.out.println("Please enter employee name"); 
				String emplyName = sc2.nextLine(); 
				
				Task p = new Task(); 
				p.getTask(assignName);
				p.setEmployee(emplyName);
				task.add(p);
				System.out.println(assignName + " has been assigned to " + emplyName + " !"); 
				return;
	 		}
	 		
	 		private static void assignDeadLine() {
	 			Scanner sc3 = new Scanner(System.in);
				System.out.println("Please enter topic name");
				String topicName = sc3.nextLine();  
				System.out.println("Please enter employee name"); 
				String emplyName = sc3.nextLine(); 
				Task o = new Task();
	 		    
				if(topicName != topic) { 
					System.out.println("Task Name Not Found");
					}else
				System.out.println("Enter deadline you wish to assign to task & employee"); 
				System.out.println("Please enter your date in the format dd/MM/yyyy"); 
				String date = sc3.nextLine(); 
			 	Date fDate = new SimpleDateFormat("dd/MM/yyyy").parse(date); 
			 			System.out.println(date + "/t" + fDate);
			 			System.out.println("Deadline was assgned to: " + topic + emplyName +
			 					" /at: " + fDate);  
			 			o.getTask(topic); 
			 			o.getEmployee();
			 			o.getDeadLine();
			 			task.add(o);
			 			return;
				
				 
			 } 
	 		
             private static void createaTask() {
            	Scanner sc4 = new Scanner(System.in);
 				System.out.println("Please enter topic name");
 				String newName = sc4.nextLine(); 
 				
 				Task k = new Task(); 
 				
 				k.getTask(newName); 
 				task.add(k); 
 				return;
 				
 				
 			 }
               
             private static void markAsDone() {
            	Scanner sc4 = new Scanner(System.in);
  				System.out.println("Please enter topic name");
  				String taskToBeDone = sc4.nextLine(); 
  				
  				if (taskToBeDone.equals(topic)) {
  					Task m = new Task(); 
  					m.getTask(topic);
  					m.isDone();  
  					task.add(m);
  					return;
  				}
             }
             
             
			private static void removeTask() {
            	Scanner sc4 = new Scanner(System.in);
 				System.out.println("Please enter task name you wish to delete");
 				String deletedName = sc4.nextLine();
 				
 				if (task.equals(deletedName)) {
 					task.remove(deletedName);
 					System.out.println(deletedName + " has been deleted from the ToDo List!");
 					
 				} else {
 					return;
 				} 
			}
 				
 			 private static void renameTask() {
 				Scanner sc1 = new Scanner(System.in);
 				System.out.println("Please enter topic name");
 				String oldName = sc1.nextLine();  
 				System.out.println("Enter name you want the topic name to be changed to"); 
 				String newName = sc1.nextLine();
 				
 				Task c = new Task(); 
 				c.replace(oldName, newName);
 				return;
 				
 				 
 			}
          
 			public static void display() {
 				
 				
 				if(task.size()==0) { 
 					System.out.println("The To Do List for " + task + "has nothing in it!" );
 				}else { 
 					System.out.println("Here is our Todo List for " + topic); 
 					for(int i=0; i<task.size();i++) {
 						System.out.println("Task " + i + " is " + task.get(i));
 						return;
 					}    
 				}
 				
 				
 				//for (Task strings : task) {
 					//System.out.println(strings); 
 					//return;
 				//}
 			}
 				
 			public static void quit() { 
 				Scanner sc1 = new Scanner(System.in);
 				System.out.println("Are you sure you want to quit Application?");
 				String answer = sc1.nextLine(); 
 				
 				if (answer == ("yes|Yes|YES|YES!")) {
 					System.out.println("Bye thanks for using me!"); 
 					System.exit(0);
 				}
 				
 				
 			}
 			
 				
 				
 				
			
 			
             

	 		

}

