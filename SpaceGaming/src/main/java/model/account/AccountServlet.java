package model.account;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AccountServlet extends HttpServlet {

    private String getPath(HttpServletRequest request) {
        String path= (request.getPathInfo() != null) ? request.getPathInfo() : "/";
        return path;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String path= getPath(request);
        System.out.println(path);
        switch (path){
            case "/":
                break;
            case "/create":
                break;
            case "/secret":
                break;
            default:
                break;
        }

    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String path= getPath(request);
        System.out.println(path);
        switch (path){
            case "/":
                break;
            case "/create":
                break;
            case "/secret":
                break;
            default:
                break;
        }
    }
}

