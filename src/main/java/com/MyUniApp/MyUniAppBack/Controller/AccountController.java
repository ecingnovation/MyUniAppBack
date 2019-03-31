package com.MyUniApp.MyUniAppBack.Controller;

import com.MyUniApp.MyUniAppBack.Exceptions.UserException;
import com.MyUniApp.MyUniAppBack.Model.User;
import com.MyUniApp.MyUniAppBack.Services.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import java.util.Date;

@CrossOrigin(origins = {"http://localhost:3000", "https://myuniapp-eci.firebaseapp.com/"})
@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private UserService userService;

    @RequestMapping( value = "/login", method = RequestMethod.POST )
    public Token login( @RequestBody User login )
            throws ServletException
    {

        String jwtToken;

        if ( login.getId() == null || login.getPassword() == null )
        {
            throw new ServletException( "Please fill in username and password" );
        }

        String username = login.getId();
        String password = login.getPassword();

        User user;
        try {
            user = userService.getUser(username);
        } catch (UserException e) {
            throw new ServletException( "User username not found." );
        }

        String pwd = user.getPassword();

        if ( !password.equals( pwd ) )
        {
            throw new ServletException( "Invalid login. Please check your name and password." );
        }
        //
        jwtToken = Jwts.builder().setSubject( username ).claim( "roles", "user" ).setIssuedAt( new Date() ).signWith(
                SignatureAlgorithm.HS256, "secretkey" ).compact();

        return new Token( jwtToken );
    }

    public class Token
    {
        String accessToken;

        public Token( String accessToken )
        {
            this.accessToken = accessToken;
        }

        public String getAccessToken()
        {
            return accessToken;
        }

        public void setAccessToken( String access_token )
        {
            this.accessToken = access_token;
        }
    }

}
