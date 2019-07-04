package tk.drac.tiratampa;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import tk.drac.tiratampa.math.Line2;
import tk.drac.tiratampa.math.LinearTransform2;

public class ControlRenderer extends SurfaceView implements SurfaceHolder.Callback {
    protected double margins;
    public ControlRenderer(Context context, double margins) {
        super(context);
        this.margins = margins;
    }

    protected void render(Canvas c) {
        /* Acquire a new transformation */
        float width  = c.getWidth();
        float height = c.getHeight();
        LinearTransform2 transform = new LinearTransform2(
                new Line2(-1.0, 1.0, 1.0, -1.0),
                new Line2(0, 0, width, height)
        );

        double radius = transform.transform(new Line2(0, 0, 1, 0)).length();

    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Canvas c = surfaceHolder.lockCanvas();
        render(c);
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
