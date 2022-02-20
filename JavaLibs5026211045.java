import javax.swing.*;

public class JavaLibs {

    public static void main(String[] args) {
        //dialog 1
        int response = JOptionPane.showConfirmDialog(null,
                "Are you ready to travel and share it with me?",
                "Hello!",
                JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "We're going to the next step");
        } else if (response == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Why?? :(" );
        }
        //dialog 2
        JOptionPane.showMessageDialog(null,
                "Okay. Let's begin!",
                "Go!",
                JOptionPane.INFORMATION_MESSAGE);
        //quest 1
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Write a title for your journal!",
                "Your first step",
                2,
                null,
                null,
                "1-5 word");
        //quest 2
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Let me know your name",
                "Your second step",
                2,
                null,
                null,
                "Kimi no Nawa");
        //quest 3
        String input3 = (String)JOptionPane.showInputDialog(null,
                "How old are you",
                "Your third step",
                2,
                null,
                null,
                "int");
        int intVar1 = Integer.parseInt(input3);
        //quest 4
        String input4 = (String)JOptionPane.showInputDialog(null,
                "Mention your favourite hobby!",
                "Your fourth step",
                2,
                null,
                null,
                "The most you like!");
        //quest 5
        String input5 = (String)JOptionPane.showInputDialog(null,
                "Mention your favourite place!",
                "Your fifth step",
                2,
                null,
                null,
                "The most you like!");
        //quest 6
        String input6 = (String)JOptionPane.showInputDialog(null,
                "Write name of someone that cross to your mind right now!",
                "Your sixth step",
                2,
                null,
                null,
                "Hayoo siapa?");
        //quest 7
        String input7 = (String)JOptionPane.showInputDialog(null,
                "How do you feel when you are with " + input6 + " ?",
                "Your seventh step",
                2,
                null,
                null,
                " ");
        //quest 8
        String input8 = (String)JOptionPane.showInputDialog(null,
                "Write your favourite number!",
                "Your eighth step",
                2,
                null,
                null,
                "any number");
        double doubleVar1 = Double.parseDouble(input8);
        //quest 9
        String[] acceptableValues = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        String input9 = (String)JOptionPane.showInputDialog(null,
                "Choose number 1-12",
                "Your ninth step",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
        //quest 10
        String input10 = (String)JOptionPane.showInputDialog(null,
                "Freely write your message here! Anything",
                "Your last step",
                2,
                null,
                null,
                " ");
        //dialog 3
        JOptionPane.showMessageDialog(null,
                "Hope to see you again, " + input2,
                "Thank you!",
                JOptionPane.INFORMATION_MESSAGE);
        //dialog 4 - fin
        JOptionPane.showMessageDialog(null,
                input1+ " Journal\n" + "\n" + "\n" +
                        "Hello my name is " +input2+ ". I’m " +intVar1+ " years old and I love to " +input4+ ".\n" +
                        "I’ll tell you my journey when I’m travelling to " + input5 + " with my bestfriend, " +input6+ ".\n" +
                        "I was in " +input5+ " for " +input9+ " days. This is the first time I go to " +input5+ " by the train.\n" +
                        "We bought the ticket for Rp. " +(doubleVar1)*3000+ " per person. I set off at " +intVar1/2+ " AM and arrived in " +input5+ " at " +(intVar1+5)+ " PM. \n" +
                        "We spent a " +input7+ " time in there and I get a lot of experience and knowledge by doing this journey. " +input10,
                "Here's your " + input1 + " Journal",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
