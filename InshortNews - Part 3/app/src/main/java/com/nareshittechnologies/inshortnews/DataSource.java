
package com.nareshittechnologies.inshortnews;

import java.util.List;

public class DataSource {

    private String category;
    private List<Datum> data = null;
    private Boolean success;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

}
