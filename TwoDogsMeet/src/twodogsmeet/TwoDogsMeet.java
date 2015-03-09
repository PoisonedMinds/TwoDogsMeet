package twodogsmeet;

import javax.swing.*;

/**
 * @title TwoDogsMeet
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 9-Mar-2015 10:12:18 AM
 * @purpose The purpose of this program is to
 */
public class TwoDogsMeet {

    public static void main(String[] args) {
        String name1, name2, breed1, breed2;
        int test, aggression, hunger;
        name1 = JOptionPane.showInputDialog(null, "This program will make 2 dogs,\nWhat is the name of the first dog?");
        name2 = JOptionPane.showInputDialog(null, "What is the name of the second dog?");
        breed1 = JOptionPane.showInputDialog(null, "What is the breed of the first dog?");
        breed2 = JOptionPane.showInputDialog(null, "What is the breed of the second dog?");
        Dog dog1 = new Dog(name1, breed1);
        Dog dog2 = new Dog(name2, breed2);
        JOptionPane.showMessageDialog(null, dog1.toString());
        JOptionPane.showMessageDialog(null, dog2.toString());
        test = JOptionPane.showConfirmDialog(null, "Would you like to change " + name1 + "'s aggression?");
        if (test == 0) {
            aggression = Integer.parseInt(JOptionPane.showInputDialog("What would you like to change " + name1 + "'s aggression to?\n(1-10)"));
            dog1.setAggression(aggression);
        } else if (test == 1) {

        } else {
            System.exit(0);
        }
        test = JOptionPane.showConfirmDialog(null, "Would you like to change " + name2 + "'s aggression?");
        if (test == 0) {
            aggression = Integer.parseInt(JOptionPane.showInputDialog("What would you like to change " + name2 + "'s aggression to?\n(1-10)"));
            dog2.setAggression(aggression);
        } else if (test == 1) {

        } else {
            System.exit(0);
        }
        test = JOptionPane.showConfirmDialog(null, "Would you like to change " + name1 + "'s hunger?");
        if (test == 0) {
            hunger = Integer.parseInt(JOptionPane.showInputDialog("What would you like to change " + name1 + "'s hunger to?\n(1-10)"));
            dog2.setHunger(hunger);
        } else if (test == 1) {

        } else {
            System.exit(0);
        }
        test = JOptionPane.showConfirmDialog(null, "Would you like to change " + name2 + "'s hunger?");
        if (test == 0) {
            hunger = Integer.parseInt(JOptionPane.showInputDialog("What would you like to change " + name2 + "'s hunger to?\n(1-10)"));
            dog2.setHunger(hunger);
        } else if (test == 1) {

        } else {
            System.exit(0);
        }
        if ((dog1.getHunger() > 5) || (dog1.getAggression() > 5)) {
            System.out.println(name1 + ":");
            dog1.barkAngry();
        } else {
            System.out.println(name1 + ":");
            dog1.barkFriendly();
        }
        if ((dog2.getHunger() > 5) || (dog2.getAggression() > 5)) {
            System.out.println(name2 + ":");
            dog2.barkAngry();
        } else {
            System.out.println(name2 + ":");
            dog2.barkFriendly();
        }

    }

}
