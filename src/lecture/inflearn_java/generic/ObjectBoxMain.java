package lecture.inflearn_java.generic;

public class ObjectBoxMain {
    public static void main(String[] args) {
        ObjectBox box = new ObjectBox();
        box.set("kim");
        String str = (String) box.get();
        System.out.println(str.toUpperCase());

        box.set(new Integer(5));
        Integer i = (Integer) box.get();
        System.out.println(String.valueOf(i.intValue()));
    }
}
