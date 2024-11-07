class ThreadPrintChar extends Thread{
    private char charToPrint;
    private int times;

    public ThreadPrintChar(char c, int t){
        charToPrint = c;
        times = t;
    }
    public void run(){
        try{
            for(int i = 0 ; i < times ; i++){
                System.out.println(charToPrint);
                Thread.sleep(50);
            }
        }catch(InterruptedException ex){}
    } 
}

class ThreadPrintNum extends Thread{
    private int lastNum;
    public ThreadPrintNum(int n){
        lastNum = n;
    }
    public void run(){
        for(int i = 0 ; i < lastNum ; ++i){
            System.out.println(i+" ");
        }
    }
}

public class ThreadDemo{
    public static void main(String[] args) {
        ThreadPrintChar thread1 = new ThreadPrintChar('A', 100);
        ThreadPrintChar thread2 = new ThreadPrintChar('B', 100);
        ThreadPrintNum thread3 = new ThreadPrintNum(100);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}