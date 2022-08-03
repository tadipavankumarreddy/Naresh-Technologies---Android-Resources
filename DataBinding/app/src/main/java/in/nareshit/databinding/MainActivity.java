package in.nareshit.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import in.nareshit.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding;
    MyviewModel myviewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.countBtn.setOnClickListener(this);
        binding.toastBtn.setOnClickListener(this);
        myviewModel = new ViewModelProvider(this).get(MyviewModel.class);
        /*binding.textviewResult.setText(String.valueOf(myviewModel.count));*/
        myviewModel.count.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                binding.textviewResult.setText(String.valueOf(integer));
            }
        });
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.count_btn){
            myviewModel.increment();
        }else{
            Toast.makeText(this, "Hi This is toast", Toast.LENGTH_SHORT).show();
        }
        
    }
}