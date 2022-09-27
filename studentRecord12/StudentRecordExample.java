// Percobaan 2
package studentRecord12;

public class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord annaRecord = new StudentRecord();
        StudentRecord beahRecord = new StudentRecord();
        StudentRecord crisRecord = new StudentRecord();

        annaRecord.setName("Anna");
        beahRecord.setName("Beah");
        crisRecord.setName("Cris");

        System.out.println(annaRecord.getName());
        System.out.println("Count = " + StudentRecord.getStudentCount());
    }
}