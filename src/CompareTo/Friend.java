package CompareTo;

class Friend {
    String lastName;
    String firstName;
    String phoneNumber;
    String birthdate;

    public Friend (String name, String lastname, String phone, String birthdate){
        this.firstName = name;
        this.lastName = lastname;
        this.phoneNumber = phone;
        this.birthdate = birthdate;
    }

    public int compareTo(Friend anotherFriend) {
        int compare_surname = this.lastName.compareTo(anotherFriend.lastName);
        int compare_name = this.firstName.compareTo(anotherFriend.firstName);
        int comparison = 0;
        if (compare_surname < 0){
            comparison = 1;
        }
        else if (compare_surname == 0){
            if (compare_name < 0){
                comparison = 1;
            }
            else if(compare_name == 0){
                comparison = -1;
            }
        }
        return comparison;
    }
}