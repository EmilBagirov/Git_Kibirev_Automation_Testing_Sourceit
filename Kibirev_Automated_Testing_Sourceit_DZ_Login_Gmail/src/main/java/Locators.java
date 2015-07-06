
public class Locators {

    private String gmailLink = "https://gmail.com";
    private String errorMessage = "#errormsg_0_Passwd";
    private String passwordField = "#Passwd";
    private String inbox = "span a[href*=\"https://mail.google.com/mail/u/0/#inbox\"]";
    private String starred = "span a[href*=\"https://mail.google.com/mail/u/0/#starred\"]";
    private String important = "span a[href*=\"https://mail.google.com/mail/u/0/#imp\"]";
    private String sent = "span a[href*=\"https://mail.google.com/mail/u/0/#sent\"]";
    private String drafts = "span a[href*=\"https://mail.google.com/mail/u/0/#drafts\"]";
    private String enterButton = "#signIn";

    public String getGmailLink() {
        return gmailLink;
    }

    public void setGmailLink(String gmailLink) {
        this.gmailLink = gmailLink;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(String passwordField) {
        this.passwordField = passwordField;
    }

    public String getInbox() {
        return inbox;
    }

    public void setInbox(String inbox) {
        this.inbox = inbox;
    }

    public String getStarred() {
        return starred;
    }

    public void setStarred(String starred) {
        this.starred = starred;
    }

    public String getImportant() {
        return important;
    }

    public void setImportant(String important) {
        this.important = important;
    }

    public String getSent() {
        return sent;
    }

    public void setSent(String sent) {
        this.sent = sent;
    }

    public String getDrafts() {
        return drafts;
    }

    public void setDrafts(String drafts) {
        this.drafts = drafts;
    }
}
