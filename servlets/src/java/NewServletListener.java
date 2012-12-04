/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author tom
 */
@WebListener()
public class NewServletListener implements ServletContextListener, HttpSessionListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
	throw new UnsupportedOperationException("Not supported yet.");
    }
}
