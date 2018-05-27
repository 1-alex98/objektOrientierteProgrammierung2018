package Blatt4.Aufgabe3;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Cauliflower essen1 = new Cauliflower();
        student.eat(essen1);
        //b
        Spaghetti essen2 = new Spaghetti();
        student.eat(essen2);
        //c
        Food essen = new Cauliflower();
        student.eat(essen);
    }

    interface Food {
        public String getMeal();
    }

    static class Cauliflower implements Food {
        public String getMeal() {
            return "Blumenkohl an Gorgonzolasoße";
        }
    }

    static class Spaghetti implements Food {
        public String getMeal() {
            return "Spaghetti Bologneser Art";
        }
    }

    static class Student {
        public void eat(Food food) {
            System.out.println("I like " + food.getMeal());
        }

        public void eat(Cauliflower Cauliflower) {
            System.out.println("I don’t like " + Cauliflower.getMeal());
        }
    }

}
