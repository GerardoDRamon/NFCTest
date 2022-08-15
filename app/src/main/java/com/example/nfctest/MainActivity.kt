package com.example.nfctest

import android.nfc.NfcAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nfctest.Extensions.Companion.getDisplayMessage
import com.example.nfctest.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        getNfcDetails()
    }

    private fun getNfcDetails() {
        val nfcAdapter = NfcAdapter.getDefaultAdapter(this)
        binding.textNfcStatus.text = getString(R.string.message_nfc_status).getDisplayMessage(
            (nfcAdapter != null).toString(),
            (nfcAdapter?.isEnabled ?: false).toString()
        )
    }
}