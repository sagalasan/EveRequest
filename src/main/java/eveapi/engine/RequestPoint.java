package eveapi.engine;

import eveapi.server.ServerStatusRequest;
import org.slf4j.Logger;

import java.util.Arrays;

/**
 * Created by sagalasan on 2/27/16.
 */
public class RequestPoint
{
  public static byte[] getServerStatus()
  {
    return RequestEngine.xmlRequest(new ServerStatusRequest());
  }

  public static void main(String[] args)
  {
    byte[] bytes = RequestPoint.getServerStatus();
    System.out.println(new String(bytes));
  }
}
