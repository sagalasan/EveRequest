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