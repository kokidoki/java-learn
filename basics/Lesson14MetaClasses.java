import lesson6.Strawberry;

// Meta = info about itself; meta class is class that gives info on type
// java.lang.Class is special type that gives info about any type; aka reflective type
// process of discovering types is called class reflection or introspective
public class Lesson14MetaClasses {
  public static void main(String[] args) throws Exception {
    Strawberry cake = new Strawberry();
    // System.out.println(cake);

    Class<?> a = cake.getClass();
    // System.out.println(a);

    // System.out.println(a.getName());
    // System.out.println(a.getMethods());
    for (java.lang.reflect.Method method : a.getMethods()) {
      // System.out.println(method);
    }

    Class<Strawberry> b = Strawberry.class;
    // System.out.println(b);
    Strawberry c = b.newInstance();
    // System.out.println(c);

    Class<?> e = Class.forName(args[0]);
    Object f = e.newInstance();
    if (f instanceof Strawberry) {
      Strawberry fStrawberry = (Strawberry)f;
      fStrawberry.washFruit();
    }
    System.out.println(f);
  }
}
