package thread.first;

public class ExampleThreadSleep {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Dongu donuyor!!!");
        }
    }
}
