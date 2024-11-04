public class Encaps{
   private  String name;
   private  int roll;
    String adress;
    int mobile;

// public String getname(){
//     return name;
// }//wy we use get,set 
//directly we can use 1 method no neeed another method'

    public void setname(String name){
        this.name=name;
        System.out.println(name);

    }

    public void setroll(int roll){
     this.roll=roll;
    }
    public int getroll(){
        return roll;
    } 
}