
    public class LoopingSSO {

        public static void main(String[] args) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i + j < 3) {
                        System.out.print("S ");
                    } else {
                        System.out.print("O ");
                    }
                }
                System.out.println();
            }
        }
    }

