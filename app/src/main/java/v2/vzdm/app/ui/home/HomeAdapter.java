package v2.vzdm.app.ui.home;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import v2.vzdm.app.Models.Item;
import v2.vzdm.app.R;
import v2.vzdm.app.Utils.Session;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    List<Item> automobileList;
    Context context;
    private Session session;

    public HomeAdapter(List<Item> automobileList, Context context) {
        this.automobileList = automobileList;
        this.context = context;
    }

//    public HomeAdapter(List<Test> automobileList) {
//        this.automobileList = automobileList;
//    }

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

        Item item =automobileList.get(position);
        String carModel = item.getCarModel();
        String yearModel = item.getYearModel()+", ";
        String modelMileage = item.getMileage()+"km";
        String motorPrice = "€"+item.getMotorPrice().toString();
        String addressOne = "PLZ:"+item.getAddress1() + ",";
        String addressTwo = item.getAddress2() + ",";
        String addressThree = item.getAddress3();
        String phoneNumber = item.getPhoneNo();
        //String phoneNumber = "Batman origins";



        holder.modelName.setText(carModel);
        holder.modelDesc.setText(yearModel);
        holder.modelMileage.setText(modelMileage);
        holder.modelPrice.setText(motorPrice);

        holder.addressOne.setText(addressOne);
        holder.addressTwo.setText(addressTwo);
        holder.addressThree.setText(addressThree);


        if(phoneNumber.isEmpty()) {
            holder.callPerson.setText("Search");
            holder.callPerson.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_search_24,0,0,0);
            holder.callPerson.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   Uri uri = Uri.parse("https://www.google.com/search?q="+ item.getSellerName()+"+"+item.getAddress1()+"+"+item.getAddress2()+"+"+item.getAddress3());
                   Intent  intent = new Intent(Intent.ACTION_VIEW, uri);
                   intent.putExtra(SearchManager.QUERY,item.getSellerName());
                   context.startActivity(intent);

                }
            });

        }
        else{

            holder.callPerson.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkCallPermission(phoneNumber);

                }
            });
        }


        Glide
                .with(this.context)
                .load(automobileList.get(position).getImageUrl())
                .placeholder(R.drawable.placeholder)
                .override(400,500)
                .into(holder.modelImage);
    }

    private void checkCallPermission(String phoneNumber){

        if(ActivityCompat.checkSelfPermission(context, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
            if(ActivityCompat.shouldShowRequestPermissionRationale((Activity) context,Manifest.permission.CALL_PHONE)){
                AlertDialog alertDialog = new AlertDialog.Builder(context,R.style.DialogTheme)
                        .setTitle("Call Permission needed")
                        .setMessage("This app needs the Call  permission permission , please accept to use Call functionality")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent();
                                intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                                Uri uri = Uri.fromParts("package","com.example.autoapp",null);
                                intent.setData(uri);
                                context.startActivity(intent);
                            }
                        })
                        .create();
                alertDialog.setCancelable(false);
                alertDialog.show();
            }
            else {
                ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.CALL_PHONE}, 1);
            }

        }
        else {
            Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNumber));
            context.startActivity(intent);
        }

    }



    @Override
    public int getItemCount() {
        return automobileList.size();
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
