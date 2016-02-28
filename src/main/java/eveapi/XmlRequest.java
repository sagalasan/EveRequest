package eveapi;

/**
 * Created by sagalasan on 2/27/16.
 */
public abstract class XmlRequest
{

  public interface Public
  {
  }

  public interface Authenticated
  {
  }

  /**
   * Get the base Uri for the request
   * @return Base uri has string.
   */
  public String getBaseUri()
  {
    return "https://api.eveonline.com/";
  }

  /**
   * Return the path to amend to base url
   * @return Return as String.
   */
  public abstract String getPath();
}
