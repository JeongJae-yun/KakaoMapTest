package app.project.com.kakaomaptest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import net.daum.mf.map.api.MapReverseGeoCoder
import net.daum.mf.map.api.MapView
import android.Manifest

import android.app.AlertDialog

import android.content.DialogInterface

import android.content.Intent

import android.content.pm.PackageManager

import android.location.LocationManager

import androidx.core.app.ActivityCompat

import androidx.core.content.ContextCompat

import android.util.Log
import android.view.View

import android.widget.Toast


import net.daum.mf.map.api.MapPoint

class MainActivity : AppCompatActivity() {

    private var mMapView: MapView? = null
    internal var REQUIRED_PERMISSIONS = arrayOf(Manifest.permission.ACCESS_FINE_LOCATION)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }



}
