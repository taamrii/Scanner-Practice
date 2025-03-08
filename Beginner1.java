public class Main {
 
     public static void main(String[] args){
        //HYPOTENUSE c = Math.sqrt(a^2 + b^2)
        //Circumference = 2 * Math.PI * radius;
        //Area = Math.PI * Math.pow(radius , 2);
        //volume = (4.0 / 3.0) * Math.PI * Math.pow(radius , 3)
 
         Scanner scanner = new Scanner(System.in);
 
         double a;
         double b;
         double c;
         double radius;
         double circumference;
         double area;
         double volume;
 
         System.out.print("Enter the length of side A: ");
         a = scanner.nextDouble();
         System.out.print("Enter the radius: ");
         radius = scanner.nextDouble();
 
         System.out.print("Enter the length of side B: ");
         b = scanner.nextDouble();
 
         c = Math.sqrt(Math.pow(a , 2) + Math.pow(b , 2));
         System.out.print("The hypotenuse (side c) is: " + c + "cm");
         circumference = 2 * Math.PI * radius;
         area = Math.PI * Math.pow(radius , 2);
         volume = (4.0 / 3.0) * Math.PI * Math.pow(radius , 3);
 
 
         System.out.printf("The circumference is: %.1fcm\n", circumference);
         System.out.printf("The area is: %.1fcm^2\n", area);
         System.out.printf("The volume is: %.1fcm^3\n", volume);
 
         scanner.close();
     }
