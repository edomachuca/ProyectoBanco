package proyectobanco;
/**
 * @author Eduardo
 */
import org.apache.poi.xssf.usermodel.*;
import java.io.*;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class PeopleBank {

    /**
 * @param args the command line arguments
 * @throws java.io.IOException
 * @throws lectorexcel.NoDato
 */

    private String nomArchivo;
    private ListaCliente clientes;
    
    public PeopleBank(String nombre) throws NoDato,IOException,NumberFormatException{
        nomArchivo=nombre; //sede
        clientes=new ListaCliente();
        LegacyLector();
    }
    
    
    private void LegacyLector() throws IOException,NoDato,NumberFormatException {
        FileInputStream file=new FileInputStream(nomArchivo); 
        XSSFWorkbook libro=new XSSFWorkbook(file); 
        XSSFSheet hoja=libro.getSheetAt(0); 
        Iterator rows=hoja.rowIterator(); 
        int j=0;
        while(rows.hasNext()){ 
            XSSFRow row=(XSSFRow) rows.next();
            Iterator cells=row.cellIterator();
            List<String> df=new ArrayList(); // df=datos_fila
            for(int i=0;i<10;i++){
                XSSFCell cell=null;
                if(cells.hasNext())
                    cell=(XSSFCell) cells.next(); 
                try{
                    df.add(agregarCelda(cell));
                }catch(NoDato e){
                    df.add(null); 
                }  
            }
            if(j!=0){
                Cliente c=new Cliente(df.get(1),df.get(2));
                if(!clientes.exist(c))
                    clientes.add(c);

                clientes.setValue(c);
                clientes.addInv(new InversionCliente((int)Double.parseDouble(df.get(0)),df.get(3),(int)Double.parseDouble(df.get(4)),Double.parseDouble(df.get(5)),df.get(7),df.get(8),df.get(9)));
            }
            j++;
        }
        
        if (file != null) 
            file.close();
        
}
    
    private String agregarCelda(XSSFCell cell) throws NoDato{
        if(cell==null)
            throw new NoDato();
        return cell.toString();    
    }
}
