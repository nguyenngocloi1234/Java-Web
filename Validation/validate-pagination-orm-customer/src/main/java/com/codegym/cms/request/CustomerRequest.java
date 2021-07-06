package com.codegym.cms.request;

import com.codegym.cms.model.Province;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class CustomerRequest {
    private Long id;
    @NotEmpty
    @Size( max = 5)
    private String firstName;

    @NotEmpty
    @Size( max = 5)
    private String lastName;

    private Province province;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
