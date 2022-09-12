package dao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Producto;

/**
 *
 * @author Gabriel Chang
 */
public class DProducto {
    //se crea un arraylist de tipo Producto (clase definida por usuario)
    private ArrayList<Producto> listProducto = new ArrayList<>();
    
    //constructor
    public DProducto() {
    }
    
    //constructor
    public DProducto(ArrayList<Producto> listProducto) {
        this.listProducto = listProducto;
    }

    //getter de listProducto
    public ArrayList<Producto> getListProducto() {
        return listProducto;
    }
    
    //setter de listProducto
    public void setListProducto(ArrayList<Producto> listProducto) {
        this.listProducto = listProducto;
    }
    
    //agregar objeto al arraylist
    public int agregarProducto(int codigo, int precio, 
            int existencia, String nombre) {
        int b = 0;
        Producto prod = new Producto(codigo, precio, existencia, nombre);
        listProducto.add(prod);
        b = 1;
        return b;
    }
 
    //devolver tabla mostrando registros
    public DefaultTableModel getListProd() {
        //se crea una nueva tabal de tipo DefaultTableModel
        DefaultTableModel dtm = new DefaultTableModel();
        
        //dtm = new DefaultTableModel();
        
        //encabezados de columnas (atributos) de tabla
        String titulo[] = {"CÓDIGO", "NOMBRE", "PRECIO ($USD)", "EXISTENCIA"};
        
        //asignar encabezados a columnas de tabla
        dtm.setColumnIdentifiers(titulo);
        
        //usando ciclo for each
        for (Producto prod: listProducto) {
            String reg[] = new String[4];
            reg[0] = "" + prod.getCodigoProd();
            reg[1] = "" + prod.getNombreProd();
            reg[2] = "" + prod.getPrecioProd();
            reg[3] = "" + prod.getExistenciaProd();
            
            dtm.addRow(reg);
        }
        return dtm;
    }
}
