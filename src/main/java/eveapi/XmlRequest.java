/*
  Copyright 2016 Sagalasan

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package eveapi;

import java.util.List;

/**
 * Created by sagalasan on 2/27/16.
 */
public abstract class XmlRequest
{
  private EveApiKey apiKey;

  public void setApiKey(EveApiKey apiKey)
  {
    this.apiKey = apiKey;
  }

  public XmlRequest()
  {

  }

  public XmlRequest(final int keyId, final String vCode)
  {
    apiKey = new EveApiKey(keyId, vCode);
  }

  /**
   * Return the path to amend to base url
   * @return Return as String.
   */
  public abstract String getPath();

  public abstract boolean requiresArguments();

  public List<ArgPair> getArguments()
  {
    return null;
  }

  /**
   * Checks to see if the api request requires an api key
   * @return boolean
   */
  public abstract boolean requiresAuthentication();

  public abstract int getAccessMask();

  /**
   * Get the base Uri for the request
   * @return Base uri as string.
   */
  public String getBaseUri()
  {
    return "https://api.eveonline.com";
  }

  public String buildUri()
  {
    EveUriBuilder uriBuilder = new EveUriBuilder(getBaseUri(), getPath());

    if(requiresAuthentication())
    {
      uriBuilder.addApiKey(apiKey);
    }

    if(requiresArguments())
    {
      List<ArgPair> args = getArguments();
      for(int i = 0; i < args.size(); i++)
      {
        ArgPair argPair = args.get(i);
        uriBuilder.addArg(argPair);
      }
    }
    return uriBuilder.getUri();
  }


}
