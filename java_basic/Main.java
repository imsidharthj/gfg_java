// The public class name must match the file name exactly
public class Main {
// this line declear class called Main

    public static void main(String [] argv){
    // public is a access specifier so the main method is accessible from everywhere,
    // static for Main method is to be called without object,
    // void is return type of main,
    // string [] argv is argument of this function
        int age = 40;
        String name = "Sj";
        System.out.println(age);
        System.out.println(name);
        // here System is class provides access to the system, 
        // out is variable of type output stream that is connected to the console for printing something on screen
    }
}
// Use the javac command to compile the .java file into a .class file.