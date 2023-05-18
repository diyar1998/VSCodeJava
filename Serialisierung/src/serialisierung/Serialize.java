package serialisierung;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialize {

    public void Serilaize(Student student) {
        File file = new File("C:/Users/49179/Desktop/SerlizeLearnungPurposes/student.ser");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file); ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
            objectOutputStream.writeObject(student);
        } catch (Exception e) {
        }

    }

    public Student DeSerilaize() {
        Student student = null;
        File file = new File("C:/Users/49179/Desktop/SerlizeLearnungPurposes/student.ser");
        try (FileInputStream fileInputStream = new FileInputStream(file); ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
            student = (Student) objectInputStream.readObject();
        } catch (Exception e) {
        }
        return student;
    }
}
