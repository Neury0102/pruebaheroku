/**
 * Created by Dell_2 on 6/4/2016.
 */
import static spark.Spark.*;


public class Main {


    public static void main(String[] args) {

        get("/hello", (req, res) -> "Heeeeeeeeeeeello World");

    }
}
