public class NumberPhoneException extends NumberFormatException {

    public NumberPhoneException() {
        super("номер телефон должен состоять из 10 цифр");
    }
}
