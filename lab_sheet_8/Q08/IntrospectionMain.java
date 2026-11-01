package lab_sheet_8.Q08;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class IntrospectionMain {
    public static void main(String[] args) throws Exception {
        BeanInfo beanInfo = Introspector.getBeanInfo(StudentBean.class, Object.class);

        System.out.println("Properties:");
        for (PropertyDescriptor property : beanInfo.getPropertyDescriptors()) {
            System.out.println(property.getName() + " (read: "
                    + methodName(property.getReadMethod()) + ", write: "
                    + methodName(property.getWriteMethod()) + ")");
        }

        System.out.println("Methods:");
        for (Method method : Arrays.stream(beanInfo.getMethodDescriptors())
                .map(descriptor -> descriptor.getMethod())
                .sorted((first, second) -> first.getName().compareTo(second.getName()))
                .toArray(Method[]::new)) {
            System.out.println(method);
        }
    }

    private static String methodName(Method method) {
        return method == null ? "none" : method.getName();
    }
}
