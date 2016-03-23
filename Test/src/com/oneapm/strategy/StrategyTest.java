package com.oneapm.strategy;


/**
 * Created by Lpp on 2016/3/23.
 * Purpose:策略模式的测试
 */

interface SortHandler {
    void swap(int index);

    boolean outOfOrder(int index);

    int length();

    void setArray(Object array);
}

class IntSortHandler implements SortHandler {

    private int[] array;

    @Override
    public void swap(int index) {
        if (isValidIndex(index)) {
            int temp = array[index];
            array[index] = array[index + 1];
            array[index + 1] = temp;
        }
    }

    @Override
    public boolean outOfOrder(int index) {
        if(isValidIndex(index)){
            return array[index] > array[index + 1];
        }
        return false ;
    }

    @Override
    public int length() {
        if(array == null){
            return 0 ;
        }
        return array.length ;
    }

    @Override
    public void setArray(Object array) {
        this.array = (int[])array ;
    }

    private boolean isValidIndex(int index){
        return index < (length() - 1) ;
    }
}

class BubbleSort{
    private SortHandler sortHandler ;
    private int length ;
    public BubbleSort(SortHandler handler){
        this.sortHandler = handler ;
    }
    public void sort(Object array){
        this.sortHandler.setArray(array);
        this.length = this.sortHandler.length() ;
        for(int i = 0;i < this.length-1 ;++i){
            for(int j = 0 ;j < this.length-i-1 ;++j){
                if(this.sortHandler.outOfOrder(j)){
                    this.sortHandler.swap(j);
                }
            }
        }

    }
}
public class StrategyTest {

    public static void main(String[] args) {
        int []arr = {5,1,23,45,23,4} ;
        BubbleSort sorter = new BubbleSort(new IntSortHandler()) ;
        sorter.sort(arr);

        for(int element: arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
