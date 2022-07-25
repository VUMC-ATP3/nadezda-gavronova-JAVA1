package homework.oop_homework;

import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date){
        this.customer = customer;
        this.date = date;
    }

    public String getName(){
        return customer.getName();
    }

    public double getServiceExpense() {
        if (!customer.isMember()) {
            return serviceExpense;
        } else {
            return serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType()));
        }
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = this.serviceExpense + serviceExpense;
    }

    public double getProductExpense() {
        if (!customer.isMember()) {
            return productExpense;
        } else {
            return productExpense - (productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType()));
        }
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = this.productExpense + productExpense;
    }

    public double getTotalExpense() {
        return getProductExpense() + getServiceExpense();
    }

    @Override
    public String toString() {
        return ">> Visit: " +
                "Customer = " + customer.getName() +
                " | Customer member = " + customer.isMember() +
                " | Member type = " + customer.getMemberType() +
                " | date = " + date +
                " | Expense of services = " + serviceExpense +
                " | Expense of products = " + productExpense +
                '.';
    }
}
