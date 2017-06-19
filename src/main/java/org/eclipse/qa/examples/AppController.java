package org.eclipse.qa.examples;

import java.util.Random;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppController implements Controller {
    private static final String secretNum = Integer.toString(new Random().nextInt(10));

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String numGuessByUser = request.getParameter("numGuess");
        String result = "";
        
        if (numGuessByUser != null && numGuessByUser.equals(secretNum)) {
            result = "Congrats! The number is " + secretNum;
        } 
        
        else if (numGuessByUser != null) {
            result = "Sorry, you failed. Try again later!";
        }

        ModelAndView view = new ModelAndView("guess_num");
        view.addObject("num", result);
        return view;
    }
}
