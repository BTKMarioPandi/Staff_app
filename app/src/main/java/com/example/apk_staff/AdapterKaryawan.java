package com.example.apk_staff;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AdapterKaryawan extends RecyclerView.Adapter<AdapterKaryawan.HolderData> {

    private List<DataKaryawan> mlist;
    private Context ctx;

    public AdapterKaryawan(Context ctx,List<DataKaryawan>mlist){
        this.ctx=ctx;
        this.mlist=mlist;
    }

    @NonNull
    @Override
    public AdapterKaryawan.HolderData onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layout= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tampildata,viewGroup,false);
        HolderData holder = new HolderData(layout);


        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterKaryawan.HolderData holderData, int i) {
        DataKaryawan dk =mlist.get(i);
        holderData.vw_nik.setText(dk.getNik());
        holderData.vw_nama.setText(dk.getNama());

        holderData.dk = dk;


    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }



    public class HolderData extends RecyclerView.ViewHolder {

        TextView vw_nik,vw_nama;
        DataKaryawan dk;

        public HolderData(@NonNull View itemView) {
            super(itemView);

            vw_nik = (TextView)itemView.findViewById(R.id.tvnik);
            vw_nama = (TextView)itemView.findViewById(R.id.tvnama);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent godata = new Intent(ctx,InputData.class);
                    godata.putExtra("Nik",dk.getNik());
                    godata.putExtra("Nama",dk.getNama());
                    godata.putExtra("Tempat Lahir",dk.getTempat_lahir());
                    godata.putExtra("Tanggal Lahir",dk.getTgl_lahir());
                    godata.putExtra("Alamat",dk.getAlamat());
                    godata.putExtra("Kelamin",dk.getKelamin());
                    godata.putExtra("Agama",dk.getAgama());
                    godata.putExtra("Status",dk.getStatus());
                    godata.putExtra ("Pendidikan",dk.getPendidikan());
                    godata.putExtra("Jabatan",dk.getJabatan());

                    ctx.startActivity(godata);


                }
            });
        }
    }
}
