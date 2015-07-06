
public class Locators {

    private static String gmailLink = "https://mail.google.com/";
    private static String errorMessage = "#errormsg_0_Passwd";
    private static String passwordField = "#Passwd";
    private static String sigtInButton = "#signIn";
    private static String inbox = "span a[href*=\"https://mail.google.com/mail/u/0/#inbox\"]";
    private static String starred = "span a[href*=\"https://mail.google.com/mail/u/0/#starred\"]";
    private static String important = "span a[href*=\"https://mail.google.com/mail/u/0/#imp\"]";
    private static String sent = "span a[href*=\"https://mail.google.com/mail/u/0/#sent\"]";
    private static String drafts = "span a[href*=\"https://mail.google.com/mail/u/0/#drafts\"]";

    public static String getSigtInButton() {
        return sigtInButton;
    }

    public static void setSigtInButton(String sigtInButton) {
        Locators.sigtInButton = sigtInButton;
    }

    public static String getGmailLink() {
        return gmailLink;
    }

    public static void setGmailLink(String gmailLink) {
        Locators.gmailLink = gmailLink;
    }

    public static String getErrorMessage() {
        return errorMessage;
    }

    public static void setErrorMessage(String errorMessage) {
        Locators.errorMessage = errorMessage;
    }

    public static String getPasswordField() {
        return passwordField;
    }

    public static void setPasswordField(String passwordField) {
        Locators.passwordField = passwordField;
    }

    public static String getInbox() {
        return inbox;
    }

    public static void setInbox(String inbox) {
        Locators.inbox = inbox;
    }

    public static String getStarred() {
        return starred;
    }

    public static void setStarred(String starred) {
        Locators.starred = starred;
    }

    public static String getImportant() {
        return important;
    }

    public static void setImportant(String important) {
        Locators.important = important;
    }

    public static String getSent() {
        return sent;
    }

    public static void setSent(String sent) {
        Locators.sent = sent;
    }

    public static String getDrafts() {
        return drafts;
    }

    public static void setDrafts(String drafts) {
        Locators.drafts = drafts;
    }
}
