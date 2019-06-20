package inheritanceAndPolymorphismPracticeTheSecond;

public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length){
        super();
        setWidth(width);
        setLength(length);
    }

    public Rectangle(double width, double length, String colour, boolean filled){
        super(colour, filled);
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0) {
            this.width = width;
        }
        else{
            System.out.println("inputted width not above zero");
        }
    }

    void inputWidth() {
        System.out.println("Input Rectangle width( like 1 or 0,213)");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        try {
            String userWidth = scan.next();
            double width = Double.parseDouble(userWidth);
            setWidth(width);
        }
        catch(NumberFormatException ex){
            System.out.println("Invalid width value");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length > 0) {
            this.length = length;
        }
        else{
            System.out.println("inputted length not above zero");
        }
    }

    void inputLength() {
        System.out.println("Input Rectangle length( like 1 or 0,213)");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        try {
            String userLength = scan.next();
            double length = Double.parseDouble(userLength);
            setLength(length);
        }
        catch(NumberFormatException ex){
            System.out.println("Invalid length value");
        }
    }

    public double getPerimeter() {
        return 2*width*length;
    }

    @Override
    public String toString()
    {
        return  "A Rectangle with width = " + width +
                " and length = " + length +
                ", which is a subclass of " + super.toString();
    }

}
