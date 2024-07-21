public class MakersAndAchievement {

    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter student name:");
        String studentName=scanner.nextLine();
        System.out.println("Enter marks (out of 100):");
        int marks =scanner.nextInt();
        scanner.close();
        if (marks >= 90) {
            System.out.println (studentName+"Outstanding Achievement");
        } else if (marks >= 80) {
            System.out.println(studentName+" Excellent Achievement");
        } else if (marks >= 70) {
            System.out.println (studentName+"Good Achievement");
        } else if (marks >= 50) {
            System.out.println (studentName+"Pass");
        } else {
            System.out.println (studentName+"Fail");
        }
    }

}