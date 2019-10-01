import java.util.LinkedList;
public class MilushPriorityQueue {
  
//create a new LinkedList for PriorityQueue
 private final LinkedList<QueueObject> list = new LinkedList<>();   
   

 //create a constructor
 MilushPriorityQueue()
 {
     
 }
 
 //create a function Insert that will insert items and priority
 void insert(String insert, int priority)
 {
     //insert item, followed by priority
     QueueObject test=new QueueObject(insert,priority);
     
     //add to list
     list.add(test);
     
     //call bubleSort to sort list in current order
     bubleSort();

 }
 //remove max, to remove top of element since order is from high to low
 void remove_max()
 {
     //call remove function
     list.remove();
     //call bubleSort to sort list in current order
     bubleSort();
 
 }
 //decrease function to decrease element's priority
 void decrease(String element, int priorityChange)
 {
     //check if list is empty
  if (list.isEmpty())
     {
     return;
     }
  //for loop to loop for elements in current list size
       for(int i=0;i<list.size();i++){
         
           //when elements is found, execute
         if(list.get(i).element.equals(element)){
           
             QueueObject temp=list.get(i);
             //change priority by current priorityChange
             temp.priority-= priorityChange;
        break;
         }
     }
     //call bubleSort to sort list in current order 
     bubleSort();
 }
 //function to increase item's priority
 void increase(String element, int priorityChange)
 {
     //check if list is empty
     if (list.isEmpty())
     {
     return;
     }
     //loop to find element
       for(int i=0;i<list.size();i++){
         
           //if element is found
         if(list.get(i).element.equals(element)){
             QueueObject temp=list.get(i);
             //change priority to priority + priorityChange
             temp.priority+= priorityChange;
             break;
             
         } 
         
     
     }
       //call bubleSort to sort list in current order
       bubleSort();
 }
 //swap function to swap current elements
 void swapValues(int indexOne, int indexTwo)
 {
     //swap object's indexes, between 1 and 2
 QueueObject temp=list.get(indexOne);
 //remove index
 QueueObject temp2=list.remove(indexTwo);
 //add index to complate swap
 list.add(indexOne,temp2);
 }
 //a regular bubleSort() algorithm to sort priority from high to low
 void bubleSort()
 {
     //set up loops to sort from high to low, not the oposite as usual
 for(int i=list.size()-1;i>=1;i--)
 {
 for (int j=0;j<i;j++)
 {
 if(list.get(j).priority<list.get(j+1).priority)
 {
 //call function to swap values
 swapValues(j,j+1);
 }
}
}
}      
 
 //display items
 void display()
 {
 //convert displayed functions into readable values       
 System.out.println(list.toString());
 
 }

 //create an Object class
class QueueObject
{
//set up element input, in our case we need a string to display message and integer to display priority
String element;
int priority;

QueueObject(String o, int p){

    //correctly set up this function
    this.priority=p;
    this.element=o;
}
 @Override
 //convert into readable values using toString() function
    public String toString()
    {
        return priority + " "+ element;
    }
}

}

