package firstApps.com;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DailyAdapter extends RecyclerView.Adapter<DailyAdapter.DailyViewHolder>{

    private ArrayList<DailyModel> mDailyModel;

    @NonNull
    @Override
    public DailyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View va = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_daily_item,viewGroup,false);
        DailyViewHolder Da = new DailyViewHolder(va);
        return Da;
    }

    @Override
    public void onBindViewHolder(@NonNull DailyViewHolder dailyViewHolder, int i) {
        DailyModel currentItem = mDailyModel.get(i);
        dailyViewHolder.mImageView.setImageResource(currentItem.getmImageResource());
        dailyViewHolder.namaGambar.setText(currentItem.getNamaGambar());
    }

    @Override
    public int getItemCount() {
        return mDailyModel.size();
    }

    public static class DailyViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImageView;
        public TextView namaGambar;

        public DailyViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.dailyGambar);
            namaGambar = itemView.findViewById(R.id.namaDailyGambar);
        }
    }

    public DailyAdapter(ArrayList<DailyModel> dailyList){

        mDailyModel = dailyList;
    }

}
