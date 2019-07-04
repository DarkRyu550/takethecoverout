package tk.drac.tiratampa;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class ControlRenderer extends SurfaceView implements SurfaceHolder.Callback {
    protected double margins;
    public ControlRenderer(Context context, double margins) {
        super(context);
        this.margins = margins;
    }

    protected void renderInner(Canvas c)
    {

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
}
