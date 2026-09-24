package in.ashokit.runner;

import in.ashokit.model.Student;
import in.ashokit.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Autowired
    StudentRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        saveStudent();
    }

    private void saveStudent() {

        Student student = new Student();
        student.setStudentName("ravi");
        student.setMarks(90);

        Student student1 = new Student();
        student1.setStudentName("Abhi");
        student1.setMarks(98);

        Student student2 = new Student();
        student2.setStudentName("System");
        student2.setMarks(90);

        Student student3 = new Student();
        student3.setStudentName("gopy");
        student3.setMarks(67);

        Student student4 = new Student();
        student4.setStudentName("roy");
        student4.setMarks(80);

        Student student5 = new Student();
        student5.setStudentName("kundan");
        student5.setMarks(79);

        repository.saveAll(List.of(
                student,
                student1,
                student2,
                student3,
                student4,
                student5
        ));
    }
}
