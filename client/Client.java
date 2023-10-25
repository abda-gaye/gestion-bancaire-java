public class Client {
    private Long code;
    private String fullname;
    private String id;


    public Client(Long code, String fullname, String id) 
    {
        this.code = code;
        this.id = id;

        this.fullname = fullname;
    }

    //getters
    public Long getCode()
    {
        return code;
    }

    public String getFullname()
    {
        return fullname;
    }

     public String getId()
    {
        return id;
    }

    //setters

    public void setCode(Long code)
    {
        this.code = code;
    }

    public void setFullname(String fullname)
    {
        this.fullname = fullname;
    }

    public void setId(String id)
    {
        this.id = id;
    }
}