package com.example.wifiandroid

import android.content.Context
import android.net.wifi.WifiManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var btnOff:Button
    lateinit var btnDiscover:Button
    lateinit var btnSend:Button
    lateinit var listView:ListView
    lateinit var readMsgBox:TextView
    lateinit var connectionStatus:TextView
    lateinit var writeMsg:EditText
    lateinit var wifiManager: WifiManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

    }

    fun init(){
        btnOff = this.findViewById(R.id.onOff)
        btnDiscover = this.findViewById(R.id.discover)
        btnSend = this.findViewById(R.id.sendButton)
        listView = this.findViewById(R.id.peerListView)
        readMsgBox = this.findViewById(R.id.readMsg)
        connectionStatus = this.findViewById(R.id.connectionStatus)
        writeMsg = this.findViewById(R.id.writeMsg)
        // init elements

        wifiManager = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
    }

    fun exqListener(){
        btnOff.setOnClickListener { it: View? ->
            wifiManager.isWifiEnabled = !wifiManager.isWifiEnabled

            if (wifiManager.isWifiEnabled){
                btnOff.text =  "ON"
            }else btnOff.text =  "OFF"
        }
    }
}