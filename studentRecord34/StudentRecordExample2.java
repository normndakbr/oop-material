// Percobaan 4
package studentRecord34;

public class StudentRecordExample2 {
    public static void main(String[] args) {
        StudentRecord2 annaRecord = new StudentRecord2();
        StudentRecord2 beahRecord = new StudentRecord2();
        StudentRecord2 crisRecord = new StudentRecord2();

        StudentRecord2 recordAnna = new StudentRecord2("Candra");
        StudentRecord2 recordBeah = new StudentRecord2("Bagus", "Malang");
        StudentRecord2 recordCris = new StudentRecord2(80, 90, 100);

        annaRecord.setName("Anna");
        beahRecord.setName("Beah");
        crisRecord.setName("Cris");

        System.out.println(annaRecord.getName());

        System.out.println("Count = " + StudentRecord2.getStudentRecord());

        StudentRecord2 anna2Record = new StudentRecord2();
        anna2Record.setName("Anna");
        anna2Record.setAddress("Philipina");
        anna2Record.setAge(15);
        anna2Record.setMathGrade(80);
        anna2Record.setEnglishGrade(95.5);
        anna2Record.setScienceGrade(100);

        anna2Record.print(anna2Record.getName());
        anna2Record.print(anna2Record.getEnglishGrade(), anna2Record.getMathGrade(), anna2Record.getScienceGrade());
        recordAnna.print(recordAnna.getName());
    }
}
