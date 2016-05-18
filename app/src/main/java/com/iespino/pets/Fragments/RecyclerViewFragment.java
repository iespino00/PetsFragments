package com.iespino.pets.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iespino.pets.Adapter.Adapter;
import com.iespino.pets.R;
import com.iespino.pets.pojo.Pets;

import java.util.ArrayList;


public class RecyclerViewFragment extends Fragment
{
    private RecyclerView recycler;
    private ArrayList<Pets> items;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);
         //Obtener el Recycler
        recycler = (RecyclerView) v.findViewById(R.id.reciclador);
      //  recycler.setHasFixedSize(true)
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        recycler.setLayoutManager(llm);
        inicializarMascotas();
        inicializarAdaptador();

        return  v;

    }

    public void  inicializarAdaptador()
    {
        // Crear un nuevo adaptador
        Adapter adapter = new Adapter(items);
        recycler.setAdapter(adapter);
    }
    public  void inicializarMascotas()
    {
        // Inicializar Animes
        items = new ArrayList<>();

        items.add(new Pets(R.drawable.pet1, "Speedy", 0));
        items.add(new Pets(R.drawable.pet2, "Pluto", 0));
        items.add(new Pets(R.drawable.pet3, "Doggy", 0));
        items.add(new Pets(R.drawable.pet4, "Hamsty", 0));
        items.add(new Pets(R.drawable.pet5, "Leoni", 0));
        items.add(new Pets(R.drawable.pet6, "TumTum", 0));
        items.add(new Pets(R.drawable.pet7, "Doberto", 0));
    }
}
