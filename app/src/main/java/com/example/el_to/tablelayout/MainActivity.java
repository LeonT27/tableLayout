package com.example.el_to.tablelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        ArrayList<Usuario> listUsuarios = new ArrayList<Usuario>();
        for (int i = 1; i <= 100; i++)
        {
            listUsuarios.add(new Usuario("Luis ("+i+")","dd/MM/yyyy ("+i+")"));
        }

        UserAdapter adapter = new UserAdapter(this, listUsuarios);
        ListView listView = findViewById(R.id.listViewId);

        listView.setAdapter(adapter);
    }
}
