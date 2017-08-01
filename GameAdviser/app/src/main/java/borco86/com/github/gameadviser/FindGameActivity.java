package borco86.com.github.gameadviser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FindGameActivity extends AppCompatActivity {

    @BindView(R.id.game_genre_spinner)
    Spinner genreSpinner;

    @BindView(R.id.game_text_view)
    TextView gamesTextView;

    private GameAdviser gameAdviser = new GameAdviser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_game);
        ButterKnife.bind(this);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.game_genres_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genreSpinner.setAdapter(adapter);

    }

    @OnClick(R.id.find_game_button)
    void onFindGameButtonClick() {
        String selectedGenre = String.valueOf(genreSpinner.getSelectedItem());
        List<String> gamesList = gameAdviser.getGames(selectedGenre);
        StringBuilder formattedGamesList = new StringBuilder();
        for (String game : gamesList) {
            formattedGamesList.append(game).append('\n');
        }

        gamesTextView.setText(formattedGamesList);
    }


}
