package com.example.apk_staff;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TampilData extends AppCompatActivity {

    private RecyclerView mRc;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mManager;
    private List<DataKaryawan> mItems =new ArrayList<>();
    ProgressDialog pd;


    @Override
    protected  void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampil);

        pd=new ProgressDialog(this);
        mRc=(RecyclerView)findViewById(R.id.vw_daftar);
        mManager=new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        mRc.setLayoutManager(mManager);

        ApiRequesData api=Server.getClient().create(ApiRequesData.class);
        Call<ResponData> Karyawan=api.getKaryawan();
        Karyawan.enqueue(new Callback<ResponData>() {
            @Override
            public void onResponse(Call<ResponData> call, Response<ResponData> response) {
                Toast.makeText(TampilData.this, "Respon: berhasil ditampilkan" ,Toast.LENGTH_LONG).show();
                mItems = response.body().getResult();
                mAdapter=new AdapterKaryawan(TampilData.this,mItems);
                mRc.setAdapter(mAdapter);
                mAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<ResponData> call, Throwable t) {

                Toast.makeText(TampilData.this, "Gagal konek",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
