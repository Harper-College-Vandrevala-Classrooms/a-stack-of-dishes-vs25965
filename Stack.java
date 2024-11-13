

public class Stack {

    public void push (Dish[] array, Dish objDish, int[] count){
        if (count[0] < array.length) { // Check if there's space in the array
        array[count[0]] = objDish; // Add the new dish
        count[0]++; // Increment the count
        }
      else
         {
         System.out.println("Array is full! Stack overflow...Dish:" + objDish + " cannot be added\n");
         }
     // Return the updated count
    }
    public void pop(Dish[] array, int[] count) {
        if (count[0] > 0) {
            count[0]--; // Decrement the count
            array[count[0]] = null; // Remove the last dish (set to null)
        } else {
            System.out.println("Array is empty! Cannot remove any dishes.");
        }
    }

    public int size(Dish[] array) {
        int currentSize = 0;
        for (Dish dish : array) {
            if (dish != null) {
                currentSize++; // Count non-null elements
            }
        }
        return currentSize; // Return the current size
    }

    public void peek(Dish[] array, int[] count){
    if (count[0] > 0) {
        System.out.println("Last element in the array: " + array[count[0] - 1]);
    } else {
        System.out.println("Array is empty! No last element to display.");
    }
   }
}