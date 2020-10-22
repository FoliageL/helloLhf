/**
 * @duthor liuhanfeng
 * @Date 2020/10/22 15:49
 */
public class TestHello extends Hello {
    public TestHello(int i) {
        super(i);
        super.run();
        System.out.println(i+1);
    }

    public static void main(String[] args) {
        TestHello testHello = new TestHello(2);
    }
}
