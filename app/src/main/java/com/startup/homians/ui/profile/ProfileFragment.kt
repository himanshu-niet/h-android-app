package com.startup.homians.ui.profile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.startup.homians.HelpCenter
import com.startup.homians.ProfileSetting
import com.startup.homians.R
import com.startup.homians.databinding.FragmentNotificationsBinding


class ProfileFragment : Fragment() {

    companion object {
        fun newInstance() = ProfileFragment()
    }

    private lateinit var viewModel: ProfileViewModel
    private lateinit var viewOfLayout: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewOfLayout = inflater.inflate(R.layout.fragment_profile, container, false)


        viewOfLayout.findViewById<LinearLayout>(R.id.profile_btn).setOnClickListener(View.OnClickListener {
            var intent=Intent(activity,ProfileSetting::class.java)
            startActivity(intent)
        })


        viewOfLayout.findViewById<LinearLayout>(R.id.help_center).setOnClickListener(View.OnClickListener {
                var intent=Intent(activity,HelpCenter::class.java)
            startActivity(intent)
        })  //add your view before id else will get nullpointer exception
        return viewOfLayout
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)





        // TODO: Use the ViewModel
    }


}