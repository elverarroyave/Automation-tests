package co.edu.udea.calidad.model;

public class SocioInformation {
    private String document;

    private String fullName;

    private String email;

    private String phone;

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public SocioInformation(String document, String fullName, String email, String phone) {
        this.document = document;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
    }
}
