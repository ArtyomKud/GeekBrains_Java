package groupId;

public  class MyCountMetod {
    float[] arr1;
    float[] arr2;

    public void counter1 (float[] arr, int half) {
        arr1= new float[half];
        System.arraycopy(arr,0,arr1,0, arr.length/2);

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

        }

    }
    public void counter2 (float[] arr, int half) {

        arr2 = new float[half];
        System.arraycopy(arr,arr.length/2,arr2, 0, arr.length/2);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

    }




}
