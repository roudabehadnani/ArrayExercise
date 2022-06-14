package org.example.array;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ArrayExercise {
    public static void main(String[] args) {
        intArray();
        run();
        country();
        copyArray();
        countryCityArray();
        average();
        unEven();
        duplicateElements();
        expandArray();
        multiplication();
        inputArray();
        arrayDiagonal();
        oddEvenArray();

    }


    //1.  Write a program which will store elements in an array of type ‘int’ and print it out
    public static void intArray() {
        System.out.println("Task 1 :");
        int[] intNumbers = new int[]{11, 23, 39, 56, 78, 99};
        for (int intNumber : intNumbers) {
            System.out.print(intNumber + " ");
        }

        System.out.println("\n");
    }

    //2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element
    private static int indexOf(int[] array, int element) {

        int indexFound = Arrays.binarySearch(array, element);
        int indexNotFound = -1;
        if(indexFound<0){
            return indexNotFound;
        }else{
            return indexFound;
        }
    }
    public static void run() {
        System.out.println("Task 2 :");
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int element = num.nextInt();
        int[] numbers ={1,4,5,7,9,10,12,20};
        int index = indexOf(numbers,element);
        System.out.println("The index of the number is " + index);
    }


    //3.  Write a program which will sort string array
    public static void country() {
        System.out.println("Task 3 :");
        String[] countryName = {"Paris", "London", "New York", "Stockholm"};
        Arrays.sort(countryName);
        System.out.println("Sorting array is: " + Arrays.toString(countryName));
        System.out.print("\n");
    }


    //4.  Write a program which will copy the elements of one array into another array
    public static void copyArray() {
        System.out.println("Task 4 :");
        int[] firstArray = new int[]{1, 15, 20};
        System.out.println("First array is: " + Arrays.toString(firstArray));
        int[] secondArray = Arrays.copyOf(firstArray, firstArray.length);
        System.out.println("Copy of first array is: " + Arrays.toString(secondArray));
        System.out.print("\n");
    }


    //5.  Create a two-dimensional string array [2][2]
    public static void countryCityArray() {
        System.out.println("Task 5 :");
        String[][] countryCity = new String[2][2];
        countryCity[0][0] = "France";
        countryCity[0][1] = "Paris";
        countryCity[1][0] = "Sweden";
        countryCity[1][1] = "Stockholm";
        for (int i = 0; i < countryCity.length; i++) {
            for (int j = 0; j < countryCity.length; j++) {
                if (j >= i) {
                    System.out.print(countryCity[i][j] + " ");
                } else if (i > j) {
                    System.out.println();
                    System.out.print(countryCity[i][j] + " ");
                }

            }
        }
        System.out.println("\n");
    }


    //6.  Write a program which will set up an array to hold the values and print the average of these 6 numbers
    public static void average() {
        System.out.println("Task 6 :");
        int[] numbers = {43, 5, 23, 17, 2, 14};
        float total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("The average of array is: " + total / numbers.length);
        System.out.println();

    }


    //7.  Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers
    public static void unEven() {
        System.out.println("Task 7 :");
        int[] numBers = new int[10];
        System.out.print("Uneven numbers are: ");
        for (int i = 1; i <=numBers.length; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }

    //8. Write a program which will remove the duplicate elements of a given array
    public static void duplicateElements() {
        System.out.println("Task 8 :");
        int firstArray[] = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        Arrays.sort(firstArray);
        int j = 0;
        for (int i = 0; i < firstArray.length - 1; i++) {
            if (firstArray[i] != firstArray[i + 1]) {
                firstArray[j] = firstArray[i];
                j++;
            }
        }
        System.out.print("Array without duplicate values: ");
        firstArray[j] = firstArray[firstArray.length - 1];
        for (int i = 0; i <= j; i++) {
            System.out.print(firstArray[i] + " ");
        }
        System.out.println("\n");
    }


    //9. Write a method which will add elements in an array
    public static int expandArray() {
        System.out.println("Task 9 :");
        int[] firstArray = new int[5];
        int[] secondArray = Arrays.copyOf(firstArray, firstArray.length + 2);
        System.out.println("First array is: " + Arrays.toString(firstArray));
        System.out.println("Expand array is: " + Arrays.toString(secondArray));
        return 0;
    }


    //10. Write a program which will represent multiplication table stored in multidimensional array
    public static void multiplication() {
        System.out.println("Task 10 :");
        int[][] numbers = new int[10][10];
        for (int i = 1; i <= numbers.length; i++) {
            for (int j = 1; j <= numbers.length; j++) {
                numbers[i - 1][j - 1] = i * j;
                System.out.print(" " + numbers[i - 1][j - 1] + "\t  ");
            }
            System.out.println();
        }
        System.out.println();
    }


    //11. Write a program that ask the user for an integer and repeat...
    public static void inputArray() {
        System.out.println("Task 11 :");
        Scanner inputRepeat = new Scanner(System.in);
        System.out.print("How many times do you want to input data? ");
        int length = inputRepeat.nextInt();
        int[] inputArray = new int[length];
        for (int i = 0; i < length; i++) {
            Scanner inputNum = new Scanner(System.in);
            System.out.print("input your integer number ");
            int number = inputNum.nextInt();
            inputArray[i] = number;
        }
        System.out.println("Input array is: " + Arrays.toString(inputArray));
        int[] diverseArray = new int[length];
        int index = length - 1;
        for (int i = 0; i < length; i++) {
            diverseArray[i] = inputArray[index - i];
        }
        System.out.println("Diverse array is: " + Arrays.toString(diverseArray));
        System.out.println();
    }


    //12. Write a program which will print the diagonal elements of two-dimensional array
    public static void arrayDiagonal() {
        System.out.println("Task 12 :");
        int[][] numbers = {{1, 2, 3}, {2, 4, 6}, {3, 6, 9}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    int num = numbers[i][j];
                    System.out.print(num);
                } else {
                    System.out.print(" ");
                }
            }
        }
        System.out.println("\n");
    }


//13. Create two arrays with arbitrary size and fill one with random numbers
        public static void oddEvenArray () {
            System.out.println("Task 13 :");
            int[] arrayA = new int[7];
            Random randomNum = new Random();
            int max = 200;
            int min = 1;
            System.out.print("random array: ");
            for (int i = 0; i < arrayA.length; i++) {
                int randomNumber = min + randomNum.nextInt(max);
                arrayA[i] = randomNumber;
                System.out.print(arrayA[i] + " ");
            }
            System.out.println();
            int[] arrayB = new int[arrayA.length];
            System.out.print("arrange odd and even array: ");
            for (int i = 0; i < arrayA.length; i++) {
                if (arrayA[i] % 2 != 0) {
                    arrayB[i] = arrayA[i];
                    System.out.print(arrayB[i] + " ");
                }
            }
            for (int i = 0; i < arrayA.length; i++) {
                if (arrayA[i] % 2 == 0) {
                    arrayB[i] = arrayA[i];
                    System.out.print(arrayB[i] + " ");
                }
            }
        }
    }














