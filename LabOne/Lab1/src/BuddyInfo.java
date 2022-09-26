public class BuddyInfo {
    private String name;
    private String address;
    private int phoneNumber;

    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    // trying out if the edit pulls
   
    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Homer", "Carleton", 613);
        buddyInfo.setName("Homer");
        System.out.println("Hello " + buddyInfo.getName());
    }
}
