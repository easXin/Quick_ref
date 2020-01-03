package OOP.Class;
// A class is blueprint for the object we create
public class Car {
    // always go with private, descriptive of car

    /* state component, private : don't allow the class on outside to access vars */
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String coulor;

    // allow a method to upload the model

    public void setModel(String model){
        // use this keyword to class variable
        String validModel = model.toLowerCase();
        /* .equals()  test if the value equals to another type*/
        /* valid the data beforehand*/
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }

    }
    public String getModel(){
        return this.model;
    }
}
