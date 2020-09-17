package edu.eci.arep.sparkwebapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * This is a simple WebApplication deployed in Heroku using SparkWeb.
 * @author Johan Arias
 */
@SpringBootApplication
public class SparkWebApp {

    public static void main(String[] args) {
        SpringApplication.run(SparkWebApp.class, args);
    }
    /**

    private static String buildPortfolio(Request request, Response response) {
        response.redirect("static/index.html");
        return "";
    }
    **/

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    /**
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
    **/

}
