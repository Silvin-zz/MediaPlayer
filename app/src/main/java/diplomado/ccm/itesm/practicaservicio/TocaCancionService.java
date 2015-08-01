package diplomado.ccm.itesm.practicaservicio;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

/**
 * Created by Laboratorios on 8/1/15.
 */
public class TocaCancionService extends Service {


    private MediaPlayer mediaPlayer;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.mediaPlayer = MediaPlayer.create(this,R.raw.ojala);
        this.mediaPlayer.setLooping(true);
        this.mediaPlayer.setVolume(200,200);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        this.mediaPlayer.start();
        return 1;
    }

    @Override
    public void onDestroy() {
        this.mediaPlayer.stop();
        this.mediaPlayer.release();
    }
}
