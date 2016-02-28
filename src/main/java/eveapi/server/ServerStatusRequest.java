package eveapi.server;

import eveapi.ArgPair;
import eveapi.XmlRequest;

import java.util.List;

/**
 * Created by sagalasan on 2/28/16.
 */
public class ServerStatusRequest extends XmlRequest
{
  @Override
  public String getPath()
  {
    return "/server/ServerStatus.xml.aspx";
  }

  @Override
  public boolean requiresArguments()
  {
    return false;
  }

  @Override
  public boolean requiresAuthentication()
  {
    return false;
  }

  @Override
  public int getAccessMask()
  {
    return 0;
  }
}
