public class boxandunbox {
    public static void main(String[] args) {
        int primitive = 10;
        Integer boxed = primitive; 
        System.out.println("Boxed Integer: " + boxed);
        int unboxed = boxed; 
        System.out.println("Unboxed int: " + unboxed);
    }
}
