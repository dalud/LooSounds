package discordia.loosounds;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public MediaPlayer a;
    public MediaPlayer b;
    public MediaPlayer c;
    public MediaPlayer d;
    public MediaPlayer e;
    public MediaPlayer f;
    public MediaPlayer g;
    public MediaPlayer h;
    public MediaPlayer i;
    public MediaPlayer j;
    public MediaPlayer k;
    public MediaPlayer l;
    public MediaPlayer m;
    public MediaPlayer n;
    public MediaPlayer o;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setBackgroundDrawableResource(R.drawable.bg);

        a = MediaPlayer.create(this, R.raw.blip);
        b = MediaPlayer.create(this, R.raw.burp);
        c = MediaPlayer.create(this, R.raw.fart);
        d = MediaPlayer.create(this, R.raw.frog);
        e = MediaPlayer.create(this, R.raw.horn);
        f = MediaPlayer.create(this, R.raw.move);
        g = MediaPlayer.create(this, R.raw.nose);
        h = MediaPlayer.create(this, R.raw.quack);
        i = MediaPlayer.create(this, R.raw.scratch);
        j = MediaPlayer.create(this, R.raw.slip);
        k = MediaPlayer.create(this, R.raw.snort);
        l = MediaPlayer.create(this, R.raw.sweep);
        m = MediaPlayer.create(this, R.raw.hrow);
        n = MediaPlayer.create(this, R.raw.toilet);
        o = MediaPlayer.create(this, R.raw.vomit);

        Button A = (Button) findViewById(R.id.a);
        A.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    if(a.isPlaying()){
                        a.seekTo(0);
                    }else a.start();
                }
                return false;
            }
        });
        Button B = (Button) findViewById(R.id.b);
        B.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    if(b.isPlaying()){
                        b.seekTo(0);
                    }else b.start();
                }
                return false;
            }
        });
        Button C = (Button) findViewById(R.id.c);
        C.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    if(c.isPlaying()){
                        c.seekTo(0);
                    }else c.start();
                }
                return false;
            }
        });
        Button D = (Button) findViewById(R.id.d);
        D.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    if(d.isPlaying()){
                        d.seekTo(0);
                    }else d.start();
                }
                return false;
            }
        });
        Button E = (Button) findViewById(R.id.e);
        E.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    if(e.isPlaying()){
                        e.seekTo(0);
                    }else e.start();
                }
                return false;
            }
        });
        Button F = (Button) findViewById(R.id.f);
        F.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    if(f.isPlaying()){
                        f.seekTo(0);
                    }else f.start();
                }
                return false;
            }
        });
        Button G = (Button) findViewById(R.id.g);
        G.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    if(g.isPlaying()){
                        g.seekTo(0);
                    }else g.start();
                }
                return false;
            }
        });
        Button H = (Button) findViewById(R.id.h);
        H.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    if(h.isPlaying()){
                        h.seekTo(0);
                    }else h.start();
                }
                return false;
            }
        });
        Button I = (Button) findViewById(R.id.i);
        I.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    if(i.isPlaying()){
                        i.seekTo(0);
                    }else i.start();
                }
                return false;
            }
        });
        Button J = (Button) findViewById(R.id.j);
        J.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    if(j.isPlaying()){
                        j.seekTo(0);
                    }else j.start();
                }
                return false;
            }
        });
        Button K = (Button) findViewById(R.id.k);
        K.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    if(k.isPlaying()){
                        k.seekTo(0);
                    }else k.start();
                }
                return false;
            }
        });
        Button L = (Button) findViewById(R.id.l);
        L.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    if(l.isPlaying()){
                        l.seekTo(0);
                        }else l.start();
                }
                return false;
            }
        });
        Button M = (Button) findViewById(R.id.m);
        M.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    if(m.isPlaying()) {
                        m.seekTo(0);
                    }else m.start();
                }
                return false;
            }
        });
        Button N = (Button) findViewById(R.id.n);
        N.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    if(n.isPlaying()){
                        n.seekTo(0);
                    }else n.start();
                }
                return false;
            }
        });
        Button O = (Button) findViewById(R.id.o);
        O.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    if(o.isPlaying()){
                        o.seekTo(0);
                    }else o.start();
                }
                return false;
            }
        });
    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        if(hasFocus) {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        a.stop(); a.reset();
        b.stop(); b.reset();
        c.stop(); c.reset();
        d.stop(); d.reset();
        e.stop(); e.reset();
        f.stop(); f.reset();
        g.stop(); g.reset();
        h.stop(); h.reset();
        i.stop(); i.reset();
        j.stop(); j.reset();
        k.stop(); k.reset();
        l.stop(); l.reset();
        m.stop(); m.reset();
        n.stop(); n.reset();
        o.stop(); o.reset();
    }
}
