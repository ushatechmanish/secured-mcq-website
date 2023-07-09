package in.ushatech.securedmcqwebsite.filters;

import com.sun.webkit.dom.HTMLTableCaptionElementImpl;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;
import java.io.IOException;

@Component
public class SecurityFilter extends HttpFilter
{
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException
    {
        chain.doFilter(request,response);
    }

}
