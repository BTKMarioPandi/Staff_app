package com.example.apk_staff;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiRequesData {
    @GET ("view_karyawan.php")
    Call<ResponData>getKaryawan();

    @FormUrlEncoded
    @POST("input_data.php")
    Call<ResponData>simpandata(@Field("nik") String nik,
                               @Field("nama")String nama,
                               @Field("tempat_lahir")String tempat_lahir,
                               @Field("tgl_lahir")String tgl_lahir,
                               @Field("alamat") String alamat,
                               @Field("kelamin")String kelamin,
                               @Field("agama")String agama,
                               @Field("status")String status,
                               @Field("pendidikan") String pendidikan,
                               @Field("jabatan")String jabatan
    );
    @FormUrlEncoded
    @POST("update_data.php")
    Call<ResponData>updatedata(@Field("nik") String nik,
                               @Field("nama")String nama,
                               @Field("tempat_lahir")String tempat_lahir,
                               @Field("tgl_lahir")String tgl_lahir,
                               @Field("alamat") String alamat,
                               @Field("kelamin")String kelamin,
                               @Field("agama")String agama,
                               @Field("status")String status,
                               @Field("pendidikan") String pendidikan,
                               @Field("jabatan")String jabatan
    );

    @FormUrlEncoded
    @POST("delete_data.php")
    Call<ResponData>hapusdata(@Field("nik") String nik);
}
