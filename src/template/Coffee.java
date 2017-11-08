package template;

/**
 * Created by Mayokun on 11/7/2017.
 */
public class Coffee extends AbstractBeverage{

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantsCondiments() {
        return super.customerWantsCondiments();
    }
}
