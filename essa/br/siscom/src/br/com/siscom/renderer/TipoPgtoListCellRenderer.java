package br.com.siscom.renderer;

import br.com.siscom.beans.TipoPgto;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class TipoPgtoListCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(
            JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof TipoPgto) {
            TipoPgto u = (TipoPgto) value;
            setText(u.getDescricaoTipoPgto());
        }
        return this;
    }
}