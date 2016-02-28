package eveapi;

/**
 * Created by sagalasan on 2/4/16.
 */
public class EveApiKey
{
  private final int keyId;
  private final String vCode;

  public static final String keyIdKey = "KeyID";
  public static final String vCodeKey = "vCode";

  public EveApiKey(final int keyId, final String vCode)
  {
    this.keyId = keyId;
    this.vCode = vCode;
  }

  public final int getKeyId()
  {
    return keyId;
  }

  public final String getVCode()
  {
    return vCode;
  }
}