package homework.oop_homework;

public class Customer {
    private String name;
    private boolean member = false;
    private String memberType; //Premium, Gold, Silver

    public Customer(String name) { //konstruktors
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean isMember(){
        return member;
    }

    public void setMember(boolean member){
        this.member = member;
    }

    public String getMemberType(){
        return memberType;
    }

    public void setMemberType(String type){
        this.memberType = type;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}
