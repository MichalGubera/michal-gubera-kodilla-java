package test;

public class RouteNotFoundException extends Exception{
    public RouteNotFoundException(){
        super("Sorry, this route doesn't exist.");
    }
}
