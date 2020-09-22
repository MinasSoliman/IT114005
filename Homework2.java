//Minas Soliman
//Homework 2
public class Homework2 {
	public static void main(String[] args) {
   
      int[] array = {1, 2, 3, 4, 5};
      int num;
      
      for (int i = 0; i < array.length; i++) {
         num = array[i];
         if(num % 2 == 0){
            System.out.println(num); 
            }
        }

   }
}
      
/*The code starts by making an array of 5 integers, then there
is a num variable which is also an integer, that will come into 
play later in the code. The first for loop goes through each 
postion in the array starting with 0 all the way 
to the end of the array.
Each time it looks at a position the next line assings 
the variable num to the actual integer in that position
the second if statment makes it so that the integer being called 
will only print if when devided by two the remainder is zero thus 
even only those will be printed.*/ 


 