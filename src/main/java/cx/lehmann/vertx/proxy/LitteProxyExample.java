/**
 * 
 */
package cx.lehmann.vertx.proxy;

import org.littleshoot.proxy.HttpProxyServer;
import org.littleshoot.proxy.impl.DefaultHttpProxyServer;

/**
 * @author <a href="http://oss.lehmann.cx/">Alexander Lehmann</a>
 *
 */
public class LitteProxyExample {

  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {
    HttpProxyServer server =
        DefaultHttpProxyServer.bootstrap()
            .withPort(8080)
            .start();
    Thread.sleep(1000000);
  }

}
