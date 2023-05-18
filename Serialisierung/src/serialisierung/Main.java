package serialisierung;

/**
 * Serialiesrung =Zustand Objekt + Statusinformationen in Folge von Bytes
 * umwandlen*
 *
 * Nicht Serialisieren: Statische Atributte und Transient !!!!!!
 */
public class Main {

    public static void main(String[] args) {
        Serialize ser = new Serialize();
        ser.Serilaize(new Student("Diyar", 23));
        Student deserializedStudent = ser.DeSerilaize();
        System.out.println("Name: " + deserializedStudent.getName() + "Alter: " + deserializedStudent.getAlter());
    }
}
