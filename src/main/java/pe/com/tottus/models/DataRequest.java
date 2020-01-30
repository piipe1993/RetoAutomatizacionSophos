package pe.com.tottus.models;

public class DataRequest {

    private String code;
    private String message;

    public DataRequest (String code, String message){
        this.code=code;
        this.message=message;

    }

    public String getcCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
