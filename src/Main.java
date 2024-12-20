public class Main {
    public static void main (String[] args) {
        University university = new University();

        Employee dean = new Administrative_Employee(1, "lol", "lol@deluxe.com");
        Faculty faculty = new Faculty("Faculty of poroAgony", dean);
        university.addFaculty(faculty);

        Institute institute = new Institute("Institute of Forsen", "LIDL St");
        faculty.addInstitute(institute);

        Research_Associate researcher = new Research_Associate(12, "Sebastian Hans Fors", "lol@deluxe.com", "LIDL GAMES");
        institute.setResearchAssociate(researcher);

        university.displayFaculties();
        faculty.displayInstitutes();
    }
}