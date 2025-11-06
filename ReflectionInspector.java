package scenario4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Step 3. Reflection Reader

public class ReflectionInspector {
 public static void main(String[] args) {
     try {
         // Load the class dynamically
         Class<?> clazz = Class.forName("Employee");

         // Print class-level annotation if present
         if (clazz.isAnnotationPresent(DebugInfo.class)) {
             DebugInfo classAnno = clazz.getAnnotation(DebugInfo.class);
             System.out.println("Class Annotation: " + classAnno.value());
         }

         // Inspect and log declared fields
         System.out.println("\nDeclared Fields:");
         for (Field field : clazz.getDeclaredFields()) {
             System.out.println("Field: " + field.getName() + " | Type: " + field.getType().getSimpleName());
             if (field.isAnnotationPresent(DebugInfo.class)) {
                 DebugInfo fieldAnno = field.getAnnotation(DebugInfo.class);
                 System.out.println("  → Annotation: " + fieldAnno.value());
             }
         }

         // Inspect and log declared methods
         System.out.println("\nDeclared Methods:");
         for (Method method : clazz.getDeclaredMethods()) {
             System.out.println("Method: " + method.getName() + " | Return Type: " + method.getReturnType().getSimpleName());
             if (method.isAnnotationPresent(DebugInfo.class)) {
                 DebugInfo methodAnno = method.getAnnotation(DebugInfo.class);
                 System.out.println("  → Annotation: " + methodAnno.value());
             }
         }

         // Dynamically create object and invoke method
         Constructor<?> constructor = clazz.getConstructor(int.class, String.class);
         Object empObj = constructor.newInstance(201, "Alice");
         
         Method displayMethod = clazz.getDeclaredMethod("displayInfo");
         displayMethod.invoke(empObj);

     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}