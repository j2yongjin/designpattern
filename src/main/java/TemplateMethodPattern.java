/**
 * Created by yjlee on 2018-01-25.
 */
public class TemplateMethodPattern {

    public static void main(String[] args){

        Payment payment = new BeforeUser();
        payment.pay();

        payment = new AfterUser();
        payment.pay();
    }
}


abstract class Payment{

    public void pay(){
        sendLimit();
        calculate();
        substract();
    }

    private void sendLimit(){
        System.out.println(" sendLimit");
    }

    abstract void calculate();
    abstract void substract();

}

class BeforeUser extends Payment{

    void calculate() {
        System.out.println(" before user calculate");
    }
    void substract() {
        System.out.println(" before user substract");
    }
}

class AfterUser extends Payment{

    void calculate() {
        System.out.println(" after user calcuate");
    }

    void substract() {
        System.out.println(" after user substract");
    }
}
