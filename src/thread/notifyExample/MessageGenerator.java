package thread.notifyExample;
/*
Wait() Method
Bir thread icin wait() methodu çağrıldığı zaman,
thread beklemeye zorlanır ta ki başka bir thread
tarafında notify() yada notifyAll() methodları tetiklene kadar.
*/
/*
Notify() Method
Bir thread için notify() methodu çağrıldığı zaman,
 beklemekte olan thread harekete geçer.
 Birden fazla Thread için bekleme söz konusu ise
 hangi Thread in uyanacağı belli değildir.
Tamamen implemantasyona bağlı olarak içlerinden bir tanesi alır.
 */
public class MessageGenerator {
    String state;

    synchronized void tick(boolean running) {
        if (!running) {
            state = "ticked";
            notify();
            return;
        }
        System.out.println("Tick");
        state = "ticked";
        notify();
        try {
            while (!state.equals("tocked")) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void tock(boolean running){
        if (!running) {
            state = "tocked";
            notify();
            return;
        }
        System.out.println("Tock");
        state = "tocked";
        notify();
        try {
            while (!state.equals("ticked")) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
