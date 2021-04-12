package mx.com.service;

import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.util.List;
import mx.com.datos.ClienteDao;
import mx.com.domain.Cliente;
import mx.com.util.CrearExcel;
import mx.com.util.CrearPdf;

public class ClienteService {

    ClienteDao clD = new ClienteDao();
    
    public List<Cliente> listarClientes(){
        return clD.listarClientes();
    }
    
    public void agregarCliente(Cliente cliente){
        clD.insertarCliente(cliente);
    }
    
    public void modificarCliente(Cliente cliente){
        clD.modificarCliente(cliente);
    }
    
    public void eliminarCliente(Cliente cliente){
        clD.eliminarCliente(cliente);
    }
    
    public void eliminarTodosLosClientes(){
        for(Cliente c: listarClientes()){
            clD.eliminarCliente(c);
        }
    }
    
    public Cliente encontrarPorId(Cliente cliente){
        return clD.encontrarPorID(cliente);
    }
    public List<Cliente> encontrarClientesPorNombre(Cliente cliente){
        return clD.encontrarPorNombre(cliente);
    }
    
    public List<Cliente> encontrarClientePorCUI(Cliente cliente){
        return clD.encontrarPorCUI(cliente);
    }
    public List<Cliente> encontrarClientePorNit(Cliente cliente){
        return clD.encontrarPorNit(cliente);
    }
    
    public void imprimirClientePdf(){
        CrearPdf crear = new CrearPdf();
        try {
            crear.crearListaDeClientes(listarClientes());
        } catch (DocumentException ex) {
            ex.printStackTrace();
            System.out.println("Error 1");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error 2");
        }
    }
    
    public void imprimirClienteExcel(){
        CrearExcel crear = new CrearExcel();
        crear.ImprimirClientes(listarClientes());
    }
    
    public void reiniciarListaCliente(){
        clD.reiniciarContadorClientes();
    }
}
