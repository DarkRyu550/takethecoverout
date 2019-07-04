package tk.drac.tiratampa.math;

public class LinearTransform {
    protected LinearTransform prev;
    protected Vec2 origin_min, origin_max;
    protected Vec2 target_min, target_max;

    public LinearTransform(Vec2 origin, Vec2 target, LinearTransform prev) {
        this.prev = prev;
        this.origin_min = origin;
        this.target_min = target;
    }

    public Vec2 transform(Vec2 vector) {
        Vec2 tmp = vector;
        if(this.prev != null)
            tmp = this.prev.transform(vector);

        tmp.x = (vector.x - origin_min.x) * (target_min.x / origin_min.x) + target_min.x;
        return new Vec2();
    }
}
