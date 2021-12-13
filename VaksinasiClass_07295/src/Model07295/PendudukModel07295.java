
package Model07295;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Entity.PendudukEntity07295;
import helper.KoneksiDb07295;
import java.sql.Connection;


public class PendudukModel07295 {
    private String sql;
    public Connection conn= KoneksiDb07295.getconection();
    
        public ArrayList<PendudukEntity07295> getPenduduk(){
        ArrayList<PendudukEntity07295> arraylistMahasiswa= new ArrayList<>();
        try{
            Statement stat=conn.createStatement();
            sql="SELECT*FROM penduduk";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                PendudukEntity07295 mahasiswaentity=new PendudukEntity07295();
                mahasiswaentity.setId(rs.getInt("id"));
                mahasiswaentity.setNama(rs.getString("nama"));
                mahasiswaentity.setNik(rs.getString("nik"));
                mahasiswaentity.setAlamat(rs.getString("alamat");
                mahasiswaentity.setDosis(rs.getString("dosis"));
                mahasiswaentity.setJns_vaksin(rs.getString("jns_vaksin"));
                arraylistMahasiswa.add(mahasiswaentity);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return arraylistMahasiswa;
    }
    
    
    
}
