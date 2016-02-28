package eveapi;

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
