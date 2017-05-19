package qualserie.cursoandroid.com.qualserie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekbar;
    private ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekbar = (SeekBar) findViewById(R.id.seekBarId);
        imagem = (ImageView) findViewById(R.id.imagemId);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int valorProgresso = progress;

                if (valorProgresso == 0) {
                    imagem.setImageResource(R.drawable.pouco);
                } else if (valorProgresso == 1) {

                    imagem.setImageResource(R.drawable.medio);
                } else if (valorProgresso == 2) {
                    imagem.setImageResource(R.drawable.muito);

                } else if (valorProgresso == 3) {
                    imagem.setImageResource(R.drawable.susto);
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
