package com.darleyleal.maps_api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.darleyleal.maps_api.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val curitiba = LatLng(-25.4284, -49.2733)
        mMap.addMarker(MarkerOptions().position(curitiba).title("Curitiba"))

        val saoPaulo = LatLng(-23.5489, -46.6388)
        mMap.addMarker(MarkerOptions().position(saoPaulo).title("São Paulo"))

        val salvador = LatLng(-12.9704, -38.5124)
        mMap.addMarker(MarkerOptions().position(salvador).title("Salvador"))

        val rioDeJaneiro = LatLng(-22.9035, -43.2096)
        mMap.addMarker(MarkerOptions().position(rioDeJaneiro).title("Rio de janeiro"))

        val beloHorizonte = LatLng(-19.8157, -43.9542)
        mMap.addMarker(MarkerOptions().position(beloHorizonte).title("Belo Horizonte"))

        val portoAlegre = LatLng(-30.0277, -51.2287)
        mMap.addMarker(MarkerOptions().position(portoAlegre).title("Porto Alegre"))

        val brasilia = LatLng(-15.7801, -47.9292)
        mMap.addMarker(MarkerOptions().position(brasilia).title("Brasília"))

        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitiba))
    }
}