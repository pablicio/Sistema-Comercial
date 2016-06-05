
package br.com.siscom.renderer;

import br.com.siscom.beans.Cartao;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class CartaoListCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(
            JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof Cartao) {
            Cartao u = (Cartao) value;
            setText(u.getNomeCartao());
        }
        return this;
    }
}