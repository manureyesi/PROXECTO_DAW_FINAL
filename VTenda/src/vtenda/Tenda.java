
package vtenda;

/**
 *
 * @author MANU
 */
public class Tenda {
   
    public int nTenda;
    public String nomeTenda;
    public String dir1;
    public String dir2;

    public Tenda() {
    }
    public Tenda(int nTenda, String nomeTenda, String dir1, String dir2) {
        this.nTenda = nTenda;
        this.nomeTenda = nomeTenda;
        this.dir1 = dir1;
        this.dir2 = dir2;
    }
    public void getAll(int nTenda, String nomeTenda, String dir1, String dir2) {
        this.nTenda = nTenda;
        this.nomeTenda = nomeTenda;
        this.dir1 = dir1;
        this.dir2 = dir2;
    }
    
    public String getnTenda() {
        String nn;
        
        nn=this.nTenda+"";
        
        return nn;
    }
    public void setnTenda(int nTenda) {
        this.nTenda = nTenda;
    }

    public String getNomeTenda() {
        return nomeTenda;
    }
    public void setNomeTenda(String nomeTenda) {
        this.nomeTenda = nomeTenda;
    }

    public String getDir1() {
        return dir1;
    }
    public void setDir1(String dir1) {
        this.dir1 = dir1;
    }

    public String getDir2() {
        return dir2;
    }
    public void setDir2(String dir2) {
        this.dir2 = dir2;
    }

    
    
}
