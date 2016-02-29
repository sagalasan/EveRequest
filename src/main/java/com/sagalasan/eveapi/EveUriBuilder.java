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
package com.sagalasan.eveapi;

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
