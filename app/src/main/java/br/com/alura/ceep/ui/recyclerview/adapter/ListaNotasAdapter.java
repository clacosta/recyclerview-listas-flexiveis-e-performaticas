package br.com.alura.ceep.ui.recyclerview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.alura.ceep.R;
import br.com.alura.ceep.model.Nota;

public class ListaNotasAdapter extends RecyclerView.Adapter {

    private List<Nota> notas;
    private Context context;

    public ListaNotasAdapter(Context context, List<Nota> notas){
        this.context = context;
        this.notas = notas;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View viewCriada = LayoutInflater.from(context).inflate(R.layout.item_nota, viewGroup, false);
        return new NotasViewHolder(viewCriada);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        Nota nota = notas.get(i);
        TextView titulo = viewHolder.itemView.findViewById(R.id.item_nota_titulo);
        titulo.setText(nota.getTitulo());
        TextView descricao = viewHolder.itemView.findViewById(R.id.item_nota_descricao);
        descricao.setText(nota.getDescricao());
    }


    @Override
    public int getItemCount() {
        return notas.size();
    }

    class NotasViewHolder extends RecyclerView.ViewHolder {

        public NotasViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
