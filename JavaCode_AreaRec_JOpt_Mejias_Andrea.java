// Program to calculate the area of a rectangle or circle using JOptionPane methods
//
// Andrea Mejias
// 9/19/2025
// 
//

import javax.swing.JOptionPane;
class AreaRec_JOpt
{
    public static double length;
    public static double width;
    public static double radius;
    public static double area;
    public static final double PI = 3.14159;
    
    public static void main(String[] args)
    {
        boolean continueProgram = true;
        
        // Welcome message
        JOptionPane.showMessageDialog(null, "Welcome to the Area Calculator!");
        
        while (continueProgram)
        {
            int choice = getChoice();
            
            if (choice == 0) // Rectangle
            {
                getRectangleLength();
                getRectangleWidth();
                calculateRectangleArea();
                displayRectangleArea();
            }
            else if (choice == 1) // Circle
            {
                getCircleRadius();
                calculateCircleArea();
                displayCircleArea();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
                continue; // Skip the continue question and restart the loop
            }
            
            // Ask if user wants to continue
            continueProgram = askToContinue();
        }
        
        // Goodbye message
        JOptionPane.showMessageDialog(null, "Thank you for using the Area Calculator!");
    }
    
    public static int getChoice()
    {
        // Ask user to choose between rectangle or circle
        String[] options = {"Rectangle", "Circle"};
        int choice = JOptionPane.showOptionDialog(
            null,
            "What shape would you like to calculate the area for?",
            "Shape Selection",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
        );
        return choice;
    }
    
    public static boolean askToContinue()
    {
        // Ask user if they want to continue using the program
        int response = JOptionPane.showConfirmDialog(
            null,
            "Do you want to calculate another area?",
            "Continue?",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );
        
        return response == JOptionPane.YES_OPTION;
    }
    
    public static void getRectangleLength()
    {
        // Prompt user to input length.
        length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the rectangle:"));
    }
    
    public static void getRectangleWidth()
    {
        // Prompt user to input width.
        width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width of the rectangle:"));
    }
    
    public static void calculateRectangleArea()
    {
        // Calculate area of rectangle.
        area = length * width;
    }
    
    public static void displayRectangleArea()
    {
        // Display area of rectangle.
        JOptionPane.showMessageDialog(null, "Area of rectangle is: " + area);
    }
    
    public static void getCircleRadius()
    {
        // Prompt user to input radius.
        radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the circle:"));
    }
    
    public static void calculateCircleArea()
    {
        // Calculate area of circle (π * r²).
        area = PI * radius * radius;
    }
    
    public static void displayCircleArea()
    {
        // Display area of circle.
        JOptionPane.showMessageDialog(null, "Area of circle is: " + area);
    }
}