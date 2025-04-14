package com.example.finalexer1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    int position;
    ImageView ivDetail;
    TextView tvDetailName;
    TextView tvDetailPrice;
    TextView tvDescription;
    EditText etDetailQuantity;


    public DetailFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DetailFragment.
     */
    // TODO: Rename and change types and number of parametersd
    public static DetailFragment newInstance(String param1, String param2) {
        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_detail, container, false);
        ivDetail = root.findViewById(R.id.imageViewDetail);
        tvDetailName = root.findViewById(R.id.textDetailName);
        tvDetailPrice = root.findViewById(R.id.textDetailPrice);
        tvDescription = root.findViewById(R.id.textDescription);
        etDetailQuantity = root.findViewById(R.id.editTextQuantity);
        position = getArguments().getInt("position", 0);
        ivDetail.setImageDrawable(root.getResources().obtainTypedArray(R.array.productImages).getDrawable(position));
        tvDetailName.setText(root.getResources().getStringArray(R.array.productNames)[position]);
        tvDetailPrice.setText(root.getResources().getStringArray(R.array.productPrices)[position]);
        switch (position){
            case 0:
                tvDescription.setText(R.string.maxchampcap);
                break;

            case 1:
                tvDescription.setText(R.string.maxchamppos);
                break;

            case 2:
                tvDescription.setText(R.string.maxorangehood);
                break;

            case 3:
                tvDescription.setText(R.string.maxpost);
                break;

            case 4:
                tvDescription.setText(R.string.maxorangshirt);
                break;

            case 5:
                tvDescription.setText(R.string.maxtshirt);
                break;

            case 6:
                tvDescription.setText(R.string.beanie);
                break;

            case 7:
                tvDescription.setText(R.string.modelboard);
                break;

            case 8:
                tvDescription.setText(R.string.whitehood);
                break;

            case 9:
                tvDescription.setText(R.string.redbullcap);
                break;

            case 10:
                tvDescription.setText(R.string.cap2024);
                break;

            case 11:
                tvDescription.setText(R.string.graphict);
                break;

            case 12:
                tvDescription.setText(R.string.redbulljacket);
                break;

            case 13:
                tvDescription.setText(R.string.redbullpolo);
                break;

            case 14:
                tvDescription.setText(R.string.redbullshirt);
                break;

            case 15:
                tvDescription.setText(R.string.truckercap);
                break;

            case 16:
                tvDescription.setText(R.string.redbulltshirt);
                break;

            case 17:
                tvDescription.setText(R.string.whitepolo);
                break;
        }



        return root;
    }
}