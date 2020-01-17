package com.example.apk_staff;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InputData extends AppCompatActivity {

    Button simpann,vieww,updatee,deletee;
    EditText nikk,namaa,tempatl,tgll,alamatt,kelamin,agamaa,statuss,pndd,jabatann;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_karyawan);

        simpann=(Button)findViewById(R.id.btnsimpan);
        vieww=(Button)findViewById(R.id.btnview);
        updatee=(Button)findViewById(R.id.btnupdate);
        deletee=(Button)findViewById(R.id.btndelete);

        nikk=(EditText)findViewById(R.id.addnik);
        namaa=(EditText)findViewById(R.id.addnama);
        tempatl=(EditText)findViewById(R.id.addtmplahir);
        tgll=(EditText)findViewById(R.id.addtgllahir);
        alamatt=(EditText)findViewById(R.id.addalamat);
        kelamin=(EditText)findViewById(R.id.addkelamin);
        agamaa=(EditText)findViewById(R.id.addagama);
        statuss=(EditText)findViewById(R.id.addstatus);
        pndd=(EditText)findViewById(R.id.addpendidikan);
        jabatann=(EditText)findViewById(R.id.addjabatan);

        final String nik = getIntent().getStringExtra("Nik");

        if (nik !=null){
            String na=getIntent().getStringExtra("Nama");
            nikk.setText(nik);
            namaa.setText(na);
            simpann.setVisibility(View.GONE);
        }

        deletee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nikkk=nikk.getText().toString();
                ApiRequesData aapi=Server.getClient().create(ApiRequesData.class);
                Call<ResponData> deletedata=aapi.hapusdata(nikkk);
                deletedata.enqueue(new Callback<ResponData>() {
                    @Override
                    public void onResponse(Call<ResponData> call, Response<ResponData> response) {
                        if (response.body().getPesan().equals("1")){
                            Toast.makeText(InputData.this,"Berhasil menghapus DATA",Toast.LENGTH_SHORT).show();
                            nikk.setText("");
                            namaa.setText("");
                            tempatl.setText("");
                            tgll.setText("");
                            alamatt.setText("");
                            kelamin.setText("");
                            agamaa.setText("");
                            statuss.setText("");
                            pndd.setText("");
                            jabatann.setText("");

                        }else if (response.body().getPesan().equals("2")){
                            Toast.makeText(InputData.this,"gagal menghapus DATA",Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponData> call, Throwable t) {
                        Toast.makeText(InputData.this,"Gagal Menyanbungkan....!!",Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });



        updatee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nikkk=nikk.getText().toString();
                String naama=namaa.getText().toString();
                final
                String temptll=tempatl.getText().toString();
                String tggll=tgll.getText().toString();
                String alamatttt=alamatt.getText().toString();
                String kelaminn=kelamin.getText().toString();
                String agaama=agamaa.getText().toString();
                String statuuss=statuss.getText().toString();
                String pnndd=pndd.getText().toString();
                String jabataann=jabatann.getText().toString();

                ApiRequesData apii=Server.getClient().create(ApiRequesData.class);
                Call<ResponData>updatedata=apii.updatedata(nikkk,naama,temptll,tggll,alamatttt,kelaminn,agaama,statuuss,pnndd,jabataann);
                updatedata.enqueue(new Callback<ResponData>() {
                    @Override
                    public void onResponse(Call<ResponData> call, Response<ResponData> response) {
                        if (response.body().getPesan().equals("1")){
                            Toast.makeText(InputData.this,"DATA Berhasil di UPDATE",Toast.LENGTH_SHORT).show();


                        }else if (response.body().getPesan().equals("2")){
                            Toast.makeText(InputData.this,"DATA belum ada dan telah disimpan",Toast.LENGTH_SHORT).show();
                        }
                        nikk.setText("");
                        namaa.setText("");
                        tempatl.setText("");
                        tgll.setText("");
                        alamatt.setText("");
                        kelamin.setText("");
                        agamaa.setText("");
                        statuss.setText("");
                        pndd.setText("");
                        jabatann.setText("");
                    }

                    @Override
                    public void onFailure(Call<ResponData> call, Throwable t) {
                        Toast.makeText(InputData.this,"Gagal Menyanbungkan....!!",Toast.LENGTH_SHORT).show();


                    }
                });
            }
        });


        vieww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotampil=new Intent(InputData.this,TampilData.class);
                startActivity(gotampil);
            }
        });

        simpann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nikkk=nikk.getText().toString();
                String naama=namaa.getText().toString();
                final
                String temptll=tempatl.getText().toString();
                String tggll=tgll.getText().toString();
                String alamatttt=alamatt.getText().toString();
                String kelaminn=kelamin.getText().toString();
                String agaama=agamaa.getText().toString();
                String statuuss=statuss.getText().toString();
                String pnndd=pndd.getText().toString();
                String jabataann=jabatann.getText().toString();

                ApiRequesData api=Server.getClient().create(ApiRequesData.class);
                Call<ResponData>savedata=api.simpandata(nikkk,naama,temptll,tggll,alamatttt,kelaminn,agaama,statuuss,pnndd,jabataann);
                savedata.enqueue(new Callback<ResponData>() {
                    @Override
                    public void onResponse(Call<ResponData> call, Response<ResponData> response) {
                        response.body().getKode();
                        if (response.body().getKode().equals("1")){
                            Toast.makeText(InputData.this,"Data Berhasil disimpan. ",Toast.LENGTH_SHORT).show();
                            nikk.setText("");
                            namaa.setText("");
                            tempatl.setText("");
                            tgll.setText("");
                            alamatt.setText("");
                            kelamin.setText("");
                            agamaa.setText("");
                            statuss.setText("");
                            pndd.setText("");
                            jabatann.setText("");
                        }else  if (response.body().getKode().equals("2")){
                            Toast.makeText(InputData.this,"Data Sudah ada." ,Toast.LENGTH_SHORT).show();
                        }
                        nikk.setText("");
                        namaa.setText("");
                        tempatl.setText("");
                        tgll.setText("");
                        alamatt.setText("");
                        kelamin.setText("");
                        agamaa.setText("");
                        statuss.setText("");
                        pndd.setText("");
                        jabatann.setText("");
                    }

                    @Override
                    public void onFailure(Call<ResponData> call, Throwable t) {
                        Toast.makeText(InputData.this,"Gagal Menyanbungkan....!!",Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });




    }

}