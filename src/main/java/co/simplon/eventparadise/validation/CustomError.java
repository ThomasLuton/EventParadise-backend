package co.simplon.eventparadise.validation;

public class CustomError {
    String code;
    String fieldName;

    public CustomError(String code, String fieldName) {
	this.code = code;
	this.fieldName = fieldName;
    }

    public String getCode() {
	return code;
    }

    public String getFieldName() {
	return fieldName;
    }

    public void setCode(String code) {
	this.code = code;
    }

    public void setMessage(String fieldName) {
	this.fieldName = fieldName;
    }

    @Override
    public String toString() {
	return "{code=" + code + ", fieldName=" + fieldName
		+ "}";
    }

}
