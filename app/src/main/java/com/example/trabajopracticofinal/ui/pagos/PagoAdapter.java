package com.example.trabajopracticofinal.ui.pagos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.trabajopracticofinal.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.List;

import modelo.Contrato;
import modelo.Pago;

public class PagoAdapter extends ArrayAdapter<Pago> {

    private  Context context;
    private List<Pago> pagos;
    private LayoutInflater li;

    public PagoAdapter(@NonNull Context context, int resource, @NonNull List<Pago> objects,LayoutInflater layoutInflater) {
        super(context, resource, objects);
        this.context=context;
        this.pagos=objects;
        this.li=layoutInflater;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View item= convertView;

        if(item == null)
        {
            item= li.inflate(R.layout.contrato_fragment,parent,false);
        }

        Pago pago =pagos.get(position);
        TextInputEditText nroPago= item.findViewById(R.id.etdNroPago);
        TextInputEditText fechaPago= item.findViewById(R.id.etdFechaPago);
        TextInputEditText importePago=item.findViewById(R.id.etdImportePago);

        nroPago.setText(pago.getNroPago());
        fechaPago.setText((CharSequence) pago.getFechaPago());
        importePago.setText(" $" + pago.getImporte());

        return  item;
    }
}
