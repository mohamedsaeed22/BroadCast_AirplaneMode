package com.example.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadcast : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        when (p1?.action) {
            Intent.ACTION_AIRPLANE_MODE_CHANGED -> {
                //to know the state of the receiver like true or false
//                p1.extras?.keySet()?.forEach {
//                    Log.d("AAAA","$it = ${p1.extras?.get(it)}")
//                }
                if (p1.extras?.getBoolean("state") == true) {
                    Toast.makeText(p0, "Airplane Mode Active", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(p0, "Airplane Mode DeActive", Toast.LENGTH_SHORT).show()
                }
            }
        }
//       Log.d("AAAA" ,p1?.action.toString())
    }
}