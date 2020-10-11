package com.example.trabajopracticofinal.ui.pagos;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import com.example.trabajopracticofinal.R;
import com.example.trabajopracticofinal.modelo.Contrato;
import com.example.trabajopracticofinal.modelo.Pago;
import com.example.trabajopracticofinal.ui.contratos.ContratosViewModel;
import com.google.android.material.textfield.TextInputEditText;

import java.util.List;



public class PagoAdapter extends ArrayAdapter<Contrato> {

    private  Context context;
    private List<Contrato> contratos;
    private LayoutInflater li;
    private ContratosViewModel vm;



    public PagoAdapter(@NonNull Context context, int resource, List<Contrato> contratos, LayoutInflater li) {
        super(context, resource, contratos);
        this.context = context;
        this.contratos = contratos;
        this.li = li;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View item= convertView;

        if(item == null)
        {
            item= li.inflate(R.layout.contrato_fragment,parent,false);
        }
      

        Contrato contrato =contratos.get(position);
        TextInputEditText fechaIngreso= item.findViewById(R.id.etdFechaIngreso);
        TextInputEditText fechaSalida= item.findViewById(R.id.etdFechaSalida);
        TextInputEditText importe=item.findViewById(R.id.etdImporte);
        TextInputEditText direccionInquilino=item.findViewById(R.id.etdDireccionInquilino);

        fechaIngreso.setText(contrato.getFechaIngreso());
        fechaSalida.setText(contrato.getFechaSalida());
        importe.setText(" $" +(int) contrato.getImporte());
        direccionInquilino.setText(contrato.getIdInquilino().getDireccion());
        return  item;
    }
}
