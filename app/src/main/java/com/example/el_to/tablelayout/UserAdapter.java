package com.example.el_to.tablelayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by el-to on 2/24/2018.
 */

public class UserAdapter extends ArrayAdapter<Usuario> {
    public UserAdapter(Context context, ArrayList<Usuario> objects)
    {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Usuario usuario = getItem(position);
        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.relative_layout, parent, false);
        }

        TextView tvNombre = convertView.findViewById(R.id.text1);
        TextView tvFecha = convertView.findViewById(R.id.text2);

        tvNombre.setText(usuario.nombre);
        tvFecha.setText(usuario.fechaNacimiento);
        return convertView;
    }
}
