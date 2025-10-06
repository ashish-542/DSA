public class ArrayOperations {
    public static void main(String[] args){
        // Create
        int marks[] = new int[3];

        // Input
        marks[0] = 100;
        marks[1] = 89;
        marks[2] = 89;

        // output
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // Update

        marks[1] = 100;
        marks[2] = marks[2] + 1;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // Loops
    }
}