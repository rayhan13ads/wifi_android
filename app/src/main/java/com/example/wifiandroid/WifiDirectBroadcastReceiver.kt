package com.example.wifiandroid

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.wifi.p2p.WifiP2pManager

class WifiDirectBroadcastReceiver(val mManager:WifiP2pManager, val mChannel:WifiP2pManager.Channel,val mActivity:MainActivity) : BroadcastReceiver() {


    override fun onReceive(p0: Context?, p1: Intent?) {
        val action = p1!!.action

        if (WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION.equals(action)){

        }else if (WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION.equals(action)){

        }else if (WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION.equals(action)){

        }else if (WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION.equals(action)){

        }
    }
}