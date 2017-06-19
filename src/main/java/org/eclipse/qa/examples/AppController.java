/*
 *  [2012] - [2017] Codenvy, S.A.
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Codenvy S.A. and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Codenvy S.A.
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Codenvy S.A..
 */
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
