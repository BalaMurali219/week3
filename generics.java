class bSort<T extends Comparable<T>>{ 
 int i=0; 
 int j=0; 
 void sort(T[] data){ 
 for(i=0;i<data.length;i++){ 
 for(j=i+1;j<data.length;j++){ 
 if(data[i].compareTo(data[j])>0){ 
 T temp=data[i]; 
 data[i]=data[j]; 
 data[j]=temp; 
 } 
 } 
 } 
 for(i=0;i<data.length;i++){ 
 System.out.println(data[i]); 
 } 
 } 
 } 
 public class genericsJava { 
 public static void main(String[] args) { 
 bSort<String> obj=new bSort<String>(); 
 String[] arr={"a","b","c","gfdgd","f"}; 
 obj.sort(arr); 
 } 
 }
