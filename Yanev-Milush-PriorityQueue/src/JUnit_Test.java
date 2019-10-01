
class JUnit_Test
{
    public static void main(String[] args)
    {
        //create new queue
        MilushPriorityQueue queue = new MilushPriorityQueue();
        
        //display message about rules of program
        System.out.println("Add 20 Numbers, followed by their priority and Sort them from max to min");
        System.out.println("");
        
        //add numbers from 1-20 using random place add function
        
        queue.insert("one", 1);
        queue.insert("two", 2);
        queue.insert("three", 3);
        queue.insert("eight", 8);
        queue.insert("nine", 9);
        queue.insert("ten", 10);
        queue.insert("four", 4);
        queue.insert("five", 5);
        queue.insert("six", 6);
        queue.insert("seven", 7);
        queue.insert("eleven", 11);
        queue.insert("twelve", 12);
        queue.insert("fifteen", 15);
        queue.insert("sixteen", 16);
        queue.insert("seventeen", 17);
        queue.insert("eighteen", 18);
        queue.insert("nineteen", 19);
        queue.insert("twenty", 20);
        queue.insert("thirteen", 13);
        queue.insert("fourteen", 14);
        
        //display sorted list
        queue.display();
        System.out.println("");
        
        //display message for removing 5 maximum elements from top of list
        System.out.println("Remove 5 maximum element from the list and display sorted List");
        queue.remove_max();
        queue.remove_max();
        queue.remove_max();
        queue.remove_max();
        queue.remove_max();
        
        //display sorted list
        queue.display();
        System.out.println("");
        
        //display message for random decrease in priority and rules
        System.out.println("Now we are going to decrease element's priority");
        System.out.println("We will choose random numbers with random decrease and display them in priority order");
        System.out.println("Four - 3, Fifteen - 8, Ten -4, Seven -6, Eleven -2");
        System.out.println("");
        
        //random decrease "Number" priority
        queue.decrease("four",3);
        queue.decrease("fifteen",8);
        queue.decrease("ten",4);
        queue.decrease("seven",6);
        queue.decrease("eleven",2);
        queue.display();
        System.out.println("");
        
        //display message for random increase in priority and rules
        System.out.println("Now we are going to increase element's priority");
        System.out.println("We will choose random numbers with random increase and display them in priority order");
        System.out.println("One +18, Twelve +6, Five +7, Four +3, Eight +1");
        System.out.println("");
        
        //random increase "Number" priority
        queue.increase("one", 18);
        queue.increase("Twelve", 6);
        queue.increase("five", 7);
        queue.increase("four", 3);
        queue.increase("eight", 1);
        
        //display sorted lisst
        queue.display();
        System.out.println("");
      
    }
    
}

