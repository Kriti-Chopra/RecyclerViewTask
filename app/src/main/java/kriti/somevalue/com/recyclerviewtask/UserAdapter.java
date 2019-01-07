package kriti.somevalue.com.recyclerviewtask;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {

    private List<User> userList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView txtName,txtAge;

        public MyViewHolder(View view){
            super(view);
            txtName=(TextView) view.findViewById(R.id.txtName);
            txtAge=(TextView) view.findViewById(R.id.txtAge);
        }
    }

    public UserAdapter(List<User> userList){
        this.userList=userList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View item=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_list_row,viewGroup,false);
        return new MyViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        User user=userList.get(i);
        myViewHolder.txtName.setText(user.getName());
        myViewHolder.txtAge.setText(user.getAge());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}
