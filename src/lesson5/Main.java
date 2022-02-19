package lesson5;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        fullArr();
        halfArr();
    }

    public static void fullArr() {
        final int size = 10000000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время выполнения одним потоком: " + (System.currentTimeMillis() - a + " ms."));
    }

    public static void halfArr() throws InterruptedException {
        final int size = 10000000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long a = System.currentTimeMillis();

        float[] arrLeft = new float[size/2];
        float[] arrRight = new float[size/2];

        System.arraycopy(arr,0,arrLeft,0,size/2);
        System.arraycopy(arr,size/2,arrRight,0,size/2);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < arrLeft.length; i++) {
                    arrLeft[i] = (float) (arrLeft[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < arrRight.length; i++) {
                    arrRight[i] = (float) (arrRight[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        t1.start();
        t2.start();

        float[] mergeArr = new float[size];
        System.arraycopy(arrLeft,0,mergeArr,0,size/2);
        System.arraycopy(arrRight,0,mergeArr,size/2,size/2);

        t1.join();
        t2.join();

        System.out.println("Время выполнения по потокам: "+ (System.currentTimeMillis()-a) + " ms.");
    }
}
