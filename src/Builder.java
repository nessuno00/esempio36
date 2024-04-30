public  class Builder {
    public String firstName;
    public String lastName;
    public int age;
    public String address;

    public Builder(String firstName, String lastName, int age,String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;

    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(this);
    }

}