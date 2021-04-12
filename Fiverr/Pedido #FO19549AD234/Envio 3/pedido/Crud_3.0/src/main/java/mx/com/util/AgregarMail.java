package mx.com.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AgregarMail {

    public boolean validar(String mail) {
        Pattern patron = Pattern
				.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
						+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher ma = patron.matcher(mail);

        if (ma.find() == true) {
            return true;
        }else{
            return false;
        }
    }
}
