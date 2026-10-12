public class Visitor {
    private static int totalVisitors = 0;

    public static int getTotalVisitors() {
        return totalVisitors;
    }

    public Visitor() {
        totalVisitors++;
    }

    public static void main(String[] args) {
        Visitor visitor1 = new Visitor();
        System.out.println(Visitor.getTotalVisitors());
        Visitor visitor2 = new Visitor();
        System.out.println(Visitor.getTotalVisitors());
        Visitor visitor3 = new Visitor();
        System.out.println(Visitor.getTotalVisitors());
        Visitor visitor4 = new Visitor();
        System.out.println(Visitor.getTotalVisitors());
        Visitor visitor5 = new Visitor();
        System.out.println(Visitor.getTotalVisitors());

        //значение одиннаковое, потому что статическая переменная одна на весь класс

    }
}

