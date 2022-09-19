import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddyInfo;
    int i;

    public AddressBook() {
        buddyInfo = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddyInfo != null) {
            buddyInfo.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int i) {
        if (i < this.buddyInfo.size() && i > 0) {
            return buddyInfo.remove(i);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
