package flow.com.bevflow.utils;

public class ValidationUtils {

    public static boolean validarCnpj(String cnpj) {
        return cnpj.matches("\\d{14}");
    }

    public static boolean validarEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }
}
