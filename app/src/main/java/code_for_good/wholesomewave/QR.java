package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Button;

public class QR
{
    Button backButton;

    public QR(final Context context, final Activity activity)
    {
        backButton = (Button)activity.findViewById(R.id.btBack);

        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Balance balance = new Balance(context, activity);

            }
        });
    }
}
