package in.nareshit.databinding;

import android.util.Log;
import android.view.View;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyviewModel extends ViewModel {


    MutableLiveData<Integer> count;
    public MyviewModel(){
        Log.v("MAIN","View Model is created");
        count = new MutableLiveData<>();
        count.setValue(0);
    }

    // OnCleared Method will be invoked just before the View Model is destroyed.
    @Override
    protected void onCleared() {
        super.onCleared();
        Log.v("Main","view Model is Destroyed!");
    }

    public void increment(){
        count.setValue(count.getValue()+1);
    }

    public void decrement(){
        count.setValue(count.getValue()-1);
    }
}
