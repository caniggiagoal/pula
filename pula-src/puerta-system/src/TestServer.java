import javax.servlet.ServletException;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestServer {

    private static final Logger logger = LoggerFactory.getLogger(TestServer.class);

    public static Tomcat startServer(String contextPath, String baseDir, int port) {
        Tomcat tomcat = new Tomcat();

        try {
            tomcat.setPort(port);
            tomcat.init();
            tomcat.addWebapp(contextPath, baseDir);
            tomcat.start();
        } catch (ServletException e) {
            logger.error(String.format("start server failed: contextPath %s, baseDir %s!", contextPath, baseDir), e);
            return null;
        } catch (LifecycleException e) {
            logger.error(String.format("start server failed: contextPath %s, baseDir %s!", contextPath, baseDir), e);
        }
        return tomcat;
    }
}