/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.workshop;

import java.util.Scanner;

/**
 *
 * @author Jessica van Heerden
 */
public class WorkShop {
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
             

        // Example ingredients and their calorie values
        String[] ingredients = {"apple", "banana", "chicken breast", "rice", "spinach"};
        int[] calorieValues = {52, 89, 165, 130, 7}; // Calories per 100 grams

        // Prompt the user to enter an ingredient
        System.out.print("Enter an ingredient: ");
        String ingredient = scanner.nextLine().toLowerCase();

        // Calculate and display the calorie value
      

        scanner.close();
    }

    public static int caloriesCalc(String ingredient, String[] ingredients, int[] calorieValues) {
        for (int i = 0; i < ingredients.length; i++) {
            if (ingredients[i].equals(ingredient)) {
                return calorieValues[i];
            }
        }
        return -1; // Return -1 if ingredient not found
    }
    
    public static int caloriesDIV(int calories) {
        return calories / 2;
    }
}


