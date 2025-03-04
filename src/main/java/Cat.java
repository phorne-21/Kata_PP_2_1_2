import org.springframework.context.annotation.Scope;

// д.б. POJO класс Cat
//    @Scope - новый бин при каждом запросе
public class Cat {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
