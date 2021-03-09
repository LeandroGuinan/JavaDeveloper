package beans.helper;

import beans.model.Colonia;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

@RequestScoped
@Named
public class ColoniaHelper {

    public List<Colonia> getColonias() {
        List<Colonia> colonias = new ArrayList<>();

        int coloniaId = 1;
        Colonia colonia = new Colonia(coloniaId++, "Napoles", 3810);
        colonias.add(colonia);

        colonia = new Colonia(coloniaId++, "Polanco", 11530);
        colonias.add(colonia);

        colonia = new Colonia(coloniaId++, "Del Valle Centro", 3100);
        colonias.add(colonia);

        return colonias;
    }

    public int getColoniaIdPorNombre(String nombreColonia) {
        int coloniaId = 0;
        List<Colonia> colonias = this.getColonias();
        for (Colonia col : colonias) {
            if (col.getNombreColonia().equals(nombreColonia)) {
                coloniaId = col.getColoniaId();
                break;
            }
        }

        return coloniaId;
    }

    public int getColoniaIdCodigoPostal(int codigoPostal) {
        int coloniaId = 0;
        List<Colonia> colonias = this.getColonias();

        for (Colonia col : colonias) {
            if (col.getCodigoPostal() == codigoPostal) {
                coloniaId = col.getCodigoPostal();
                break;
            }

        }
        return coloniaId;
    }

    public List<SelectItem> getSelectItems() {
        List<SelectItem> selectItems = new ArrayList<>();
        List<Colonia> colonias = this.getColonias();
        for (Colonia col : colonias) {
            SelectItem selectItem = new SelectItem(col.getColoniaId(), col.getNombreColonia());
            selectItems.add(selectItem);
        }
        return selectItems;
    }
}
