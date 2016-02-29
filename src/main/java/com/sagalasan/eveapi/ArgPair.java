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
public class ArgPair<E>
{
  private final String key;
  private final E argument;

  public ArgPair(final String key, final E argument)
  {
    this.key = key;
    this.argument = argument;
  }

  public String getUriArg()
  {
    return key + "=" + argument.toString();
  }

  public static void main(String[] args)
  {
    ArgPair<Integer> argPair = new ArgPair<>("Hello", 12434);
    System.out.println(argPair.getUriArg());
  }
}
