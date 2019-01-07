package kriti.somevalue.com.recyclerviewtask;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<User> userList=new ArrayList<>();
    private RecyclerView recyclerView;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        userAdapter=new UserAdapter(userList);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(userAdapter);

        prepareUserList();
    }

    public void prepareUserList(){
        User user=new User("Kriti","21");
        userList.add(user);

        User user1=new User("A","11");
        userList.add(user1);

        user=new User("B","7");
        userList.add(user);

        user=new User("C","55");
        userList.add(user);

        user=new User("D","43");
        userList.add(user);

        user=new User("XYZ","19");
        userList.add(user);

        user=new User("ABC","32");
        userList.add(user);

        user=new User("pq","11");
        userList.add(user);

        user=new User("random","21");
        userList.add(user);

        user=new User("name","11");
        userList.add(user);

        userAdapter.notifyDataSetChanged();
    }

}