//Create student class and create some methods
import javax.lang.model.element.Name;
import java.util.Scanner;
class stu{
    int Rollno;
    String Name;
    double Marks;
    void SetValues(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your roll no -->");
        Rollno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name heer-->");
        Name = sc.nextLine();

        System.out.println("Entre your marks-->");
        Marks = sc.nextDouble();
    }
    void display(){
        System.out.println("Your roll no is"+ Rollno);
        System.out.println("Your name is" + Name);
        System.out.println("Your Marks is"+ Marks);
    }
}
public class student {

    public static void main(String args[]){
        stu ob1 = new stu();
        ob1.SetValues();
        ob1.display();
    }
}
