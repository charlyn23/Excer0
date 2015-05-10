package nyc.c4q.fattyduck.exercise;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    int i1=0, i2=0, i3=0, ir1=0, ir2=0, ir3=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View b) {

            if(b.getId()==R.id.button1){
                i1++;
                TextView  text=(TextView)findViewById(R.id.tv1);
                String n = String.valueOf(i1);
                text.setText(n);
            }
            if(b.getId()==R.id.button2){
                i2++;
                TextView text=(TextView)findViewById(R.id.tv2);
                String n = String.valueOf(i2);
                text.setText(n);
            }
            if(b.getId()==R.id.button3){

                i3++;
                TextView text=(TextView)findViewById(R.id.tv3);
                String n = String.valueOf(i3);
                text.setText(n);
            }
            if(b.getId()==R.id.buttonr1){

                ir1++;
                TextView text=(TextView)findViewById(R.id.tvr1);
                String n = String.valueOf(ir1);
                text.setText(n);
            }
            if(b.getId()==R.id.buttonr2){

                ir2++;
                TextView text=(TextView)findViewById(R.id.tvr2);
                String n = String.valueOf(ir2);
                text.setText(n);
            }
            if(b.getId()==R.id.buttonr3){

                ir3++;
                TextView text=(TextView)findViewById(R.id.tvr3);
                String n = String.valueOf(ir3);
                text.setText(n);
            }
            int sum = i1+i2+i3+ir1+ir2+ir3;
            String n = String.valueOf(sum);
            TextView tvt = (TextView)findViewById(R.id.tvt);
            tvt.setText(n);
        }
    }

