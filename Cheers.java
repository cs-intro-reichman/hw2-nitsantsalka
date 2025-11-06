//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	  String name = args[0];
          name = name.toUpperCase();
          int times = Integer.parseInt(args[1]);
          int i = 0;
          int n = 0;
          char letter;
          String anLetter = "AEFHILMNORSX";
          while (i < name.length()){
                letter = name.charAt(i);
                if (anLetter.indexOf(letter) >= 0)
                {
                     System.out.println("give me an " + letter +": " + letter + "!");   
                }
                else{
                     System.out.println("give me a " + letter +": " + letter + "!");
                }
                i++;
          }  
          System.out.println("What does that spell?");
          while (n < times){
                System.out.println(name + "!!!");
                n++;
          }
        }
}
