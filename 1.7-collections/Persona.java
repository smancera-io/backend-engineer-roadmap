class Persona implements Comparable {

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

    /* Create setter methods */
    public void setName (String name) {
        this.name = name;
    }
    public void setPhoneNumber (long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setEmail (String email) {
        this.email =email;
    }
    public void setAge (int age) {
        this.age = age;
    }

    public int compareTo(Persona persona){
        return this.name.compareTo(persona.name);
    }
}