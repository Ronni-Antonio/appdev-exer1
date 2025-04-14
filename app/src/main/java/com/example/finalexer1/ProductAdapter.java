package com.example.finalexer1;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {
    Context myContext;
    String productNames[];
    String productPrices[];
    TypedArray productImages;

    ItemClickListener itemClickListener;

    public ProductAdapter(Context context){
        myContext = context;
        productNames = myContext.getResources().getStringArray(R.array.productNames);
        productPrices = myContext.getResources().getStringArray(R.array.productPrices);
        productImages = myContext.getResources().obtainTypedArray(R.array.productImages);

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(myContext).inflate(R.layout.productlayout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvProductName.setText(productNames[position]);
        holder.tvProductPrice.setText(productPrices[position]);
        holder.ivProduct.setImageDrawable(productImages.getDrawable(position));


    }

    @Override
    public int getItemCount() {
        if (productNames==null)
            return 0;
        else
            return productNames.length;
    }


public void setItemClickListener(ItemClickListener itemClickListener1){
        itemClickListener = itemClickListener1;
}
    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView ivProduct;
        TextView tvProductName;
        TextView tvProductPrice;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ivProduct = itemView.findViewById(R.id.imageProduct);
            tvProductName = itemView.findViewById(R.id.textProductName);
            tvProductPrice = itemView.findViewById(R.id.textProductPrice);
            itemView.setOnClickListener(this::onClick);


        }

        private void onClick(View view) {

            if(itemClickListener!=null){
                itemClickListener.onClick(view,getAdapterPosition());
            }
        }
    }
}
