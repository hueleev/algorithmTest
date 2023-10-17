package lecture.inflearn_java.generic;

public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.set("test");
        String str = genericBox.get();
        System.out.println(str);

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.set(3);
        Integer intValue = intBox.get();
        System.out.println(intValue);

        GenericBox<Object> objBox = new GenericBox<>();
        objBox.set("obj");
        System.out.println((String) objBox.get());
    }
}
