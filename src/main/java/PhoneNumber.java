public class PhoneNumber {
    private String phoneType;
    private String number;

    public PhoneNumber() {
    }

    public PhoneNumber(String phoneType, String number) {
        this.phoneType = phoneType;
        this.number = number;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneType='" + phoneType + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
