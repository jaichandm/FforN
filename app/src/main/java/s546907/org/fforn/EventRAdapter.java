package s546907.org.fforn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EventRAdapter extends RecyclerView.Adapter<EventRAdapter.MyViewHolder> {

    Context context;
    ArrayList<EventModel> eventModels;

    public EventRAdapter(Context context, ArrayList<EventModel> eventModels){
        this.context= context;
        this.eventModels = eventModels;
    }

    @NonNull
    @Override
    public EventRAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.event_recylcerview_row,parent,false);
        return new EventRAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventRAdapter.MyViewHolder holder, int position) {
        holder.tvEventName.setText(eventModels.get(position).getEventName());
        holder.tvEventStartDT.setText(eventModels.get(position).getEventStDT());
        holder.tvEventEndDT.setText(eventModels.get(position).getEventEndDt());
        holder.tvEventLocation.setText(eventModels.get(position).getEventLocation());
        holder.tvEventDesc.setText(eventModels.get(position).getEventDescription());
        holder.tvEventNotes.setText(eventModels.get(position).getEventNotes());
    }

    @Override
    public int getItemCount() {

        return eventModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tvEventName, tvEventStartDT, tvEventEndDT, tvEventLocation, tvEventDesc, tvEventNotes;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvEventName = itemView.findViewById(R.id.tvEvent);
            tvEventStartDT = itemView.findViewById(R.id.tvEventStDt);
            tvEventEndDT = itemView.findViewById(R.id.tvEventEndDt);
            tvEventLocation = itemView.findViewById(R.id.tvEventLoc);
            tvEventDesc = itemView.findViewById(R.id.tvEventDesc);
            tvEventNotes = itemView.findViewById(R.id.tvEventNotes);
        }
    }
}
