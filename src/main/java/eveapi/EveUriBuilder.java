package eveapi;

/**
 * Created by sagalasan on 2/5/16.
 */
public class EveUriBuilder
{
  private String baseApi;
  private String path;

  private String uri;

  private int argIndex = 0;

  public EveUriBuilder(String baseApi, String path)
  {
    this.baseApi = baseApi;
    this.path = path;
    uri = baseApi + path;
  }

  public void addArg(ArgPair argPair)
  {
    if(argIndex == 0) uri += "?";
    else uri += "&";

    argIndex++;
    uri += argPair.getUriArg();
  }

  public void addApiKey(EveApiKey apiKey)
  {
    ArgPair<Integer> keyId = new ArgPair<>(EveApiKey.keyIdKey, apiKey.getKeyId());
    ArgPair<String> vCode = new ArgPair<>(EveApiKey.vCodeKey, apiKey.getVCode());
    addArg(keyId);
    addArg(vCode);
  }

  public String getUri()
  {
    return uri;
  }
}
