public class TestRelatable {
        public static void main(String[] args) {
                MyRectangle r1 = new MyRectangle(10, 20);
                MyRectangle r2 = new MyRectangle(40, 50);
                switch (r1.isLargerThan(r2)) {
                        case 1:
                                System.out.println("r1 is greater than r2");
                                break;
                        case 0:
                                System.out.println("r1 is equal to r2");
                                break;
                        default:
                                System.out.println("r1 is less than r2");
                                break;

                }

        }
}
