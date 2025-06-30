import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int multiply= 1;
//        for(int i=1;i<4;i++){
//           multiply *=i;
//        }
//        System.out.println(multiply);
//
//        int numbers []={23,34,21,35,68,98};
//        int sum = 0;
//        for(int j=0;j<numbers.length;j++){
//            sum=sum+numbers[j];
//        }
//        System.out.println(sum);
//
//        int number []={23,34,21,35,68,98,44};
//        int max = Integer.MIN_VALUE;
//        for(int n=0;n<number.length;n++){
//            if(number[n]> max){
//                max = number[n];
//            }
//        } System.out.println(max);
//
//        int num []= {12,5,3,8,76,43,345,45,4,1,-54};
//       int min = Integer.MAX_VALUE;
//       for(int m=0;m<num.length;m++){
//           if(min>num[m]){
//               min=num[m];
//           }
//       }
//        System.out.println(min);
//
//       int marks[][]={
//               {64,35,45,5},
//               {34,55,97,3},
//               {31,75,33,99},
//       };
//        System.out.println(marks[2][3]);
//        System.out.println("Enter size of array");
//        int input = sc.nextInt();
//        int sum = 0;
//        System.out.println("Now put the values in array");
//        int [] array= new int[input];
//        for(int i=0;i<input;i++) {
//            array[i] = sc.nextInt();
//        }
//        for(int i = 0;i<input;i++){
//            sum = sum+array[i];
//        }
//        System.out.println(sum);
//        int add=0;
//        for(int i = 0;i<input;i++) {
//            if (array[i] % 2 == 1) {
//                add = add + array[i];
//            }
//        }System.out.println(add);
//        System.out.println("Enter your string");
//        String s = sc.nextLine();
//        String ans = "";
//        for(int i = 0;i<s.length();i++){
//            if(i<s.length()) {
//                if(i%2==0){
//                ans = ans + s.charAt(i);}
//            }
//        }
//        System.out.println(ans);
//        System.out.println("Enter your number");
//        int a =sc.nextInt();
//        for (int i =1;i<=10;i++){
//            System.out.println(a+"x"+i+"="+i*a);
//        }
//        System.out.println("Enter your number");
//        int a = sc.nextInt();
//        int sum = 0;
//        for(int i =1;i<=a;i++){
//            if (i%2==1){
//                System.out.println(i);
//                sum = sum+i;
//            }
//        }
//        System.out.println(sum);
//        System.out.println("Enter your name");
//        int a = sc.nextInt();
//        for (int i = 1; i <= a; i++) {
//            for (int j = 1; j <= a-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        System.out.println("Enter a number");
//        int a  = sc.nextInt();
//        for (int i = 1; i <= a; i++) {
//            for (int j = a; j >=i; j--) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//        String s = sc.nextLine();
//        String g=sc.nextLine();
//        String f = sc.nextLine();
//        System.out.println(s.replace(g,f));
//        int t=sc.nextInt();
//        for(int i=0;i<t;i++){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int n = sc.nextInt();
//            double  ans = a;
//            for (int j = 0; j <n; j++) {
//            ans=ans+Math.pow(2,j)*b;
//                System.out.print(ans+" ");
//            }
//        }
//        System.out.println();
//        sc.close();
//        System.out.println("Enter the size of 1st array");
//        int a = sc.nextInt();
//        System.out.println("Enter the numbers of 1st array");
//        int[]number=new int[a];
//        for(int i=0;i<a;i++){
//            number[i]=sc.nextInt();
//        }
//        System.out.println("Enter the size of 2nd array");
//        int b = sc.nextInt();
//        System.out.println("Enter the numbers of 2nd array");
//        int[] numbers=new int[b];
//        for(int i=0;i<b;i++){
//        numbers[i]=sc.nextInt();
//        }
//        for (int i
//             = 0; i < a; i++) {
//            for (int j = 0; j<b; j++) {
//              if((number[i]+numbers[j])%2==0){
//                  System.out.print(number[i]+" ");
//                  System.out.println(numbers[j]);
//              }
//            }
//        }
//        int a = sc.nextInt();
//        for(int i =1;i<=a;i++){
//            int []num = new int [3];
//            for(int j=0;j<3;j++){
//                num[j]=sc.nextInt();
//            }
//            Arrays.sort(num);
//           System.out.println(num[1]);
//        }
//        int t = sc.nextInt();
//        for(int i=1;i<=t;i++){
//            int a= sc.nextInt();
//            int sum= 0;
//            for(int j =0;j<Integer.MAX_VALUE;j++){
//                if(a==0){
//                    break;
//                }else{
//                    sum=sum+a%10;
//                    a=a/10;
//                }
//            }
//            System.out.println(sum);
//        }
//        long sum=0;
//        for(int i=1;i<Integer.MAX_VALUE;i++){
//            sum=sum+i;
//            String s= String.valueOf(sum);
//            if(s.length()==10 ){
//                System.out.println(i+" "+s);
//                break;
//            }
//
//        }
//        System.out.println("How many test cases you want?");
//        int x = sc.nextInt();
//        String [] result= new String[x];
//        for(int i=0;i<x;i++){
//            String ans = "";
//        System.out.println("How much is your capacity to give me my fav. alphabet?");
//        int a = sc.nextInt();
//
//        for(int c =0;c<a;c++){
//                int b = sc.nextInt();
//                char ch=sc.next().charAt(0);
//                for(int j =0;j<b;j++){
//                    ans = ans+ch;
//                }
//        }result[i]=ans;
//    }
//        for(int i =0;i<x;i++){
//            System.out.println(result[i]);
//        }
        System.out.println("How many test cases you want?");
        int a = sc.nextInt();
       for(int i =0;i<a;i++){
           String ans = "";
           int n = sc.nextInt();
           int m = sc.nextInt();
           if(n > m || n < 1 || n > 26 || m < 1 || m > 26){
               System.out.println(" oops wrong input ");
           }
           else{
           for (int j = n; j <=m ; j++) {
               if(j==1||j==5||j==9||j==15||j==21){
                  continue;
               }
               else{
                   char temp = (char) (96 + j);
                   ans += temp;
               }
           }
           System.out.println(ans);
       }}
    }
}

