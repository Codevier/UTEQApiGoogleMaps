package com.example.apigooglemaps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap mapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mapa=googleMap;
    }

    public  void cambiarvista(View view){
        mapa.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        mapa.getUiSettings().setZoomControlsEnabled(true);
    }

    public  void irUTEQ(View view){
       //-1.012733, -79.469495
        CameraUpdate camUpd1 = CameraUpdateFactory.newLatLngZoom(new LatLng(-1.012733, -79.469495), 18);
        mapa.moveCamera(camUpd1);

        PolylineOptions lineas = new PolylineOptions()
                .add(new LatLng(-1.012009, -79.471877))
                .add(new LatLng(-1.012245, -79.467135))
                .add(new LatLng(-1.013564, -79.467167))
                .add(new LatLng(-1.013318, -79.471888))
                .add(new LatLng(-1.012009, -79.471877));
                lineas.width(8);
                lineas.color(Color.MAGENTA);
                mapa.addPolyline(lineas);

        LatLng punto;
        //1
        punto = new LatLng(-1.012234, -79.470117);//FCE
        mapa.addMarker(new MarkerOptions().position(punto).title("Facultad de Ciencias Empresariales"));
        //2
        punto = new LatLng(-1.012567, -79.470525);
        mapa.addMarker(new MarkerOptions().position(punto).title("Facultad de Ciencias de la Ingeniería"));
        //3
        punto = new LatLng(-1.012685, -79.471083);
        mapa.addMarker(new MarkerOptions().position(punto).title("Facultad de Ciencias Ambientales"));
        //4
        punto = new LatLng(-1.012240, -79.469672);
        mapa.addMarker(new MarkerOptions().position(punto).title("Instituto de Informática"));
        //5
        punto = new LatLng(-1.012384, -79.468444);
        mapa.addMarker(new MarkerOptions().position(punto).title("Biblioteca"));
        //6
        punto = new LatLng(-1.012894, -79.469377);
        mapa.addMarker(new MarkerOptions().position(punto).title("Facultad de Ciencias Agrarias"));
        //7
        punto = new LatLng(-1.012218, -79.469281);
        mapa.addMarker(new MarkerOptions().position(punto).title("Unidad de Posgrado"));
        //8
        punto = new LatLng(-1.012240, -79.469018);
        mapa.addMarker(new MarkerOptions().position(punto).title("Centro Médico"));
        //9
        punto = new LatLng(-1.012272, -79.468787);
        mapa.addMarker(new MarkerOptions().position(punto).title("Edificio Administrativo"));
        //10
        punto = new LatLng(-1.012926, -79.467720);
        mapa.addMarker(new MarkerOptions().position(punto).title("Auditorio"));

    }



}