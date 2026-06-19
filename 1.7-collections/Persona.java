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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (phoneNumber != other.phoneNumber)
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        return true;
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