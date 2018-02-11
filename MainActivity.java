import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.*;
import android .widget.*;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener
{

    private TextView tv;
    private GestureDetectorCompat gestureDetector;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v){
                        TextView tv =  findViewById(R.id.tv);
                        tv.setText("Infinity War");
                    }
                }
        );
        button.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        TextView tv = findViewById(R.id.tv);
                        tv.setText("Wait 2 month For Infinity War");

                        return true;
                    }
                }
        );

        tv = (TextView)findViewById(R.id.tv);
        this.gestureDetector= new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);
    }



    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        tv.setText("Thor");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        tv.setText("Captain America");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        tv.setText("Hulk");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        tv.setText("Black Widow");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        tv.setText("Clint Burton");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        tv.setText("Loki");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        tv.setText("Iron Man");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        tv.setText("Ultron");

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        tv.setText("IT Never End");
        return true;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}

