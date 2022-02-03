package v2.vzdm.app.ui.notifications;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import v2.vzdm.app.Models.Item;
import v2.vzdm.app.R;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewHolder> {

    List<Item> automobileList;
    Context context;

    public NotificationAdapter(List<Item> automobileList, Context context) {
        this.automobileList = automobileList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View  view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product,parent,false);
        view.setClickable(true);
        view.setFocusableInTouchMode(true);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }



    @Override
    public int getItemCount() {
        return 0;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView modelImage;
        TextView modelName;
        TextView modelDesc;
        TextView modelMileage;
        TextView modelPrice;
        TextView addressOne;
        TextView addressTwo;
        TextView addressThree;
        Button callPerson;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            modelImage = itemView.findViewById(R.id.model_image);
            modelName = itemView.findViewById(R.id.model_name);
            modelDesc = itemView.findViewById(R.id.model_year);
            modelMileage = itemView.findViewById(R.id.totalMileage);
            modelPrice = itemView.findViewById(R.id.motor_price);
            addressOne = itemView.findViewById(R.id.address_one);
            addressTwo = itemView.findViewById(R.id.address_two);
            addressThree = itemView.findViewById(R.id.address_three);
            callPerson = itemView.findViewById(R.id.call_person);




        }
    }
}
