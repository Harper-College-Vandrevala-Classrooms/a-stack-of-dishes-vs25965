

public class Main {

       public static void main(String[] args) {

        int[] count = {0}; 
        Dish[] DishArray = new Dish[7];
        Stack obj = new Stack();
        System.out.println("Size of array with no objects in it");
        System.out.println("Current size: " + obj.size(DishArray));

        Dish dish1 = new Dish("plastic dish");
        Dish dish2 = new Dish("Glass dish");
        Dish dish3 = new Dish("Black dish");
        Dish dish4 = new Dish("white dish");  
        Dish dish5 = new Dish("B dish");
        Dish dish6 = new Dish("C dish");
        Dish dish7 = new Dish("D dish");
        Dish dish8 = new Dish("M dish");

       
         obj.push(DishArray,dish1,count);
         obj.push(DishArray,dish2,count);
         obj.push(DishArray,dish3,count);
         obj.push(DishArray,dish4,count);
         obj.push(DishArray,dish5,count);
         obj.push(DishArray,dish6,count);
         obj.push(DishArray,dish7,count);
         obj.push(DishArray,dish8,count);
         System.out.println("Size of array after adding 7 objects.");
         System.out.println("Current size: " + obj.size(DishArray));
        for (Dish dish : DishArray) {
            System.out.println(dish); // Calls the toString() method
        }
        obj.pop(DishArray,count);
        System.out.println("Size of array after removing the last object.");
        System.out.println("Current size: " + obj.size(DishArray));
        obj.peek(DishArray, count);
    }
    }
