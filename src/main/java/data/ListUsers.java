package data;

import org.testng.Assert;

import java.util.List;

public class ListUsers {
    private String page;
    private String per_page;
    private String total;
    private String total_pages;
    private List<SingleUser> data;
    private Support support;

    public ListUsers() {
        super();
    }

    public ListUsers(String page, String per_page, String total, String total_pages, List<SingleUser> data, Support support) {
        this.page = page;
        this.per_page = per_page;
        this.total = total;
        this.total_pages = total_pages;
        this.data = data;
        this.support = support;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPer_page() {
        return per_page;
    }

    public void setPer_page(String per_page) {
        this.per_page = per_page;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(String total_pages) {
        this.total_pages = total_pages;
    }

    public List<SingleUser> getData() {
        return data;
    }

    public void setData(List<SingleUser> data) {
        this.data = data;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    public void assertFieldsNotNull() {
        for (SingleUser user : data) {
            Assert.assertNotNull(user.getId());
            Assert.assertNotNull(user.getEmail());
            Assert.assertNotNull(user.getFirst_name());
            Assert.assertNotNull(user.getLast_name());
            Assert.assertNotNull(user.getAvatar());
        }
        Assert.assertNotNull(page);
        Assert.assertNotNull(per_page);
        Assert.assertNotNull(total);
        Assert.assertNotNull(total_pages);
        Assert.assertNotNull(support.getText());
        Assert.assertNotNull(support.getUrl());

    }
}