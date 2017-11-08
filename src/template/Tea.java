package template;

/**
 * Created by Mayokun on 11/7/2017.
 */
public class Tea extends AbstractBeverage{

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
