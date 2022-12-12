package com.example.listview;

public class listView {
    private String disease;
    private String docinfo;

    public listView(String disease, String docinfo) {
        this.disease = disease;
        this.docinfo = docinfo;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDocinfo() {
        return docinfo;
    }

    public void setDocinfo(String docinfo) {
        this.docinfo = docinfo;
    }
}
