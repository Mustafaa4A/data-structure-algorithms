package com.company;

public class Array {
    public int length;
    private int[] array;
    private int count = 0;

    public Array(int length){
        this.length = length;
        array = new int[length];
    }

    private void shrink(){
        int[] temp = new int[++length];
        System.arraycopy(array, 0, temp, 0, length - 1);
        array = temp;
    }

    public void insert(int item){
        if (count == length){
            shrink();
        }
        array[count++]=item;
    }

    public int indexOf(int item){
        for (int i = 0; i< count; i++){
            if (array[i]==item)
                return i;
        }
        return -1;
    }
//    12,13,14,15,16
    public void removeAt(int index) throws IllegalAccessException {
        if (index >= count || index <0){
            throw new IllegalAccessException();
        }
        for (int i = index; i < count-1; i++){
            array[i]=array[i+1];
        }
        --count;
    }

    public int max(){
        int maxItem = array[0];
        for (int item:array)
            if (item > maxItem)
                maxItem = item;

        return maxItem;
    }

    public void intersect(int[] arr){
        for (int item:array)
            for (int el:arr)
                if (item==el)
                    System.out.print(el+" ");
    }

    public void reverse(){
        for (int i =0, j=count-1; i<count/2; i++, j--){
            int temp = array[i];
            array[i]=array[j];
            array[j]=temp;
        }
    }

    public void insertAt(int item, int index){
        if (count == length){
            shrink();
        }
        if (index>=count){
            array[count] = item;
        }else{
            for (int i=count; i>index; i--){
                array[i] = array[i-1];
            }
            array[index] = item;
        }
        count++;
    }

    public void print(){
        for (int i = 0; i< count; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }


}
