import java.util.Scanner;

public class ChatBox {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        greeting();
        
        String name = nameAgain();
        
        String president = age();
        
        double numOne = count();
        multiQuestion();
        story(name, numOne, president);
    }
    public static void greeting() {
        System.out.println("Good day to you, kind person. My name is Stapler Johnson.\nI am a wizard from Vermont. In my spare time I guzzle maple syrup from the tress in the forest.\nTo whom do I owe the pleasure?");
    }
    public static String nameAgain() {
        String name = scanner.nextLine();
        System.out.println("Oh forgive me, I thought I heard you say " + name + "DonCheadle.\nI do be an old wizard out here vibing with syrup and suffering from indigestion.\nCan you repeat your name?");
        return name;
    }
    public static String age() {
        String name2 = scanner.nextLine();
        System.out.println("Oh, that's more like it.\n" +name2+ ", what a pretty name.\nAnyways, let's try and guess your age?\nWho was president when you graduated high school?\nPlease enter any of the following (in exact text): Reagan, BushSr, Clinton, BushJr, Obama, Trump or Biden");
        String president = scanner.nextLine();
        if (president.equalsIgnoreCase("Reagan")) {
            System.out.println("\n Ah yes, Reagan, a known humanitarian who did not all do anything bad. Nope.\nYou are between the ages of 51-60 years old. Who let you out of the nursing home.\nLet's narrow this down. Were you in high school for the Challenger Explosion Explosion (1986)? Yes or No.");
            String challenger = scanner.nextLine();
            if (challenger.equalsIgnoreCase("Yes")) {
                System.out.println("I'm done guessing. We can safely assume you are somewhere between 51-54 years old.\nRetirement is right around the corner for you!");
            }
            else if (challenger.equalsIgnoreCase("no")) {
                System.out.println("Oh great heavens. You are in your 60s (55-60 years old).\nRetirement is right around the corner for you!");
            }
            }
        else if (president.equalsIgnoreCase("BushSr")) {
            System.out.println("My oh my. Daddy Bush (1989-1992). Certainly didn't commit war crimes at all or work for the arms manufacturing industry. Nope. \nYou are in your mid to late 50s (around 47-51 years old)");
            }
        else if (president.equalsIgnoreCase("Clinton")) {
            System.out.println("Now this is a highly ethical man. But Bill Clinton served for 8 years (1993-2000). \nWere you in high school during the Lewinsky Scandal (1998)? Enter yes or no.");
            String lewinsky = scanner.nextLine();
                if (lewinsky.equalsIgnoreCase("yes")) {
                System.out.println("It appears he did in fact have relations with that woman. We can safely assume you are 40-44 years old.");
                }
                else if (lewinsky.equalsIgnoreCase("no")) {
                    System.out.println("It appears he did in fact have relations with that woman.\nWe can assume you are somewhere around 45-47 years old.");
                }
            }
        else if (president.equalsIgnoreCase("BushJr")) {
            System.out.println("Well look who we have here. You witnessed this great moment (2001-2008) in American history in the flesh. BushJr... the intellectual.\nLet's narrow this down. Were you in high school during 9/11? yes or no");
            String nineEleven = scanner.nextLine();
            if (nineEleven.equalsIgnoreCase("yes")) {
                System.out.println("Indeed, then we can safely assume you are around 35-39 years old");
            }
            else if (nineEleven.equalsIgnoreCase("no")) {
                System.out.println("You are quite young but you definitely remember.\n You are 32-35 years old, most likely.");
            }
        }
        else if (president.equalsIgnoreCase("obama")) {
            System.out.println("The mustard man himself, Barrack Obama (2009-2016). He did try to do some things, but alas neoliberalism.\nLet's narrow this down further.\nDid you graduate high school before or after Sandy Hook Shooting (December 2012)? Answer before or after.");
            String hook = scanner.nextLine();
            if (hook.equalsIgnoreCase("before")) {
                System.out.println("You are most likely between the ages of 32-28 years old.");
            }
            else if (hook.equalsIgnoreCase("after")) {
                System.out.println("You are most likely between the ages of 27-23.");
            }
        }
        else if (president.equalsIgnoreCase("Trump")) {
            System.out.println("A beacon of human intellect and kindness, Donald Trump (2017-2020), who could forget this man?\nYou have lived through some historical times at such a young and impressionable age.\nYou are very likey 19-23 years old.");
        }
        else if (president.equalsIgnoreCase("Biden")) {
            System.out.println("Aye yo you are very young and probably shouldn't be in this chat. Goodbye!");
            System.exit(0);
        }
        else {
            System.out.println("You're either too old or it's not my fault you can't spell or read directions. No place for you here in this chat box. Try again!");
            System.exit(0);
        }
        return president;
    }
    public static double count() {
        System.out.println("Speaking of numbers... pick a number but nothing too high... and I'll count up to it!");
        double numOne = scanner.nextDouble();
        if (numOne > 0) {
            for (int i = 0; i <= numOne; i++) {
                System.out.println(i);
            }
        }
        else {
            for (int i = 0; i >= numOne; i--) {
                System.out.println(i);
            }
        }
        System.out.println("That would be quite a lot of syrup, but my indigestion is waning.\nSee I told you I could count!");
        return numOne;
    }
    public static void multiQuestion() {
        System.out.println("Now it's time to play a game! A question game...\nAnswer the following question by typing the correct letter option below.\nWhat does the DOM refer to?\nA: Dominic\nB: Doritos Of Mongolia\nC: Document Object Model\nD: Dirty Oreos Meetups\nChoose your answers wisely");
        // scanner.nextLine();
        Scanner input = new Scanner(System.in);
        while(true) {
        String choice = input.nextLine();
        System.out.println(choice);
        if (choice.equalsIgnoreCase("C")) {
            System.out.println("Congratulations. You have truley mastered the dark arts of Programming.");
            break;
        }
        else  {
            System.out.println("C'mon you're smarter than that! Choose again.");
            continue;    
        }
        }
    }
    public static void story(String name, double numOne, String president) {
        Scanner storyScan = new Scanner(System.in);
        System.out.println("I believe it is now story time. But we need a few more bits of information.\nWhat is your favorite color?");
        String color = storyScan.nextLine();
        System.out.println("What is your favorite fast food item?");
        String food = storyScan.nextLine();
        System.out.println("Name your favorite actor");
        String actor = storyScan.nextLine();

        System.out.println("Alright here is the story...");
        System.out.println("Once upon a time during the " +president+ " presidency...");
        System.out.println(name+ " was walking down the road to get "+numOne+ " " +food+".");
        System.out.println("But they ran into "+actor+ " who looked " +color+ " and gave them a high five\n and freshly deposited a million dollars into their bank account for no apparent reason other than dumb luck.");
        System.out.println("The End");
    }
}