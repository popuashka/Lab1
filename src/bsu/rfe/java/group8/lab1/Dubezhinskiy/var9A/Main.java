package bsu.rfe.java.group8.lab1.Dubezhinskiy.var9A;

public class Main {

    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        int itemsSoFar = 0;
        int bigApple = 0;
        int midApple = 0;
        int littleApple = 0;
        int Cheese = 0;
        int eggs1 = 0;
        int eggs2 = 0;
        int eggs3 = 0;
        String[] var10 = args;
        int var11 = args.length;

        int var12;
        for(var12 = 0; var12 < var11; ++var12) {
            String arg = var10[var12];
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
                ++Cheese;
                ++itemsSoFar;
            } else if (parts[0].equals("Apple")) {
                if (parts[1].equals("большое")) {
                    breakfast[itemsSoFar] = new Apple(parts[1]);
                    ++bigApple;
                    ++itemsSoFar;
                }

                if (parts[1].equals("среднее")) {
                    breakfast[itemsSoFar] = new Apple(parts[1]);
                    ++midApple;
                    ++itemsSoFar;
                }

                if (parts[1].equals("маленькое")) {
                    breakfast[itemsSoFar] = new Apple(parts[1]);
                    ++littleApple;
                    ++itemsSoFar;
                }
            }

            if (parts[0].equals("Eggs")) {
                if (parts[1].equals("1")) {
                    breakfast[itemsSoFar] = new Eggs(parts[1]);
                    ++eggs1;
                    ++itemsSoFar;
                }

                if (parts[1].equals("2")) {
                    breakfast[itemsSoFar] = new Eggs(parts[1]);
                    ++eggs2;
                    ++itemsSoFar;
                }

                if (parts[1].equals("3")) {
                    breakfast[itemsSoFar] = new Eggs(parts[1]);
                    ++eggs3;
                    ++itemsSoFar;
                }
            }
        }

        Food[] var15 = breakfast;
        var11 = breakfast.length;

        for(var12 = 0; var12 < var11; ++var12) {
            Food item = var15[var12];
            if (item == null) {
                break;
            }

            item.consume();
        }

        if (bigApple != 0) {
            System.out.println("\nСъедено больших яблок " + bigApple);
        }

        if (midApple != 0) {
            System.out.println("Съедено средних яблок " + midApple);
        }

        if (littleApple != 0) {
            System.out.println("Съедено малых яблок " + littleApple);
        }

        if (Cheese != 0) {
            System.out.println("Съедено сыра " + Cheese);
        }

        if (eggs1 != 0) {
            System.out.println("Съедено 1 яйцо");
        }

        if (eggs2 != 0) {
            System.out.println("Съедено 2 яйца");
        }

        if (eggs3 != 0) {
            System.out.println("Съедено 3 яйца");
        }

        System.out.println("Всего хорошего!");
    }
}
