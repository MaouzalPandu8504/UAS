import java.util.Scanner;
import java.util.ArrayList;
public class UAS1B {
    private String setID;
    private String setUserName;
    private String setFullName;
    private String setPosted;
    private void setPosted(ArrayList<String> myPost) {
    }

    public String getSetID() {
        return setID;
    }

    public void setSetID(String setID) {
        this.setID = setID;
    }

    public String getSetUserName() {
        return setUserName;
    }

    public void setSetUserName(String setUserName) {
        this.setUserName = setUserName;
    }

    public String getSetFullName() {
        return setFullName;
    }

    public void setSetFullName(String setFullName) {
        this.setFullName = setFullName;
    }

    public String getSetPosted() {
        return setPosted;
    }

    public void setSetPosted(String setPosted) {
        this.setPosted = setPosted;
    }

    public UAS1B() {
    }

    public UAS1B(String setID, String setUserName, String setFullName, String setPosted) {
        this.setID = setID;
        this.setUserName = setUserName;
        this.setFullName = setFullName;
        this.setPosted = setPosted;
    }

    public int ShowNumberOfPost () {
        System.out.println(4);
        return ShowNumberOfPost();
    }

    public static void main(String[] args) {
        int jumpos = 4;
        Scanner sc = new Scanner(System.in);
        UAS1B user1 = new UAS1B("001", "dbgb4a", "Debby Gibson", "4");
        ArrayList<String> myPost = new ArrayList<>();
        for (int index = 0; index <jumpos; index++) {
            myPost.add(sc.nextLine());
        }
        user1.setPosted(myPost);
        System.out.println("Total Posted : " + user1.ShowNumberOfPost());
    }
}
