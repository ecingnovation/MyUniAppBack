package com.MyUniApp.MyUniAppBack.Controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class HomeController {

    @RequestMapping("/")
    void handleFoo(HttpServletResponse response) throws IOException {
        response.sendRedirect("swagger-ui.html");
    }

}