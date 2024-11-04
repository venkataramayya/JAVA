public class Metod {
  
        public static void num1(int a,int b){
            if(a>b){
                System.out.println("a is great");
            }
            else
            {
                System.out.println("b is great");
            }
        }
        public void num2(int a, int b){
            if(a<b){
                System.out.println("a is less");

            }
            else{
                System.out.println("b is less");
            }
        }
        public static void main(String[] args){
            num1(10,20);

            Metod cd=new Metod();
            cd.num2(10,30);
        }
    }
    

