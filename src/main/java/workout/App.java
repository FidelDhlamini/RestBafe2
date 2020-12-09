package workout;

import static spark.Spark.*;

public class App {

    public static void main(String[] args) {

            staticFiles.location("/public");
//        get("/", (request, response) -> "Hello 1");

        post("/greet", (request, response) -> "Hello 2");
//        post("/webcamPage",);
    }




    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }

}
