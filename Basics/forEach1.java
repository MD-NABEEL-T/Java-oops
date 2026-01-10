package Basics;
public class forEach1{
    public static void main(String []args){
        int num[] ={1,2,3};
        for(int i=0;i<3;i++){
            System.out.print(num[i]);
        }
        System.out.println();
        String arr[]={"one","two"};
        for(int var:num) System.out.print(var);
        for(String str:arr)System.out.print(str);
    }
}