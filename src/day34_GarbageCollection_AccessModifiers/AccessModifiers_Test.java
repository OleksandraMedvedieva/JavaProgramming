package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers_Test {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
        // System.out.println(AccessModifiers.privateData); - private access modifier, not avaliable for other classes

        AccessModifiers.method1();
        AccessModifiers.method2();
        // AccessModifiers.method3(); // private access modifier


    }
}
