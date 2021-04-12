package mx.com.util;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import mx.com.domain.Cliente;

public class CrearPdf {

    

    public void crearListaDeClientes(List<Cliente> clientes) throws FileNotFoundException, DocumentException, IOException {
        String path =  System.getProperty("user.dir");
        path = path.substring(0, 0);
        fecha fc = new fecha();
        OutputStream file = new FileOutputStream(new File(path+fc.obtenerFecha()+".pdf"));
        Document dc = new Document();
        PdfWriter.getInstance(dc, file);

        dc.open();
        PdfPTable tabla = new PdfPTable(13);
        Paragraph p = new Paragraph("Lista De Clientes\n\n", FontFactory.getFont("Arial", 16, Font.ITALIC, BaseColor.BLACK));

        p.setAlignment(Element.ALIGN_CENTER);
        dc.add(p);

        dc.add(new Paragraph(""));

        float[] medidaCeldas = {3.0f, 3.50f, 3.50f, 3.0f, 3.0f, 3.50f, 3.50f, 3.70f, 3.0f, 3.70f, 3.50f, 3.0f, 3.50f};
        
        tabla.setWidths(medidaCeldas);
        tabla.addCell(new Paragraph("ID", FontFactory.getFont("Arial", 6)));
        tabla.addCell(new Paragraph("Nombre", FontFactory.getFont("Arial", 6)));
        tabla.addCell(new Paragraph("Apellido", FontFactory.getFont("Arial", 6)));
        tabla.addCell(new Paragraph("CUI", FontFactory.getFont("Arial", 6)));
        tabla.addCell(new Paragraph("Edad", FontFactory.getFont("Arial", 6)));
        tabla.addCell(new Paragraph("Telefono 1", FontFactory.getFont("Arial", 6)));
        tabla.addCell(new Paragraph("Telefono 2", FontFactory.getFont("Arial", 6)));
        tabla.addCell(new Paragraph("Direccion", FontFactory.getFont("Arial", 6)));
        tabla.addCell(new Paragraph("NIT", FontFactory.getFont("Arial", 6)));
        tabla.addCell(new Paragraph("Email", FontFactory.getFont("Arial", 6)));
        tabla.addCell(new Paragraph("Contribuyente", FontFactory.getFont("Arial", 6)));
        tabla.addCell(new Paragraph("Isr", FontFactory.getFont("Arial", 6)));
        tabla.addCell(new Paragraph("Empresa", FontFactory.getFont("Arial", 6)));

        for (Cliente c : clientes) {
            tabla.addCell(new Paragraph(c.getIdCliente().toString(), FontFactory.getFont("Arial", 6)));
            tabla.addCell(new Paragraph(c.getNombre(), FontFactory.getFont("Arial", 6)));
            tabla.addCell(new Paragraph(c.getApellido(), FontFactory.getFont("Arial", 6)));
            tabla.addCell(new Paragraph(c.getCui().toString(), FontFactory.getFont("Arial", 6)));
            tabla.addCell(new Paragraph(c.getEdad(), FontFactory.getFont("Arial", 6)));
            tabla.addCell(new Paragraph(c.getIdContacto().getTelefono1(), FontFactory.getFont("Arial", 6)));
            tabla.addCell(new Paragraph(c.getIdContacto().getTelefono2(), FontFactory.getFont("Arial", 6)));
            tabla.addCell(new Paragraph(c.getIdDireccion().getDireccion(), FontFactory.getFont("Arial", 6)));
            tabla.addCell(new Paragraph(c.getNit(), FontFactory.getFont("Arial", 6)));
            tabla.addCell(new Paragraph(c.getIdContacto().getEmail(), FontFactory.getFont("Arial", 6)));
            tabla.addCell(new Paragraph(c.getIdContribuyente().getDescripcion(), FontFactory.getFont("Arial", 6)));
            tabla.addCell(new Paragraph(c.getIdIsr().getTipoIsr(), FontFactory.getFont("Arial", 6)));
            tabla.addCell(new Paragraph(c.getIdEmpresa().getNombreEmpresa(), FontFactory.getFont("Arial", 6)));
        }
        dc.add(tabla);
        dc.setMargins(0, 0, 0, 0);
        dc.close();
        file.close();
    }
}
