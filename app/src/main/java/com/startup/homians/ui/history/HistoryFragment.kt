package com.startup.homians.ui.history

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.startup.homians.comon.Cart
import com.startup.homians.comon.Location
import com.startup.homians.comon.Notification
import com.startup.homians.comon.Search
import com.startup.homians.databinding.FragmentNotificationsBinding

class HistoryFragment : Fragment() {

private var _binding: FragmentNotificationsBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val historysViewModel =
            ViewModelProvider(this).get(HistorysViewModel::class.java)

    _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
    val root: View = binding.root

      val loaction_btn:TextView=binding.locationBtn
      val search_btn: ImageView =binding.searchBtn
      val cart_btn: ImageView =binding.cartBtn
      val noti_btn: ImageView =binding.notificationBtn

      loaction_btn.setOnClickListener(View.OnClickListener {
          var intent= Intent(activity, Location::class.java)
          startActivity(intent)
      })

      search_btn.setOnClickListener(View.OnClickListener {
          var intent= Intent(activity, Search::class.java)
          startActivity(intent)
      })

      cart_btn.setOnClickListener(View.OnClickListener {
          var intent= Intent(activity, Cart::class.java)
          startActivity(intent)
      })

      noti_btn.setOnClickListener(View.OnClickListener {
          var intent= Intent(activity, Notification::class.java)
          startActivity(intent)
      })

      return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}