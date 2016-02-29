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
package com.sagalasan.eveapi.server;

import com.sagalasan.eveapi.XmlRequest;

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
