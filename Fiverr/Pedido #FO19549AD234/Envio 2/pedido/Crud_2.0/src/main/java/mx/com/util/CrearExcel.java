package mx.com.util;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import mx.com.domain.Cliente;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class CrearExcel {

    public void ImprimirClientes(List<Cliente> clientes) {

        Workbook libro = new HSSFWorkbook();
        Sheet sheet = libro.createSheet("Hoja De Datos");
        Map<Integer, String[]> datos = new TreeMap<Integer, String[]>();
        Integer indentificadores = 1;

        for (Cliente c : clientes) {
            if (indentificadores == 1) {
                datos.put(indentificadores, new String[]{"ID", "Nombre", "Apellido", "CUI", "Edad", "Telefono 1", "Telefono 2", "Direccion", "NIT", "Email", "Contribuyente", "Isr", "Empresa"});
                indentificadores = indentificadores + 1;
                datos.put(indentificadores, new String[]{c.getIdCliente().toString(), c.getNombre(), c.getApellido(),
                    c.getCui().toString(), c.getEdad().toString(), c.getIdContacto().getTelefono1(),
                    c.getIdContacto().getTelefono2(), c.getIdDireccion().getDireccion(),
                    c.getNit(), c.getIdContacto().getEmail(), c.getIdContribuyente().getDescripcion(),
                    c.getIdIsr().getTipoIsr(), c.getIdEmpresa().getNombreEmpresa()});
                indentificadores = indentificadores + 1;
            } else {
                datos.put(indentificadores, new String[]{c.getIdCliente().toString(), c.getNombre(), c.getApellido(),
                    c.getCui().toString(), c.getEdad().toString(), c.getIdContacto().getTelefono1(),
                    c.getIdContacto().getTelefono2(), c.getIdDireccion().getDireccion(),
                    c.getNit(), c.getIdContacto().getEmail(), c.getIdContribuyente().getDescripcion(),
                    c.getIdIsr().getTipoIsr(), c.getIdEmpresa().getNombreEmpresa()});
                indentificadores = indentificadores + 1;
            }
        }

        int numeroRenglon = 0;
        for (Integer llave : datos.keySet()) {
            Row row = sheet.createRow(numeroRenglon++);
            Object[] arregloObjetos = datos.get(llave);
            int numeroCelda = 0;
            for (Object obj : arregloObjetos) {
                Cell cell = row.createCell(numeroCelda++);
                if (obj instanceof String) {
                    cell.setCellValue((String) obj);
                } else if (obj instanceof Integer) {
                    cell.setCellValue((Integer) obj);
                }
            }
        }

        try {
            String path = System.getProperty("user.dir");
            path = path.substring(0, 0);
            fecha fc = new fecha();
            FileOutputStream out = new FileOutputStream(new File(path+fc.obtenerFecha()+".xls"));
            libro.write(out);
            out.close();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }
}
