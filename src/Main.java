import Controller.Controller;
import Data.Student;
import Data.Teacher;
import Service.DataService;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan Semenov", 20, "Vologda", 0);
        Student student2 = new Student("Petr Fipon", 18, "Penza", 0);
        Student student3 = new Student("Redis Nason", 21, "Moscow", 0);
        Teacher teacher1 = new Teacher("Mariya Petrova", 36, "Vologda", 0);
        Teacher teacher2 = new Teacher("Sergey Kornilov", 46, "Moscow", 0);
        DataService dataService = new DataService();
        dataService.Create(student1);
        dataService.Create(student2);
        dataService.Create(student3);
        dataService.Create(teacher1);
        dataService.Create(teacher2);




        Controller controller = new Controller();
        controller.Create(student1);
        controller.Create(student2);



    }
}