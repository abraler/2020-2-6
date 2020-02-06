public class Exercise1 {
    public static class Myhtread implements Runnable{
        int n=0;
        @Override
        public void run() {
            while(n<10){
                System.out.println(n);
                try {
                    Thread.sleep(1);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                n++;
            }

        }
    }
    public static void main(String[] args) {
//        Thread thread1=new Thread(new Myhtread());
//        Thread thread2=new Thread(new Myhtread());
//        Thread thread3=new Thread(new Myhtread());
//        thread1.start();
//        thread2.start();
//        thread3.start();
         long begin=System.nanoTime();
        Thread thread1=new Threadone();
        Thread thread2=new Threadthree();
        Thread thread3=new Threadtwo();
        Thread thread4=new Thread(new Thread(() -> {
            int n = 0;
            while(n<10){
                System.out.println(n);
                try {
                    Thread.sleep(1);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                n++;
            }

        }));

            //thread4.start();
       thread1.start();
//        thread1.join();
//        thread2.start();
//        thread3.start();

//

//        thread2.join();
//        thread3.join();


        long b=System.nanoTime();
        System.out.println(b-begin);



    }
    static class Threadone extends Thread{
        int i=0;
        @Override
        public void run() {
            for (; i <=1000000 ; i++) {
                i+=i;
            }
            try {
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
    static class Threadtwo extends Thread{
        int i=0;
        @Override
        public void run() {
            for (; i <100000 ; i++) {
                if(i%2!=0)
                i+=i;
            }
            System.out.println(i);
        }
    }
    static class Threadthree extends Thread{
        int t=0;
        @Override
        public void run() {
            for (int i = 0; i <100000 ; i++) {
                t+=i*2;
            }
            System.out.println(t);
        }
    }
}
