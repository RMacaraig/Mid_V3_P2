package sheridan.macaraig.mid_v3_p2.ui

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import sheridan.macaraig.mid_v3_p2.R

class AboutDialog : DialogFragment(){

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireActivity())
                .setTitle(R.string.app_name)
                .setMessage(R.string.author)
                .setPositiveButton(android.R.string.ok,null)
                .create()
    }
}