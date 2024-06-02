public class Main     // The Class for testing RandomWalker
{
   public static void main(String[] args) // The Main method
   {
       RandomWalker R1 = new RandomWalker();
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the value of n");
       int n=s.nextInt();
       for(int i=0;i<n;i++){
       R1.move();
       }
       System.out.println("X : "+R1.getX()+" Y : "+R1.getY()+" Moves : "+R1.getSteps());
   }
}