public class Displaying_Pattern {
    public static void main(String[] args) {
        System.out.println("Your pattern is");
        for(int i=1;i<=9; i++){
            for(int j = 1;j<=i; j++){
                System.out.print(" ");
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}

/*
output -- 
Your pattern is
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5
 6 6 6 6 6 6
 7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
 9 9 9 9 9 9 9 9 9
 */ 
