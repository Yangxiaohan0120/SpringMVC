package springmvc.entity;

/**
 * @author Chris Yang
 * created 2022-07-20 12:43
 **/
public class Delivery {
    private String name;
    private String mobile;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
