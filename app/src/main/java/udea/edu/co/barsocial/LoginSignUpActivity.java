package udea.edu.co.barsocial;

        import android.app.FragmentManager;
        import android.app.FragmentTransaction;
        import android.content.Intent;
        import android.support.v7.app.ActionBarActivity;
        import android.support.v7.app.ActionBar;
        import android.support.v4.app.Fragment;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.view.ViewGroup;
        import android.os.Build;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import com.parse.LogInCallback;
        import com.parse.ParseException;
        import com.parse.ParseUser;
        import com.parse.SignUpCallback;


public class LoginSignUpActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sign_up);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.action_bar_container, new PlaceholderFragment())
                    .commit();

        }
    }





    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        Button loginButton;
        Button signupButton;
        String usernametxt;
        String passwordtxt;
        EditText password;
        EditText username;

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            final View view = inflater.inflate(R.layout.fragment_login_sign_up, container, false);
            username=(EditText) view.findViewById(R.id.username);
            password=(EditText)view.findViewById(R.id.password);
            loginButton=(Button) view.findViewById(R.id.login);
            signupButton=(Button) view.findViewById(R.id.signup);

            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    usernametxt = username.getText().toString();
                    passwordtxt = password.getText().toString();
                    ParseUser.logInInBackground(usernametxt, passwordtxt, new LogInCallback() {
                        @Override
                        public void done(ParseUser user, ParseException e) {
                            if (user != null) {
                                Intent intent = new Intent(getActivity(), Bienvenido.class);
                                startActivity(intent);
                                getActivity().finish();
                            } else {

                                Toast.makeText(getActivity().getApplicationContext(),
                                        "This user doesn't exist. Please sign up",
                                        Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            });
            signupButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    usernametxt = username.getText().toString();
                    passwordtxt = password.getText().toString();
                    if (usernametxt.equals("") && passwordtxt.equals("")) {
                        Toast.makeText(getActivity().getApplicationContext(),
                                "Please complete the sign up form",
                                Toast.LENGTH_SHORT).show();
                    } else {
                        ParseUser user = new ParseUser();
                        user.setUsername(usernametxt);
                        user.setPassword(passwordtxt);
                        user.signUpInBackground(new SignUpCallback() {
                            @Override
                            public void done(ParseException e) {

                                if (e == null) {

                                    Toast.makeText(getActivity().getApplicationContext(),
                                            "Successfully Signed up!",
                                            Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(getActivity().getApplicationContext(),
                                            "Sign up error", Toast.LENGTH_SHORT)
                                            .show();
                                }
                            }
                        });
                    }
                }
            });
            return view;
        }
    }
}
