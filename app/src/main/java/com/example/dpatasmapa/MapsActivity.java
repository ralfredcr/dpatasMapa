package com.example.dpatasmapa;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng veterinaria1 = new LatLng(-12.114929, -77.003865);
        mMap.addMarker(new MarkerOptions().position(veterinaria1).title("VET 01").snippet("Veterinaria 01 de prueba").icon(BitmapDescriptorFactory.fromResource(R.drawable.gps2)));
        LatLng veterinaria2 = new LatLng(-12.1158941, -77.0042199);
        mMap.addMarker(new MarkerOptions().position(veterinaria2).title("VET 02").snippet("Veterinaria 02 de prueba").icon(BitmapDescriptorFactory.fromResource(R.drawable.gps2)));
        LatLng veterinaria3 = new LatLng(-12.115327, -77.0044125);
        mMap.addMarker(new MarkerOptions().position(veterinaria3).title("VET 03").snippet("Veterinaria 03 de prueba").icon(BitmapDescriptorFactory.fromResource(R.drawable.gps2)));
        LatLng veterinaria4 = new LatLng(-12.1140781, -77.0033481);
        mMap.addMarker(new MarkerOptions().position(veterinaria4).title("VET 04").snippet("Veterinaria 04 de prueba").icon(BitmapDescriptorFactory.fromResource(R.drawable.gps2)));
        LatLng veterinaria5 = new LatLng(-12.1138284, -77.0032289);
        mMap.addMarker(new MarkerOptions().position(veterinaria5).title("VET 04").snippet("Veterinaria 04 de prueba").icon(BitmapDescriptorFactory.fromResource(R.drawable.gps2)));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(veterinaria1,17));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissio
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentatins,on
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
    }
}