package br.com.alura.ceep.ui.recyclerview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import br.com.alura.ceep.model.Nota;

public class ListaNotasAdapter extends RecyclerView.Adapter {

    private List<Nota> notas;

    public ListaNotasAdapter(List<Nota> notas){
        this.notas = notas;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return notas.size();
    }
}
