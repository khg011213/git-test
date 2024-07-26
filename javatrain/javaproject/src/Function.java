/**
 * practice
 */

class TestClass {
    int a;
    int b;
    int c;

    public static TestClass createTestClass(int a, int b, int c){
        TestClass testclass = new TestClass();
        testclass.a = a;
        testclass.b = b;
        testclass.c = c;
        return testclass;
    }

    int setTestNumber(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        return 1;
    }

}




public class Function {
//public, private 프로텍티드는 완전 폐쇄적 3개다 난사 금지//
//메소드 오버로딩 오버라이딩//



    public static void main(String[] args) {
        TestClass testClass = TestClass.createTestClass(150, 300, 450);
        System.out.println(testClass.a);
        System.out.println(testClass.b);
        System.out.println(testClass.c);

        testClass.a = 500;
        testClass.b = 1000;
        testClass.c = 1500;

        System.out.println(testClass.a);
        System.out.println(testClass.b);
        System.out.println(testClass.c);

        System.out.println(testClass.setTestNumber(777, 888, 999));

        System.out.println(testClass.a);
        System.out.println(testClass.b);
        System.out.println(testClass.c);
    }
}