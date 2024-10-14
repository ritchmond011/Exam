class Exam {
    protected String message;
    protected double price;
    protected boolean status;

    public Exam() {
        this.message = "Good luck";
    }

    public Exam(String period, String level) {
        this.message = "Good luck";
        System.out.println("Period: " + period + ", Level: " + level);
    }

    public double getPrice() {
        return price;
    }

    public boolean isFinished() {
        return status;
    }
}

class Midterm extends Exam {
    public Midterm() {
        super();
        if (this.getClass() == Midterm.class) {  
            System.out.println("Exam has started.");
        }
    }
}

class Essay extends Midterm {
    public Essay() {
        super();
    }
}

class Quiz {
}

class DerivedEssay extends Quiz {
}

public class Main {
    public static void main(String[] args) {
        Exam exam1 = new Exam();
        System.out.println("Message: " + exam1.message);

        Exam exam2 = new Exam("Midterm", "College");

        Midterm midterm = new Midterm();  

        Essay essay = new Essay();  
    }
}
