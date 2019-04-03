package ma.adil.elmansouri.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BasicFragment extends Fragment {
    // A default constructor must be declared, else it won't work !!!
    public BasicFragment(){}

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle){
        View view = layoutInflater.inflate(R.layout.fragment,viewGroup,false);
        TextView text = view.findViewById(R.id.section);
        text.setText(R.string.java);
        return view;
    }
}
