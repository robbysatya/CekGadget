        package com.robby.dicoding.cekgadget;

        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

        import com.bumptech.glide.Glide;
        import com.bumptech.glide.request.RequestOptions;

        import java.util.ArrayList;

public class GadgetAdapter extends RecyclerView.Adapter<GadgetAdapter.ListViewHolder> {
    private ArrayList<Gadget> list_gadget;
    private ItemClickCallBack itemClickCallBack;

    public void setItemClickCallBack(ItemClickCallBack itemClickCallBack){
        this.itemClickCallBack = itemClickCallBack;
    }

    public GadgetAdapter(ArrayList<Gadget> list){
        this.list_gadget = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_hp, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Gadget gadget = list_gadget.get(position);
        Glide.with(holder.itemView.getContext()).load(gadget.getImg()).apply(new RequestOptions().override(55, 55)).into(holder.img_gadget);
        holder.text_judul.setText(gadget.getName());
        holder.text_detail.setText(gadget.getDetail());

        holder.itemView.setOnClickListener(view -> itemClickCallBack.itemClicked(list_gadget.get(holder.getAdapterPosition())));
    }

    public interface ItemClickCallBack {
        void itemClicked(Gadget data);
    }

    @Override
    public int getItemCount() {
        return list_gadget.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder{
        ImageView img_gadget;
        TextView text_judul, text_detail;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);

            img_gadget = itemView.findViewById(R.id.img);
            text_judul = itemView.findViewById(R.id.text_judul);
            text_detail = itemView.findViewById(R.id.text_detail);
        }
    }
}