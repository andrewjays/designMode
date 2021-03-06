package desiginmode.behaviour.iterator;

/**
 * @author Jay
 * @date 2019/6/23 20:36
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Aggregate<String> a = new ConcreteAggregate<>();
        a.add("Aige");
        a.add("Studio\n");
        a.add("SM");
        a.add("Brother");
        Iterator<String> i = a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}
