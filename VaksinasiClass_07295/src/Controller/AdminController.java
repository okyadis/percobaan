package Controller;
import Entity.AdminEntity07295;

public class AdminController extends AllObjectModel{
    
    public void insertData(String nama, String npm, String password, String no_telp){
        AllObjectModel.adminModel.insertData(new AdminEntity07295(nama,npm,password,no_telp));
    }
    
    public void deleteData(int id){
        AllObjectModel.adminModel.deleteData(id);
    }
    
    public void updatePassword(String pass, int id){
        AllObjectModel.adminModel.updatePassword(pass,id);
    }
    
    public void verifMahasiswa(int id){
        AllObjectModel.adminModel.verifMahasiswa(id);
    }
    
    public int login (String npm,String password){
        int log =AllObjectModel.adminModel.cekLogin(npm,password);
        return log;
    }
    
}
