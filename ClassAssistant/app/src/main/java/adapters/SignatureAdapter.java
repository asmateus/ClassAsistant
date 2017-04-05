package adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.uninorte.classassistant.R;

import java.util.Collections;
import java.util.List;

import entities.Signature;
import minimum.MinSignature;

/**
 * Created by asmateus on 5/04/17.
 */

public class SignatureAdapter extends RecyclerView.Adapter<SignatureAdapter.MyHolder> {
    private LayoutInflater inflater;
    private List<MinSignature> data = Collections.emptyList();
    private Context master;
    private Intent i;

    public SignatureAdapter(Context context, List<MinSignature> data, Intent i) {
        this.master = context;
        this.i = i;
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.row, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        MinSignature info = data.get(position);
        holder.signature_name.setText(info.getTitle());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView signature_name;

        public MyHolder(View itemView) {
            super(itemView);

            signature_name = (TextView) itemView.findViewById(R.id.sig_item);
            signature_name.setOnClickListener(ViewOnClickListener);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }


        private View.OnClickListener ViewOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                master.startActivity(i);
            }
        };
    }
}