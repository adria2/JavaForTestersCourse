public class Bug {
    String bugDescription;
    String reporterEmail;
    int bugPriority;
    boolean bugStatus;

    // KONSTRUKTOR: Generate -> Constructor
    public Bug(String bugDescription, String reporterEmail, int bugPriority) {
        this.bugDescription = bugDescription;
        this.reporterEmail = reporterEmail;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
    }

    // METODY
    void showAllBugInfo() {
        //ciało metody
        System.out.println("Bug description: " + bugDescription + ". Bug reporter's email: "
                + reporterEmail + ". Bug priority: " + bugPriority + ". Bug status: " + bugStatus + ".");
    }

    void showBugReportersEmail() {
        //ciało metody
        System.out.println("Bug reporter's email: " + reporterEmail + ".");
    }

    void showBugStatus() {
        //ciało metody
        System.out.println("Closed issue: " + bugStatus);
    }

    int getBugPriority() {
        //ciało metody
        return bugPriority;
    }

}
