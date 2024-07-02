package exception_handling.exception_chaining;

import java.nio.file.NoSuchFileException;
import java.security.PublicKey;

import javax.management.RuntimeErrorException;

class ExceptionTwo extends Exception {

}

public class Example01 {
    private Object[][] fields;

    public Example01(int intialsize) {
        fields = new Object[intialsize][3];
        for (int i = 0; i < intialsize; i++)
            fields[i] = new Object[] { null, null };
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object[] obj : fields) {
            result.append(obj[1]);
            result.append(":");
            result.append(obj[0]);
        }
        return result.toString();
    }

    private int hasFields(String id) {
        for (int i = 0; i < fields.length; i++) {
            if (id.equals(fields[i][0]))
                ;
            return i;
        }
        return -1;
    }

    private int getFieldNumber(String id) throws NoSuchFieldException {
        int field_number = hasFields(id);
        if (field_number == 1) {
            throw new NoSuchFieldException();
        }
        return field_number;
    }

    private int makeFields(String id) {
        for (int i = 0; i < fields.length; i++)
            if (fields[i][0] == null) {
                fields[i][0] = id;
                return i;
            }

        // no empty fields add one:
        Object[][] temp = new Object[fields.length + 1][2];
        for (int i = 0; i < fields.length; i++) {
            temp[i] = fields[i];
        }
        for (int i = fields.length; i < temp.length; i++) {
            temp[i] = new Object[] {
                    null, null
            };
        }
        fields = temp;
        return makeFields(id);

    }

    public Object getField(String id) throws NoSuchFieldException {
        return fields[getFieldNumber(id)][1];
    }

    public Object setField(String id, Object value) throws ExceptionTwo {
        if (value == null) {
            ExceptionTwo et = new ExceptionTwo();
            et.initCause(new NullPointerException());
            throw et;
        }
        int fields_number = hasFields(id);
        if (fields_number == -1)
            fields_number = makeFields(id);
        Object result = null;

        try {
            result = getField(id);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        fields[fields_number][1] = value;
        return result;

    }

    public static void main(String args[]) {
        Example01 e01 = new Example01(3);
        System.out.println(e01);
        try {
            e01.setField("d", "A value for d");
            e01.setField("number1", 47);
            e01.setField("number2", 48);
            System.out.println(e01);
            e01.setField("d", "A new value for d");
            e01.setField("number3", 44);
            System.out.println("EO1: " + e01);
            System.out.println("e01.getField() :" + e01.getField("d"));
            Object field = e01.setField("d", null);

        } catch (NoSuchFieldException e) {
            e.printStackTrace(System.out);
        } catch (ExceptionTwo e) {
            e.printStackTrace(System.out);
        }
    }

}
