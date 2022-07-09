public class MainApp {
    public static void main(String[] args) {

        Bug bug1 = new Bug("Niepoprawna ilość znaków dla pola 'Numer kontaktowy'", "ada@test1.pl", 2);
        Bug bug2 = new Bug("Zdublowane elementy dla pola 'Pracownik'", "ada@test2.pl", 3);
        bug1.showAllBugInfo();
        bug1.showBugReportersEmail();
        bug1.showBugStatus();
        int bugPriority = bug1.getBugPriority();
        System.out.println(bugPriority);

        bug1.bugStatus = true;

        bug1.showBugStatus();

        bug2.showAllBugInfo();

    }
}