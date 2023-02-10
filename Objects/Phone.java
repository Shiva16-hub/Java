import java.util.Scanner;
class phn{
    String PhoneNo;
    String Name;
    int Calls;
    double Bill;
    void SetValues(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Phone no");
        PhoneNo = sc.nextLine();
        System.out.println("name");
        Name = sc.nextLine();
        System.out.println("calls");
        Calls = sc.nextInt();
    }

    double CalculateBills(){
      if(Calls < 100){
          Bill = Calls * 2 + 50;
      }
      else if(Calls > 100 && Calls < 200){
          Bill = Calls * 3 + 50;
      }else{
          Bill = Calls * 4 + 50;
      }
      return Bill;
    }
    void displayValues(){
        System.out.println("Phone no is " + PhoneNo);
        System.out.println("Name is" + Name);
        System.out.println(("Calls is " + Calls));
        System.out.println("Calculate bills" + Bill);
    }
}


public class phone {
    public static  void main(String args[]){
        phn ob1 = new phn();
        ob1.SetValues();
        ob1.CalculateBills();
        ob1.displayValues();

    }
}
