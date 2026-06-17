class Persona {

    /* Create attributes */
    private String name;
    private long phoneNumber;
    private String email;
    private int age;
    
    /* Create constructor method */
    public Persona (String name, long phoneNumber, String email, int age){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
    }

    /* Create getter methods */
    public String getName () {
        return name;
    }
    public long getPhoneNumber () {
        return phoneNumber;
    }
    public String getEmail () {
        return email;
    }
    public int getAge () {
        return age;
    }
}