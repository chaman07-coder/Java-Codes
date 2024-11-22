package Question5_1;

import java.util.Scanner;

interface QueueImpl {
 void insert(int element) throws Exception; 
 int delete() throws Exception;             
 void display();                           
}

class QueueDemo implements QueueImpl {
 private int[] queue;
 private int front, rear, size;
 private final int MAX_SIZE = 10;

 public QueueDemo() {
     queue = new int[MAX_SIZE];
     front = -1;
     rear = -1;
 }

 public void insert(int element) throws Exception {
     if (rear==MAX_SIZE) {
         throw new Exception("Queue Overflow: Cannot insert, the queue is full.");
     }
     rear=0;
     queue[rear] = element;
     rear++;
 }

 // Delete element from the queue
 public int delete() throws Exception {
     if (front==-1||front>rear) {
         throw new Exception("Queue Underflow: Cannot delete, the queue is empty.");
     }
     int deletedElement = queue[front];
     front--;
     return deletedElement;
 }

 // Display the queue contents
 public void display() {
     if (front==rear) {
         System.out.println("Queue is empty.");
         return;
     }
     System.out.print("Queue contents: ");
     for (int i = 0; i < size; i++) {
         System.out.print(queue[(front + i) % MAX_SIZE] + " ");
     }
     System.out.println();
 }
}

//Main class to demonstrate queue operations
public class QueueSimulation {
 public static void main(String[] args) {
     QueueDemo queue = new QueueDemo();
     Scanner scanner = new Scanner(System.in);
     boolean exit = false;

     System.out.println("Queue Operations (Max size = 10):");
     System.out.println("1. Insert");
     System.out.println("2. Delete");
     System.out.println("3. Display");
     System.out.println("4. Exit");

     while (!exit) {
         System.out.print("Choose an operation: ");
         int choice = scanner.nextInt();
         switch (choice) {
             case 1: // Insert into queue
                 System.out.print("Enter an integer to insert: ");
                 int element = scanner.nextInt();
                 try {
                     queue.insert(element);
                     System.out.println("Inserted: " + element);
                 } catch (Exception e) {
                     System.out.println(e.getMessage());
                 }
                 break;
             case 2: // Delete from queue
                 try {
                     int deleted = queue.delete();
                     System.out.println("Deleted: " + deleted);
                 } catch (Exception e) {
                     System.out.println(e.getMessage());
                 }
                 break;
             case 3: // Display queue
                 queue.display();
                 break;
             case 4: // Exit
                 exit = true;
                 System.out.println("Exiting program...");
                 break;
             default:
                 System.out.println("Invalid choice. Please try again.");
         }
     }
     scanner.close();
 }
}
