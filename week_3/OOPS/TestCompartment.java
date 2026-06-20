import java.util.*;
abstract class Compartment{
    public abstract String notice();

}
class FirstClass extends Compartment {
    @Override
    public String notice(){
        return "First Class coach";
    }
}
class Ladies extends Compartment{
    @Override
    public String notice(){
        return "Ladies coach";
    }
}
class General extends Compartment{
    @Override
    public String notice(){
        return "General coach";
    }
}
class Luggage extends Compartment{
    @Override
    public String notice(){
       return "Luggage Class ";
    }
}
public class TestCompartment{
    public static void main(String []args){
        Compartment[] c=new Compartment[10];
        Random random =new Random();
        for(int i=0;i<c.length;i++){
            int choice=random.nextInt(4)+1;
            switch(choice){
                case 1: c[i]= new FirstClass();
                break;
                case 2: c[i]=new Ladies();
                break;
                case 3:c[i]=new General();
                break;
                case 4: c[i]=new Luggage();
                break ;
            }
        }
        System.out.println("Railway compartment");

        for(Compartment compartment: c){
            System.out.println(compartment.notice());
        }

    }
}