package groupId;

public class Java2HomeWork5 {


    public static void main(String[] args) {

        firstMethod();
        secondMethod();




    }
    public static void firstMethod() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
    }
    public static void secondMethod() {
        MyCountMetod myCountMetod1= new MyCountMetod();
        final int size = 10_000_000;
        final int half = size / 2;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                myCountMetod1.counter1(arr,half);
            }

        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                myCountMetod1.counter2(arr,half);
            }
        });
        long startTime = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        float[] arr3 = new float[arr.length];
        System.arraycopy(myCountMetod1.arr1,0,arr3,0,myCountMetod1.arr1.length);
        System.arraycopy(myCountMetod1.arr2,0,arr3,arr3.length/2,myCountMetod1.arr2.length);
        System.out.println("Two thread time: " + (System.currentTimeMillis() - startTime) + " ms.");

    }


}

