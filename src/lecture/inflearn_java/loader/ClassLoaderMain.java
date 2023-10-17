package lecture.inflearn_java.loader;

public class ClassLoaderMain {
    public static void main(String[] args) throws Exception {
        // a() 메소드를 가지고 있는 클래스가 있다.
        // 클래스 이름이 아직 뭔지 모른다.
        // 나중에 클래스 이름 알려줄게
        // a() 메소드를 일단 실행해봐

        // className에 해당하는 클래스 정보를 CLASSPATH에서 읽어들이고,
        // 그 정보를 clazz가 참조하도록 한다.

        // Object o = new Bus();
        String className = "lecture.inflearn_java.loader.Bus";
        Class clazz = Class.forName(className);
        Object o = clazz.newInstance();
        Bus b = (Bus) o;
        b.a();

        /*Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }*/
    }
}
