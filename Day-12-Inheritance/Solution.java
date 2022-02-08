import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;

    /*
     * Class Constructor
     * 
     * @param firstName - A string denoting the Person's first name.
     * 
     * @param lastName - A string denoting the Person's last name.
     * 
     * @param id - An integer denoting the Person's ID number.
     * 
     * @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student(String firstName, String lastName, int identification, int[] Scores) {
        super(firstName, lastName, identification);
        this.testScores = Scores;
    }

    /*
     * Method Name: calculate
     * 
     * @return A character denoting the grade.
     */
    // Write your method here
    public char calculate() {
        char Grage = 'o';
        int Avg = 0;
        for (int i = 0; i < testScores.length; i++) {
            Avg += testScores[i];
        }

        Avg /= testScores.length;

        if (Avg <= 100 && Avg >= 90) {
            Grage = 'O';
        } else if (Avg < 90 && Avg >= 80) {
            Grage = 'E';
        } else if (Avg < 80 && Avg >= 70) {
            Grage = 'A';
        } else if (Avg < 70 && Avg >= 55) {
            Grage = 'P';
        } else if (Avg < 55 && Avg >= 40) {
            Grage = 'D';
        } else {
            Grage = 'T';
        }

        return Grage;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();
        int id = scanner.nextInt();
        int numScores = scanner.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scanner.nextInt();
        }
        scanner.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}