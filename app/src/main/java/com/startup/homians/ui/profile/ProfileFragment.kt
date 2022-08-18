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
import com.startup.homians.Policy
import com.startup.homians.ProfileSetting
import com.startup.homians.R
import com.startup.homians.databinding.FragmentFAQs2Binding
import com.startup.homians.databinding.FragmentNotificationsBinding
import com.startup.homians.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    companion object {
        fun newInstance() = ProfileFragment()
    }

    private lateinit var viewModel: ProfileViewModel
    private lateinit var viewOfLayout: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val profileSetting:LinearLayout=binding.profileBtn
        val helpBtn:LinearLayout=binding.helpBtn
        val policy:LinearLayout=binding.policy

        viewOfLayout = inflater.inflate(R.layout.fragment_profile, container, false)


        profileSetting.setOnClickListener(View.OnClickListener {
            var intent=Intent(activity,ProfileSetting::class.java)
            startActivity(intent)
        })


        helpBtn.setOnClickListener(View.OnClickListener {
                var intent=Intent(activity,HelpCenter::class.java)
            startActivity(intent)
        })

        policy.setOnClickListener(View.OnClickListener {
            var intent=Intent(activity,Policy::class.java)
            startActivity(intent)
        })
        //add your view before id else will get nullpointer exception

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)





        // TODO: Use the ViewModel
    }


}