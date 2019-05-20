package com.MyUniApp.MyUniAppBack.Controller;

import com.MyUniApp.MyUniAppBack.Model.User;
import com.MyUniApp.MyUniAppBack.Repositories.UserRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.ServletException;
import java.util.Date;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping( value = "/login", method = RequestMethod.POST )
    public Token login( @RequestBody User login ) throws ServletException {

        String jwtToken;

        if ( login.getId() == null || login.getPassword() == null )
        {
            throw new ServletException( "Please fill in username and password" );
        }

        String username = login.getId();
        String password = login.getPassword();

        User user;
        if (userRepository.findById(username).isPresent()) {
            user = userRepository.findById(username).get();
        } else {
            throw new ServletException( "User username not found." );
        }

        String pwd = user.getPassword();

        if ( !password.equals( pwd ) )
        {
            throw new ServletException( "Invalid login. Please check your name and password." );
        }
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
