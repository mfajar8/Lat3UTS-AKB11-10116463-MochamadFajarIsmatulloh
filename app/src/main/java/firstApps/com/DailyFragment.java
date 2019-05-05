package firstApps.com;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class DailyFragment extends Fragment {

    public DailyFragment() {
        // Required empty public constructor
    }
    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View myFragmentView = inflater.inflate(R.layout.fragment_daily, container, false);
        ArrayList<DailyModel> dailyModels = new ArrayList<>();
        dailyModels.add(new DailyModel(R.drawable.ic_male,"Pukul 04:00 - 04:30 bangun tidur + persiapan"));
        dailyModels.add(new DailyModel(R.drawable.ic_male,"Pukul 04:30 - 05:15 Sholat Shubuh + Ngaji"));
        dailyModels.add(new DailyModel(R.drawable.ic_male,"Pukul 05:15 - 06:00 Santai Pagi"));
        dailyModels.add(new DailyModel(R.drawable.ic_male,"Pukul 06:00 - 07:00 Sarapan Pagi"));
        dailyModels.add(new DailyModel(R.drawable.ic_male,"Pukul 07:00 - 11:45 Aktivitas Produktif"));
        dailyModels.add(new DailyModel(R.drawable.ic_male,"Pukul 11:45 - 12:15 Sholat Dzuhur"));
        dailyModels.add(new DailyModel(R.drawable.ic_male,"Pukul 12:15 - 15:00 Aktivitas Produktif / Istirahat"));
        dailyModels.add(new DailyModel(R.drawable.ic_male,"Pukul 15:00 - 15:30 Sholat Ashar"));
        dailyModels.add(new DailyModel(R.drawable.ic_male,"Pukul 15:30 - 17:45 Aktivitas Produktif / Santai Sore"));
        dailyModels.add(new DailyModel(R.drawable.ic_male,"Pukul 17:45 - 18:30 Sholat Maghrib + Ngaji"));
        dailyModels.add(new DailyModel(R.drawable.ic_male,"Pukul 18:30 - 19:00 Review Pembelajaran"));
        dailyModels.add(new DailyModel(R.drawable.ic_male,"Pukul 19:00 - 19:30 Sholat Isya + Ngaji"));
        dailyModels.add(new DailyModel(R.drawable.ic_male,"Pukul 19:30 - 22:00 Aktivitas Produktif / Santai Malam"));
        dailyModels.add(new DailyModel(R.drawable.ic_male,"Pukul 22:00 - 04:00 Istirahat"));

        mRecycleView = myFragmentView.findViewById(R.id.daily_id_r);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new DailyAdapter(dailyModels);

        mRecycleView.setLayoutManager(mLayoutManager);
        mRecycleView.setAdapter(mAdapter);
        return myFragmentView;
    }

}
