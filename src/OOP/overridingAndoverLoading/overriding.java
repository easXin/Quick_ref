package OOP.overridingAndoverLoading;

public class overriding {
    public void bark(){
        System.out.println("woof");
    }
}
/* same name same parameter*/
class overridingTesting extends overriding {
    @Override
    public void bark() {
        super.bark();
    }
}

/*
    1. used to override a behavior which inherits from the parent class
    2. used in is-a relationship
    3. must have same parameter and same name, same return type
       or same covariant return type
    4. must not throw the exception, if it hasn't been used in the parent
       class
    5. must used higher or same level modifier


 */