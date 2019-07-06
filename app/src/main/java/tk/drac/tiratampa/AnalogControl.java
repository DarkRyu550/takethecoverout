package tk.drac.tiratampa;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.telecom.Call;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

public class AnalogControl extends SurfaceView implements SurfaceHolder.Callback {
    protected double margins;
    protected float x, y;

    public interface Callback{
        void onAnalogChanged(float x, float y);
    }
    protected Callback cback;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch(event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
                this.x = event.getX();
                this.y = event.getY();

                break;
            case MotionEvent.ACTION_UP:
                break;

        }

        return super.onTouchEvent(event);
    }

    public AnalogControl(Context context, Callback cback, double margins) {
        super(context);
        this.cback = cback;
        this.margins = margins;
    }

    protected void render(Canvas c) {
        c.drawCircle(0, 0, 10, new Paint());
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Canvas c = surfaceHolder.lockCanvas();

    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }

    public double getMargins() {
        return margins;
    }

    public void setMargins(double margins) {
        this.margins = margins;
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }
}
