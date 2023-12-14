package com.vicente.clubvicentee;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class    UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> users;
    private int selectedPosition = -1;

    private Context context;

    public UserAdapter(List<User> users, Context context) {
        this.users = users;
        this.context = context;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_item, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        User user = users.get(position);
        // Se configura los datos de los elementos de la lista
        holder.nombreTV.setText(user.getNombre());
        holder.telefonoTV.setText(user.getTelefono());
        holder.documentoTV.setText(user.getDocumento());

        // Configura un OnClickListener en el ViewHolder
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Guarda el índice del elemento seleccionado
                setSelectedPosition(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public int getSelectedPosition() {
        return selectedPosition;
    }

    public void setSelectedPosition(int selectedPosition) {
        this.selectedPosition = selectedPosition;
    }

    class UserViewHolder extends RecyclerView.ViewHolder {
        // Se declararan los elementos de la vista (Layout user_item.xml)
        TextView nombreTV, telefonoTV, documentoTV;

        public UserViewHolder(View itemView) {
            super(itemView);
            nombreTV = itemView.findViewById(R.id.txtItemnombre);
            telefonoTV = itemView.findViewById(R.id.txtItemtelefono);
            documentoTV = itemView.findViewById(R.id.txtItemdocumento);
        }
    }

}
