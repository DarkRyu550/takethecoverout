package tk.drac.tiratampa.api;

import okhttp3.OkHttpClient;

public class HTTPControl implements ControlInterface {
    protected OkHttpClient client;
    public HTTPControl(OkHttpClient client){
        this.client = client;
    }

    @Override
    public long idealSleepTimeMillis() {
        return 500;
    }

    @Override
    public void sendLedControlMessage(boolean on, ResultCallback<Boolean, Exception> cback) {

    }

    @Override
    public void sendMotorControlMessage(double left, double right, ResultCallback<Double[], Exception> cback) {

    }
}
