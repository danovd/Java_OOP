package _15_Reflection_Lab_01_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {

        Class <Reflection> clazz = Reflection.class;
        System.out.println("class " + clazz.getSimpleName());

        Class classSuper = clazz.getSuperclass();
        System.out.println(classSuper);
try {
  //  Arrays.stream(clazz.getInterfaces())
  //          .map(Class::getName)
   //         .forEach(System.out::println);

    Class [] interfaces = clazz.getInterfaces();
    for(Class i : interfaces){
        System.out.println(i);
    }

    Constructor<Reflection> ctor = clazz.getDeclaredConstructor();
    Reflection reflection = ctor.newInstance();
    System.out.println(reflection);
}catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException ex){
    System.out.println(ex.getMessage());
}
    }
}
