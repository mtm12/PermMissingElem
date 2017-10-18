package permmissingelem.demo.com.permmissingelem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;


public class MainActivity extends AppCompatActivity {
    int[] intArray = new int[]{1, 4, 3, 2, 8, 6, 7, 9, 10};
    int n = 9;
    int maxInt;
    int missing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maxInt = n+1;

        Arrays.sort(intArray);
        for(int i=maxInt-n-1; i<n; i++){
            if(i+1 != intArray[i]){
                missing = i+1;
                break;
            }
        }
        Log.d("missing1", String.valueOf(missing));

    }
}
