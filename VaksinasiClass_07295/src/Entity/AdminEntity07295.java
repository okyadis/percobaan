package Entity;

public class AdminEntity07295 extends UserEntityAbstract07295 {
    private String nip;
    private String password;
    
    public AdminEntity07295(int id,String nip, String nama, String alamat, String password, String noTelp){
        super(id,alamat,nama,noTelp);
        this.nip=nip;
        this.password=password;
    }

    
    public String getNip(){
    return nip;
    }
    public void setNik(String nip){
    this.nip = nip;
    }
    
    public String getPassword(){
    return password;
    }
    public void setPassword(String password){
    this.password = password;
    }
}
