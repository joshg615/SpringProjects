import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        

        Parrot parrot = new Parrot();

    }

}
