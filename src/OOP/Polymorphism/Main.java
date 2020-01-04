package OOP.Polymorphism;

class Movie{
    private String name;
    public Movie(String name){
        this.name = name;
    }
    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return this.name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Independence Day");
    }
    @Override
    public String plot() {
        return "Alien attempt to take over planet earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetable");
    }
}

public class Main {
    public static void main(String[] args) {
        int i;
        for(i=1;i<11;i++){
            /* look at object code, returns from there, assign different property to movie object
            *  based on the existing corresponding objects
            *  inherits from movie class, assign the plot method to the movie objects in the
            *  polymorphism manner
            *  if no plot has been created in the child class, then go to parent class and grab
            *  the plot's code block from there
            *  essentially, polymorphism = inheritance + override the methods in the base class */
            Movie movie = randomMovie();
            System.out.println("Movie #"+i+" : "+movie.getName()+"\n"+
                                "Plot : " +movie.plot() +"\n" );
        }
    }
    public static Movie randomMovie(){
                                /* return 0~4    now 1 to 5*/
        int randomNumber = (int)(Math.random() * 5 +1);
        System.out.println("Random number generated was "+ randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();

        }
        return null;
    }
}
