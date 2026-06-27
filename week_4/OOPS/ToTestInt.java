interface test{
    int square(int x);
}
class airthmatic implements test{
    public int square(int x){
        return x*x;
    }
}

public class ToTestInt{
    public static void main(String[] args) {
        airthmatic num=new airthmatic();
        int ans=num.square(5);
        System.out.println("Square of 5 is : "+ ans);
    }
}