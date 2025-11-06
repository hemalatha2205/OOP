package abstractclasses;

abstract class Course {
    abstract void startCourse();
    abstract void endCourse();
    void getCourseDetails() {
        System.out.println("Displaying course details...");
    }
    void giveCertificate() {
        System.out.println("Certificate awarded!");
    }
}

class ProgrammingCourse extends Course {
    void startCourse() {
        System.out.println("Programming course started.");
    }
    void endCourse() {
        System.out.println("Programming course ended.");
    }
}

class LanguageCourse extends Course {
    void startCourse() {
        System.out.println("Language course started.");
    }
    void endCourse() {
        System.out.println("Language course ended.");
    }
}

public class ELearningPlatform {
    public static void main(String[] args) {
        ProgrammingCourse p = new ProgrammingCourse();
        p.getCourseDetails();
        p.startCourse();
        p.endCourse();
        p.giveCertificate();

        LanguageCourse l = new LanguageCourse();
        l.getCourseDetails();
        l.startCourse();
        l.endCourse();
        l.giveCertificate();
    }
}
