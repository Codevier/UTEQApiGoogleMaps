package com.example.apigooglemaps;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap QuevedoMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        QuevedoMap=googleMap;
    }

    public  void cambiarvista(View view){
        QuevedoMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        QuevedoMap.getUiSettings().setZoomControlsEnabled(true);
    }

    public  void vistaHybrid(View view){
        QuevedoMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        QuevedoMap.getUiSettings().setZoomControlsEnabled(true);
    }

    public  void vistaTerrain(View view){
        QuevedoMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
        QuevedoMap.getUiSettings().setZoomControlsEnabled(true);
    }

    public void moverCamara(View view){
        CameraUpdate camUpd1 = CameraUpdateFactory.newLatLngZoom(new LatLng(-1.012733, -79.469495), 20);
        QuevedoMap.moveCamera(camUpd1);
    }

    public  void poligono(View view){



        Marker m,m2,m3,m4,m5,m6,m7,m8,m9, m10;
        m = QuevedoMap.addMarker(new MarkerOptions().position(new LatLng(-1.012234, -79.470117)).title("Facultad de Ciencias Empresariales"));
        m.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.facultad));

        m2 = QuevedoMap.addMarker(new MarkerOptions().position(new LatLng(-1.012884, -79.469491)).title("Facultad de Ciencias Agrarias"));
        m2.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.facultad));

        m3 = QuevedoMap.addMarker(new MarkerOptions().position(new LatLng(-1.012591, -79.470419)).title("Facultad de Ciencias de la Ingeniería"));
        m3.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.facultad));

        m4 = QuevedoMap.addMarker(new MarkerOptions().position(new LatLng(-1.012685, -79.471083)).title("Facultad de Ciencias Ambientales"));
        m4.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.facultad));

        m5 = QuevedoMap.addMarker(new MarkerOptions().position(new LatLng(-1.012384, -79.468444)).title("Biblioteca"));
        m5.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.facultad));

        m6 = QuevedoMap.addMarker(new MarkerOptions().position(new LatLng(-1.012384, -79.468444)).title("Unidad de Posgrado"));
        m6.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.facultad));

        m7 = QuevedoMap.addMarker(new MarkerOptions().position(new LatLng(-1.012240, -79.469018)).title("Centro Médico"));
        m7.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.facultad));

        m8 = QuevedoMap.addMarker(new MarkerOptions().position(new LatLng(-1.012272, -79.468787)).title("Edificio Administrativo"));
        m8.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.facultad));

        m9 = QuevedoMap.addMarker(new MarkerOptions().position(new LatLng(-1.013074, -79.469622)).title("Gimnasio"));
        m9.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.gym));

        m10 = QuevedoMap.addMarker(new MarkerOptions().position(new LatLng(-1.012240, -79.469672)).title("Instituto de Informática"));
        m10.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.facultad));

        PolylineOptions lineas = new PolylineOptions()
                .add(new LatLng(-1.012009, -79.471877))
                .add(new LatLng(-1.012245, -79.467135))
                .add(new LatLng(-1.013564, -79.467167))
                .add(new LatLng(-1.013318, -79.471888))
                .add(new LatLng(-1.012009, -79.471877));
        lineas.width(8);
        lineas.color(Color.GREEN);
        QuevedoMap.addPolyline(lineas);

    }
}