package pattern.singleton;



public class EnumSingleton {

    public static final int num = 150;

    enum Color {
        RED(1), GREEN(2), BLUE(3);

        private int code;

        Color(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }

    }


    public static void main(String[] args) {
        Color red = Color.RED;
        System.out.println(red.getCode());
        Color green = Color.RED;
        System.out.println(red.equals(green));
        System.out.println(red == green);
        System.out.println(red);

        Integer a = 150;
        Integer b = 150;
        System.out.println(a.equals(b));
        System.out.println(a == b);

        Integer c = num;
        Integer d = num;
        System.out.println(c.equals(d));
        System.out.println(c == d);
    }


}
