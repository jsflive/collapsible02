package at.jsflive.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TestController {
    private boolean collapsed = false;

    public boolean isCollapsed() {
        return collapsed;
    }

    public void setCollapsed(boolean collapsed) {
        this.collapsed = collapsed;
    }
}
