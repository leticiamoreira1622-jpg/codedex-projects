import java.util.Scanner;
public class GameProject{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("You've been kidnapped by a time traveller.");
    System.out.println ("After a long talk, you've been comunicated that you have two options:");
    System.out.println("1 - Stay in this new world, never coming back home.");
    System.out.println("2 - Try to come back, but your memory will be permanently erased.");
    System.out.println("What you choose? ");
    int option = scanner.nextInt();
    
    if (option == 1) {
      System.out.println("You're staying then, good!");
      System.out.println("You were invited to know new people from the time traveller community.");
      System.out.println("After a talk, you find out that you might become a time traveller too if you allow the community to teach you.");
      System.out.println("But the training season might be hard and traumatic, even though it allows you to live in any reality for a limited time.");
      System.out.println("You allow it? ");
      System.out.println ("1 - Yes, i want to become a time traveller! ");
      System.out.println ("2 - No, I prefer to continue as lost person. ");
      int secondOption = scanner.nextInt();
      
      if (secondOption == 1) {
        System.out.println("You became a sucessfull time traveller, but lonely.");
        System.exit(0);
      }
      else if (secondOption == 2) {
        System.out.println("You became an useless person, what made some time travllers mad, so you were kicked out of the community and ended alone.");
        System.exit(0);
      }
      else{
        System.out.println("You died due to your lack of decisive choice. The community isn't for confused people.");
        System.exit(0);
      }
    }
    else if (option == 2) {
      System.out.println("You came back, but you don't remember anything. Some stranger comes to you and says that she's your mother.");
      System.out.println("You believe her? ");
      System.out.println("1 - Yes, she might be my mother.");
      System.out.println("2 - No, what if she's just a crazy woman?");
      int motherOption = scanner.nextInt();
      if (motherOption == 1) {
        System.out.println("She wasn't your mother, she took you to a psychological clinic where you stayed until your death.");
        System.exit(0);
      }
      else if (motherOption == 2) {
        System.out.println("You never found your mother, and never knew if this woman was your mother, but lived a good life.");
        System.exit(0);
      }
      else{
        System.out.println("You're insane and hallucinated this woman, she never existed.");
        System.exit(0);
      }
    }
    else{
      System.out.println("You've been in timelines, lost since then. Never died, but became a hollow creature, insane because of your own loneliness.");
      System.exit(0);
    }
    scanner.close();
  }
}
