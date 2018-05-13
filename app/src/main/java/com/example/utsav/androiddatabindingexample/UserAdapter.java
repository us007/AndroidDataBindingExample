package com.example.utsav.androiddatabindingexample;


import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.utsav.androiddatabindingexample.databinding.ListUserRowBinding;


import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    private LayoutInflater layoutInflater;
    private List<User> userArrayList = new ArrayList<>();

    public UserAdapter( List<User> userArrayList) {
        this.userArrayList = userArrayList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        ListUserRowBinding binding =
                DataBindingUtil.inflate(layoutInflater, R.layout.list_user_row, parent, false);
        return new UserViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.binding.setUser(userArrayList.get(position));
holder.binding.llData.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        
    }
});

    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        ListUserRowBinding binding;

        public UserViewHolder(final ListUserRowBinding itemBinding) {
            super(itemBinding.getRoot());
            this.binding = itemBinding;
        }
    }
}
