package OOP.overridingAndoverLoading;

public class overloading {
    public void bark(){
        System.out.println("woof");
    }
    /* same name different parameter */
    public void bark(int number){
        int i;
        for(i=0; i<number;i++){
            System.out.println("woof");
        }
    }
}
/*
    1. provide functionality to reuse a method name with different
       parameter
    2. commonly used in single class but also child class
    3. Must have different parameter, may have different return type
    4. May have different access, throw different exception

 */